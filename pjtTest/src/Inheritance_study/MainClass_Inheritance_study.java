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
	
		child.makeJjajang();
		
		ParentClass_Inheritance_study par[] = new ParentClass_Inheritance_study[2];
		// Class의 이름또한 int나 short와 같은 데이터 타입이다.
		// 따라서 레퍼런스자체가 배열이 될 수 있다.
		// 객체를 생성하면서 배열로 만드는중
		
		par[0] = new ChildClass_Inheritance_study();
		par[1] = new SecondChildClass_Inheritance_study();
		// 배열로 담을때, ParentClass를 상속받는 firstChild와 secondChild class 모두
		// ParentClass를 상속받고 있기 때문에, ParentClass의 레퍼런스배열인 par[]에 정상적으로 담길 수 있다.
		
		for( int i = 0; i<=1; i++) { // 배열에 2칸있기때문에, 0,1 두번돔
			par[i].makeJjajang();
			// par[] 배열에 저장되어있는 첫번째 childclass의 재정의된 메서드인 makeJjajang()과
			// SecondChildClass의 재정의된 메서드인 makeJjajang()을 순서대로 출력한다.
		}
		
		System.out.println("\n");
		
		ParentClass_Inheritance_study fch = new ChildClass_Inheritance_study();
		System.out.println("--------");
		ParentClass_Inheritance_study sch = new SecondChildClass_Inheritance_study();
		// 최상위 클래스인 ParentClass를 객체로 만들어도, 해당 클래스를 상속받는 모든 클래스로
		// 객체로 만들 수 있다.
		// 이렇게 만들어주면, 먼저 부모클래스의 생성자가 호출되고, 그 다음 new 메서드로 가져온 자식클래스의 생성자가 호출된다.
		
		
	}
}
