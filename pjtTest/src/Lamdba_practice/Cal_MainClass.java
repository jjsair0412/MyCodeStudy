package Lamdba_practice;

import java.util.Scanner;

public class Cal_MainClass {
	public static void main(String[] args) {
		
		
		System.out.print("첫번째 숫자를 입력하세요 ! : ");
		Scanner sc1 = new Scanner(System.in);
		int fnum = sc1.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 ! : ");
		int snum = sc1.nextInt();
		
		if(fnum>=snum) {
		
		// 더하기
		calculator_interface cal = (x,y)->{
			int result = x+y;
			return result;
		};
		System.out.printf("더한 결과 : %d\n",cal.cal(fnum, snum));
		
		// 곱하기
		cal = (x,y) -> {
			int result = x*y;
			return result;
		};
		System.out.printf("곱한 결과 : %d\n",cal.cal(fnum, snum));
		
		// 빼기
		cal = (x,y) -> {
			int result = x-y;
			return result;
		};
		System.out.printf("뺀 결과 : %d\n",cal.cal(fnum, snum));
		
		// 나누기
		cal = (x,y) -> {
			int result = x/y;
			return result;
		};
		System.out.printf("나눈 결과 : %d\n",cal.cal(fnum, snum));
		
		}else {
			System.out.println("첫번째 숫자가 더 커야 합니다...");
			sc1.close();
		}
		sc1.close();
	}

}
