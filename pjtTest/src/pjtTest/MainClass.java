package pjtTest;

public class MainClass {
	public static void main(String[] args) { 
		// main 메서드는 자바 프로그램이 실행될때 가장 먼저 실행되는 메서드이다.
		
		System.out.println("hello wolrd!!");
		
		int i = 10;
		int j;
		j = 100;
		
		
		i = 200; // 다시 초기화되어 i에는 200이 저장됨.
		System.out.println("i + j = "+(i+j)); // 300 출력.
		
		int num = 10;
		System.out.println("num : "+ num); // 10 출력
		
		num = 100;
		System.out.println("num : "+ num); // 100 출력

		num = 1000;
		System.out.println("num : "+ num); // 1000 출력
	
		num = 10000;
		System.out.println("num : "+ num); // 10000 출력
		
		// 변수는 재활용 하기 위해 사용한다. 저장해두엇다가 다시 사용하기 위해서 사용한다.
	
	}
}
