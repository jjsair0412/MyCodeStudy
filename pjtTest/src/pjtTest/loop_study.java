package pjtTest;

import java.util.Scanner;

public class loop_study {

	public static void main(String[] args) {
		System.out.printf("(for) INPUT NUMBER : ");
		Scanner sca = new Scanner(System.in);
		int inputnum = sca.nextInt();
		
		for(int i = 1; i<10; i++) {
			// i가 1부터 9까지 증가. 
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
			// do while문은, while문에 들어있는 조건식이 false이던 true이던 무조건 한번은 실행한다.
			// 그 후 조건문을 보고 false일경우 반복을 종료한다.
			System.out.println("무조건 1번은 실행합니다.");
		}while(false);
	
	}

}
