package Array_study;

import java.util.Arrays;
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
		// int형 배열 5개, int하나가 4byte기 때문에 4*5 = 20byte, score는 총 20byte이다.
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
		
		int [] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// 배열의 길이 구하기
		System.out.println("배열 arrAtt1의 길이 : "+arrAtt1.length);
		
		// 배열 요소 출력
		System.out.println("배열 arrAtt1의 값들 출력 : "+Arrays.toString(arrAtt1));
		
		// 배열 요소 복사
		// 복사하려는 배열을 먼저 적고, 그 배열의 크기를 적는다. 그러면 arrAtt3에 arrAtt1의 값이 복사되어 저장된다.
		// 복사하여서 같은 값을 가지고 있다 하더라도, 다른 주소를 가지고 있는 것이다. 각각의 배열은 다른 위치에 있다.
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		
		// 배열 레퍼런스
		arrAtt2 = arrAtt1; // arrAtt1의 메모리 주소를 arrAtt2에 저장한다.
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		// 따라서 arrAtt1과 arrAtt2는 같은 주소를 가지고 있기 때문에, 같은 값을 출력한다.
		System.out.println("arrAtt2의 값들 출력 : " + Arrays.toString(arrAtt2));
		
		
		// 2차원 배열
		int [][] arrMul = new int [3][2]; // 3행 2열짜리 배열 생성
		arrMul[0][0] = 10; // 0행 0열에 10 
		arrMul[0][1] = 20; // 0행 1열에 20
		arrMul[1][1] = 11; // 1행 1열에 11
		
		System.out.println(arrMul[1][1]); // 11출력
		System.out.println(arrMul[0][0]); // 10출력
	}
}
