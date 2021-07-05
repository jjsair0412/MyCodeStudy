package Networking_Study;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
	// ������ ������� �ڵ���, ServerSocket�� socket�� �Ѵ� �ʿ�������,
	// Ŭ���̾�Ʈ���� socket�� �����ϸ� �ȴ�.
	public static void main(String[] args) {
		
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		
		// ��Ʈ��ũ ��� ���̿� ��/�����, InputStream�� OutputStream�� �̿��ؼ� �����͸� �Է��ϰ� ����Ѵ�.
		// ������ �̿��ؼ� �����͸� �ְ�޴´�.
		// ���� ��� A�� ��� B�� ��Ʈ��ũ�� ����Ǿ��ִ� ���¿���, �Է°� ����� �Ѵٰ� �Ҷ�,
		// �����͸� �ְ�ޱ����� ��ġ�� �����̴�. (ex = ��ȭ��)
		
		ServerSocket serverSocket = null;
		// ServerSocket ���۷��� ����
		Socket socket = null;
		// Socket ���۷��� ����
		
		try {
			// ��Ʈ��ũ ���� �۾���, ����ó���� �ʼ��̴�.
			
			// ServerSoket�� ���۷����� �����Ҷ�, �ŰԺ����� ��Ʈ��ȣ�� �Է����ش�.
			
			// localhost�� ��Ʈ��ȣ 9000������ ������ ��û�Ѵ�.
			serverSocket = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ�� ���� �غ� �Ǿ����ϴ�!");
		
			// Ŭ���̾�Ʈ�� ��û�ϸ�, serverSoket�� accept()�� ����ǰ�, accept() �޼���� soket�� ��ȯ�Ѵ�.
			// ��û�� accept�� �޾Ƽ� socket�� �ִ´�.
			socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ����Ϸ�!!");
			
			// �������κ��� inputStream ��ü�� �����´�.
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			while(true) {
				String clientMassge = dataInputStream.readUTF();
				System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : "+ clientMassge);
				
				dataOutputStream.writeUTF("������ ���� �Ϸ�");
				dataOutputStream.flush();
				
				if(clientMassge.equals("stop")) {
					break;
				}
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket !=null) {
					socket.close();
				}
				if(serverSocket != null) {
					serverSocket.close();
				}
				if(dataOutputStream != null) {
					dataOutputStream.close();
				}
				if(inputStream != null) {
					inputStream.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
}
