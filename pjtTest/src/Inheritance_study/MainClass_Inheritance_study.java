package Inheritance_study;

public class MainClass_Inheritance_study {
	public static void main(String[] args) {
		ChildClass_Inheritance_study child = new ChildClass_Inheritance_study();
		// childclass는 ParentClass를 상속받았기 때문에, 객체를 생성하는 동시에
		// ParentClass의 생성자를 호출한 뒤 ChildClass의 생성자를 호출한다.
		// 상속받고 있는 class의 생성자는, 상속해주는 class의 생성자가 먼저 호출된 이후에 호출된다.
		// 상속을 해주려면, 먼저 생성한 뒤에 주어야하기 때문이다.
		
		child.parentFun();
		// ParentClass를 ChildClass가 상속받앗기 때문에, parentFun() 메서드를 사용할 수 있다.
		
		child.childFun();
		
		// 자바는, 다중상속을 지원하지 않는다. 여러 클래스를 상속받을 수 없다.
		
//		child.privateFun();
		// 부모클래스를 상속받는다 하더라도, 부모 클래스의 private 접근제어자로 되어있는 기능들은 접근할 수 없다.
	}
}
