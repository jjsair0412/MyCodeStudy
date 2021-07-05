package Input_and_Output_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		/*
		// read
		// int�� �о���� ������, byte ������ �о�´�.
		// �Է°� ����� stream�̶����� ���ܼ� ���α׷��� ��/��� ��� ���̿� ����ȴ�.
		InputStream inputStream = null;
		int data = 0;
		try {
			inputStream = new FileInputStream("C:\\Input_example\\hello.txt");	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		while(true){
		try {
				data = inputStream.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (data == -1) break;
		// ������ �����ʹ�, �ƽ�Ű�ڵ尪���� ��ȯ�Ǿ� �о������.
		System.out.println("�о�� data : "+ data);
	
		}
		*/
	
			// read(byte[])
			// �о���°��� byte �迭 ������ �о�� �� �ִ�.
			// �ӵ��� �� ������.
			InputStream inputStream = null;
			int data = 0;
			// �迭�� �ϳ� �������ش�.
			byte[] bs = new byte[3];
			
			try {
				inputStream = new FileInputStream("C:\\Input_example\\hello.txt");
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
			while(true) {
				try {
					// �Ʊ� byte�� ������ �־��� �迭��, read�� �ŰԺ����� �־��ش�.
					// ���� read�� 1byte�� �о�Ծ��µ�, �̰� 3byte�� ��� �о���� �����̴�.
					data = inputStream.read(bs);
				}catch(Exception e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println("byte[3] ������ �о�� data : "+ data);
				for (int i = 0; i<=bs.length-1; i ++) {
					System.out.println("bs["+i+"] : "+ bs[i]);
				}
			}
			
	}	
		
}
