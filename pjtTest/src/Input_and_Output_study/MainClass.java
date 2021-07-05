package Input_and_Output_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {
	public static void main(String[] args) {
		/*
		// read
		// int로 읽어오기 때문에, byte 단위로 읽어온다.
		// 입력과 출력은 stream이란것이 생겨서 프로그램과 입/출력 대상 사이에 실행된다.
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
		// 읽혀온 데이터는, 아스키코드값으로 변환되어 읽어와진다.
		System.out.println("읽어온 data : "+ data);
	
		}
		*/
	
			// read(byte[])
			// 읽어오는것을 byte 배열 단위로 읽어올 수 있다.
			// 속도가 더 빠르다.
			InputStream inputStream = null;
			int data = 0;
			// 배열을 하나 선언해준다.
			byte[] bs = new byte[3];
			
			try {
				inputStream = new FileInputStream("C:\\Input_example\\hello.txt");
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
			while(true) {
				try {
					// 아까 byte로 선언해 주었던 배열을, read의 매게변수로 넣어준다.
					// 기존 read는 1byte씩 읽어왔엇는데, 이건 3byte씩 묶어서 읽어오는 형식이다.
					data = inputStream.read(bs);
				}catch(Exception e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println("byte[3] 단위로 읽어온 data : "+ data);
				for (int i = 0; i<=bs.length-1; i ++) {
					System.out.println("bs["+i+"] : "+ bs[i]);
				}
			}
			
	}	
		
}
