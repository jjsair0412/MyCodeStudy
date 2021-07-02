package Inner_class_and_anonymous_class_base_study;

public class OuterClass {
	
	// InnerClass는, 클래스 내부에 또다른 클래스가 존재하는것이다.
	
	int num = 10;
	String str1 = "java";
	static String str2 = "world";
	
	public OuterClass() {
		System.out.println("OuterClass 생성자");
	}
	
	class InnerClass{
		
		int num = 100;
		String str1  = str2;
		
		public InnerClass() {
			System.out.println("InnerClass 생성자");
		}
	}
	
	static class SInnerClass{
		
		int num = 1000;
		String str3 = str2;
		
		public SInnerClass() {
			System.out.println("static InnerClass 생성자");
		}
	}
	
	// Inner class를 사용하면, 여러 class의 멤버변수에 쉽게 접근할 수 있다.
}
