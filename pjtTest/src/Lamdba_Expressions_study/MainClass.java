package Lamdba_Expressions_study;

public class MainClass {
	public static void main(String[] args) {
		
		// 기존에 인터페이스를 사용하기 위해서, 레퍼런스를 생성할 때, 
		// 데이터타입을 인터페이스로 하고, interface를 implements한 class에서
		// 해당 interface 메서드의 상세 기능을 정의한 후,
		// implements한 클래스를 new 키워드를 사용해 초기화해줌으로서 사용했다.
		
		// 그러나 람다식은, implements하여 인터페이스의 기능을 재정의하는 부분을 생략하고
		// MainClass에서 데이터타입을 인터페이스로 준 다음, 
		// interface에서 정의해놓은 데이터타입을 지정한후 , -> 라는 키워드를 사용해
		// 어떠한 기능을 할 지 작성한다.
		Lamdba_interface li1 = (String s1, String s2, String s3) -> 
		{System.out.println(s1+" "+s2+" "+s3);};
		// 그 후, 만들어놓은 레퍼런스의 참조연산자로(.) 인터페이스 메서드를 불러오고
		// 파라미터값을 작성함으로서 사용한다.
		li1.method("Hello", "java", "word");
		li1.method("new", "Lamdba", "Expressions");
		
		System.out.println();
		
		// interface의 메서드의 파라미터가 한개이거나, 모두 타입이 같을때 데이터 타입을 생략할 수 있다.
		Lamdba_interface2 li2 = (s1) -> {System.out.println(s1);};
		li2.method("파라미터가 한개이거나 모두 타입이 같을때");
		
		System.out.println();
		
		// 실행문이 한개일때는 {} 중괄호를 생략할 수 있다.
		Lamdba_interface2 li3 = (s1) -> System.out.println(s1);
		li3.method("실행문이 한개일 때");
		
		System.out.println();
		
		// 실행문과 매개변수가 한개일때, ()과 {}를 생략할 수 있다.
		Lamdba_interface2 li4 = s1 -> System.out.println(s1);
		li4.method("실행문이 한개이고 메게변수가 한개일때");
		
		System.out.println();
		
		// 매게변수가 없을때, 중괄호 () 만 작성한다
		Lamdba_interface3 li5 = () -> System.out.println("no parameter");
		li5.method();
		
		System.out.println();
		
		
		// 반환값이 있는 경우
		// 언제든지 레퍼런스를 사용해서 변환시키며 유연하게 사용할 수 있다
		Lamdba_interface4 li6 = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.printf("li6.method(10,20)  + : %d\n",li6.method(10, 20));
		
		li6 = (x,y) -> {
			int result = x * y;
			return result;
		};
		System.out.printf("li6.method(10,20) * : %d",li6.method(10, 20));
		
		
	}
}
