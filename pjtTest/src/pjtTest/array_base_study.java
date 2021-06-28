package pjtTest;

import java.util.Scanner;

public class array_base_study {

	public static void main(String[] args) {
		
		// 자바에선 배열의 크기를 한번 정하면 크기가 변경되지 않는다.
		
		// 배열 선언 후 초기화하는 방법
		int [] arr1 = new int[5]; // 5칸을 가지는 arr1 배열 선언 (인덱스는 0번째부터 4번째까지 5칸)
		arr1[0] = 100; // 0번째 위치에 100
		arr1[1] = 200; // 1번째 위치에 200
		arr1[2] = 300; 
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : "+ arr1[0]); // 0번출력 ( 100 출력 )
		System.out.println("arr1[1] : "+ arr1[1]); // 1번출력 ( 200 출력 )
		System.out.println("arr1[2] : "+ arr1[2]);
		System.out.println("arr1[3] : "+ arr1[3]);
		System.out.println("arr1[4] : "+ arr1[4]);

		
		// 배열의 선언과 초기화를 동시에 하는 방법
		int [] arr2 = {10, 20, 30, 40, 50};
		// int [] arr2 = new int[5]
		// arr2[0] = 10;
		// 이런식으로 한것과 동일하다.
		
		System.out.println("arr2[0] : "+ arr2[0]); // 0번출력 ( 10 출력 )
		System.out.println("arr2[1] : "+ arr2[1]); // 1번출력 ( 20 출력 )
		System.out.println("arr2[2] : "+ arr2[2]);
		System.out.println("arr2[3] : "+ arr2[3]);
		System.out.println("arr2[4] : "+ arr2[4]);

		
		String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"};
		int [] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("%s의 점수를 입력하세요",name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요",name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요",name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요",name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요",name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s의 점수 : %.2f\n",name[0],(double)score[0]);
		System.out.printf("%s의 점수 : %.2f\n",name[1],(double)score[1]);
		System.out.printf("%s의 점수 : %.2f\n",name[2],(double)score[2]);
		System.out.printf("%s의 점수 : %.2f\n",name[3],(double)score[3]);
		System.out.printf("%s의 점수 : %.2f\n",name[4],(double)score[4]);
		
		double avg = (double)(score[0]+ score[1]+ score[2]+ score[3]+ score[4])/5;
		System.out.printf("평점 : %.2f",avg);
		
		scanner.close();
	}
}
