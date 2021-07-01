package Inheritance_study;

public class ChildClass_Inheritance_study extends ParentClass_Inheritance_study{
	
	
	// ChildClass는, ParentClass를 상속받았기 때문에, 
	// ParentClass의 메서드인 parentFun() 메서드까지 이용할 수 있다.
	public ChildClass_Inheritance_study() {
		System.out.println(" 자식클래스 생성자 ");
	}
	
	public void childFun() {
		System.out.println("--childFun() START--");
	}
}
