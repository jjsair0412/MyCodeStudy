package Abstract_Class_study;

public class MainClass {
	public static void main(String[] args) {
		ClassEx ex =  new ClassEx(10,"java");
		// ex객체를 생성하는 동시에, 가장 상위클래스인 Abstract_class의 생성자가 가장 먼저 호출된 후,
		// ClassEx의 생성자가 호출됨..
		// 그리고 custom 생성자에게 파라미터값을 넘겨준 후,
		// super 키워드를 사용해 가장 상위클래스인 Abstract_Class로 값이 전달됨
		
		ex.fun1();
		// 전달된 값은 fun1() 메서드에서 로그로 찍히게 된다.
		
		System.out.println();
		
		ex.fun2();
		// Abstract_Class에서 정의만 해주었던 fun2() 메서드를 
		// ClassEx에서 override하여 기능을 구현한 결과를 호출
		
		
		// 인터페이스 vs 추상클래스
		// interface는 다형성을 가질 수 있다.
		// interface는 상수와 추상메서드만 가질 수 있다.
		// 추상클래스는 단일 상속만을 지원 한다.
		// 추상클래스는 클래스가 가지는 모든 속성과 기능을 가질 수 있다.
	}
}
