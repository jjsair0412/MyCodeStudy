package Inheritance_study;

public class ParentClass_Inheritance_study {
	
	// 아무런 클래스를 상속받고 있지 않더라도 , 모든 클래스의 최상위 클래스는 java.lang.Object 클래스이다.
	int openYear = 2000;
	
	public ParentClass_Inheritance_study() {
		System.out.println(" 부모클래스 생성자 ");
	}
	
	public void parentFun() {
		System.out.println("--parentFun() START--");
	}
	
	private void privateFun() {
		System.out.println(" -- privateFun() START --");
	}
	
	public void makeJjajang() {
		System.out.println("ParentClass jjajang");
	}
}
