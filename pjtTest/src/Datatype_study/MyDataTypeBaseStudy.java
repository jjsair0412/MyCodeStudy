package Datatype_study;

public class MyDataTypeBaseStudy {
	public static void main(String[] args) {
		
		char c = 'a';
		System.out.println("c = "+c);
	
		int i = 10;
		System.out.println("i = "+i);
		
		double d = 10.123;
		System.out.println("d = "+d);
		
		boolean b = true;
		System.out.println("b = "+b);
		
		String s = "Hello java world !!!"; 
		// String은 객체 자료형이다. s에는 지정된 문자열을 담을 수 있는 메모리의 주소값이 저장되어있다.
		System.out.println("s = "+s);
		
		s = "Good";
		System.out.println("s = "+s); // 변수의 담은 자료형은 언제든지 변환이 가능하다.
		
		
		// 자동(묵시적) 형 변환
		// 작은 공간의 메모리에서 큰 공간의 메모리로 변환
		byte by = 10;
		int in = by;
		System.out.println("in = "+in);
		
		//명시적 형 변환
		// 큰 공간의 메모리에서 작은 공간의 메모리로 변환
		int ivar = 100;
		byte bvar = (byte)ivar; // (byte)로 변환해서 bvar에 저장
		System.out.println("bvar = "+bvar); // 100 출력
		
		ivar = 123456;
		bvar = (byte)ivar; 
		// 명시적 형 변환을 수행했을 때, byte에 들어갈 수 있는 크기보다 int형에 들어가있는 값이 더 크기때문에
		// 데이터가 누실될 수 있다.
		System.out.println("bvar = "+bvar); // 64 출력
		
	}
}
