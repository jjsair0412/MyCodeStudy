package Networking_Study;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MainClass_client {
	public static void main(String[] args) {
		
		Scanner sc = null;
		
		Socket socket = null;
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		
		try {
			socket = new Socket("localhost",9000);
			System.out.println("서버 연결 완료");
			System.out.println("Socket : "+ socket);
			
			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("메세지를 입력하세요");
				String str = sc.next();
				
				// 서버쪽으로 입력한 데이터를 보낸다.
				dataOutputStream.writeUTF(str);
				dataOutputStream.flush();
				
				if(str.equals("stop")) {
					break;
				}
				
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) {
					socket.close();
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
