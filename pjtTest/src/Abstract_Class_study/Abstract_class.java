package Abstract_Class_study;

public abstract class Abstract_class {
	// 추상클래스는, 일반 클래스와 마찬가지로 멤버변수, 생성자, 메서드를 가질 수 있다.
	// 또한 interface와 동일하게 메서드를 정의만 해놓고, 
	// 상세한 기능은 추상클래스를 extends한 클래스에서 정의하여 사용할 수 있다.
	
	int num;
	String str;
	
	public Abstract_class() {
		// 추상클래스 생성자
		System.out.println("추상 클래스 생성자 START");
	}
	
	public Abstract_class(int a, String b) {
		// 추상클래스 custom 생성자
		// 일반 클래스와 동일하게 this 키워드를 사용해 멤버변수에 값을 지정할 수 있다.
		this.num = a;
		this.str = b;
	}
	
	public void fun1() {
		// 추상클래스의 메서드
		System.out.println("추상클래스 fun1() START");
		System.out.println("추상클래스의 num : "+num);
		System.out.println("추상클래스의 str : "+str);
	}
	
	// interface와 동일하게 추상클래스에서도 메서드를 정의만 하여 사용할 수 있다.
	// interface는 implements 키워드를 사용해서 연결해주었엇는데,
	// 추상 클래스는 extends 키워드를 사용해 추상 클래스를 상속받아야 사용할 수 있다.
	// 상속받은 클래스에서 , fun2()메서드를 오버라이드해 사용한다.
	public abstract void fun2();
}
