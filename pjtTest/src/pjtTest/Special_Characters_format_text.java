package pjtTest;

public class Special_Characters_format_text {

	public static void main(String[] args) {
		
		System.out.println("Good\tMorning"); // 탭
		System.out.println("Good\nMorning"); // 개행
		System.out.println("\\'GoodMorning\\'"); // 작은따옴표 출력
		System.out.println("\"GoodMorning\""); // 큰따옴표 출력

		// 서식문자
		// 서식문자를 사용하기 위해선 printf를 사용한다. f는 format의 약자이다.
		System.out.println("오늘의 기온은 10도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", 10);
		
		int num1 = 20;
		System.out.println("오늘의 기온은 " + num1 +"도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", num1); // %d 서식문자를 사용해야 하기 때문에 printf를 사용
		System.out.printf("홍길동's Info. : %d학년 %d반 %d번\n", 6, 2, 10);
		
		// 정수
		int num2 = 30;
		System.out.printf("num2(10진수) : %d\n", num2); // %d는 10진수로 변환하는 서식문자
		System.out.printf("num2(8진수) : %o\n", num2); // %o는 8진수로 변환하는 서식문자
		System.out.printf("num2(16진수) : %x\n", num2); // %x는 16진수로 변환하는 서식문자
		
		// 문자
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'A');
		
		// 문자열
		System.out.printf("\'%s\'을 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");
		
		// 실수
		float f = 1.23f;
		System.out.printf("f = %f\n", f);
		double d = 1.23456d;
		System.out.printf("d = %f\n", d);
		
		// 서식문자 정렬 기능
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		
		System.out.println();
		
		// %5는 5칸의 공간을 만들어 놓은 후, 오른쪽에서부터 채워서 정렬한다.
		// 동일하게 %n은 n개칸의 공간을 만들어놓는다.
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		System.out.println();
		
		// 서식문자 소수점제한 기능
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		// %.0f은 소숫점 뒷자리를 전부다 제거
		System.out.printf("%.1f\n", 1.23);
		// %.1f는 소숫점 뒷자리 첫번째까지 출력한다.
		System.out.printf("%.2f\n", 1.23);
		// %.2f는 소수점 뒷자리 두번째까지 출력한다.
		System.out.printf("%.3f\n", 1.23);	
		// 동일하기 %.nf는 소숫점 뒷자리 n번째까지 출력한다.
		
	}

}
