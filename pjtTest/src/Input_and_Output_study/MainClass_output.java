package Input_and_Output_study;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass_output {
	public static void main(String[] args) {
		
		
		OutputStream outputStream = null;
		
		try {
			outputStream = new FileOutputStream("C:\\output_example\\output.txt");
			String str = "hello java";
			// 입력할 String에서, getBytes로 byte값을 뽑아와서 arr배열에 넣어준다.
			byte[] arr = str.getBytes();
			
			// arr에 넣어준 byte값을 outputStream의 write 매게변수 값으로 넣어준다.
			outputStream.write(arr,0,5);
			// write의 매게변수로 배열을 넣어줄 수 있다. 왼쪽부터 배열이름, 시작점, 길이를 지정해준다
			// 해당 글자의 0번째부터 5번째까지 입력
			// hello만 입력됨

//			outputStream.write(arr);
			// 그냥 배열만 넣어줄 수 있다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(outputStream != null)
			try {
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}
}