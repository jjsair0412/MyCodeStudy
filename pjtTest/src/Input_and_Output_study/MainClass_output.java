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
			// �Է��� String����, getBytes�� byte���� �̾ƿͼ� arr�迭�� �־��ش�.
			byte[] arr = str.getBytes();
			
			// arr�� �־��� byte���� outputStream�� write �ŰԺ��� ������ �־��ش�.
			outputStream.write(arr,0,5);
			// write�� �ŰԺ����� �迭�� �־��� �� �ִ�. ���ʺ��� �迭�̸�, ������, ���̸� �������ش�
			// �ش� ������ 0��°���� 5��°���� �Է�
			// hello�� �Էµ�

//			outputStream.write(arr);
			// �׳� �迭�� �־��� �� �ִ�.
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