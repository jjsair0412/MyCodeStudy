package Lamdba_practice;

import java.util.Scanner;

public class Cal_MainClass {
	public static void main(String[] args) {
		
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� ! : ");
		Scanner sc1 = new Scanner(System.in);
		int fnum = sc1.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� ! : ");
		int snum = sc1.nextInt();
		
		if(fnum>=snum) {
		
		// ���ϱ�
		calculator_interface cal = (x,y)->{
			int result = x+y;
			return result;
		};
		System.out.printf("���� ��� : %d\n",cal.cal(fnum, snum));
		
		// ���ϱ�
		cal = (x,y) -> {
			int result = x*y;
			return result;
		};
		System.out.printf("���� ��� : %d\n",cal.cal(fnum, snum));
		
		// ����
		cal = (x,y) -> {
			int result = x-y;
			return result;
		};
		System.out.printf("�� ��� : %d\n",cal.cal(fnum, snum));
		
		// ������
		cal = (x,y) -> {
			int result = x/y;
			return result;
		};
		System.out.printf("���� ��� : %d\n",cal.cal(fnum, snum));
		
		}else {
			System.out.println("ù��° ���ڰ� �� Ŀ�� �մϴ�...");
			sc1.close();
		}
		sc1.close();
	}

}
