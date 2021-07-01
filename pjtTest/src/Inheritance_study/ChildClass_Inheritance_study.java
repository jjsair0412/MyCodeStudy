package Inheritance_study;

public class ChildClass_Inheritance_study extends ParentClass_Inheritance_study{
	
	int openYear = 1000;
	
	// ChildClass는, ParentClass를 상속받았기 때문에, 
	// ParentClass의 메서드인 parentFun() 메서드까지 이용할 수 있다.
	public ChildClass_Inheritance_study() {
		System.out.println(" 자식클래스 생성자 ");
		System.out.println(" 자식클래스의 openyear"+ this.openYear);
		// this는, 나 자신(객체)안에서 무언가를 가르킬때 사용한다
		System.out.println(" 부모클래스의 openyear"+ super.openYear);
		// super는, 내가 상속받는 부모클래스의 무언가를 가르킬 때 사용한다.
		// 부모클래스의 openYear를 가르켜서 사용한다.
	}
	
	public void childFun() {
		System.out.println("--childFun() START--");
	}
	
	// Override는, 부모클래스를 상속받는 자식클래스가, 부모클래스에있는 메서드를 재정의해서 사용하는거다.
	// 만약에 Override하지않고 MainClass에서 해당 메서드를 child 객채를 이용해 호출한다면,
	// 부모클래스에 있는 makeJjajang() 메서드가 호출될 것이다.
	// 하지만 Override 하였기 때문에, 자식클래스에서 재정의한 자식클래스의 메서드인 makeJjajang()이 호출된다.
	// 부모클래스의 메서드(기능)을 재 정의해서 다르게 사용하는것이 메서드 오버라이드이다.
	@Override
	public void makeJjajang() {
		System.out.println("FirstchildClass's makeJjajang()");
	}
}
