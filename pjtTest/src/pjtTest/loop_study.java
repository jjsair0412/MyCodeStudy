package pjtTest;

import java.util.Scanner;

public class loop_study {

	public static void main(String[] args) {
		System.out.printf("(for) INPUT NUMBER : ");
		Scanner sca = new Scanner(System.in);
		int inputnum = sca.nextInt();
		
		for(int i = 1; i<10; i++) {
			// i�� 1���� 9���� ����. 
			System.out.printf("%d * %d = %d\n",inputnum,i,(i*inputnum));
		}
		
		System.out.print("(while) INPUT NUMBER : ");
		int inputnum2 = sca.nextInt();
		int i = 1;
		while(i < 10) {
			System.out.printf("%d * %d = %d\n",inputnum2,i,(inputnum2*i));
			i++;
		}
	
		
		
		do {
			// do while����, while���� ����ִ� ���ǽ��� false�̴� true�̴� ������ �ѹ��� �����Ѵ�.
			// �� �� ���ǹ��� ���� false�ϰ�� �ݺ��� �����Ѵ�.
			System.out.println("������ 1���� �����մϴ�.");
		}while(false);
	
	}

}
