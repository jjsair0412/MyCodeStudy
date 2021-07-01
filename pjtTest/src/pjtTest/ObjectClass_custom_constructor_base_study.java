package pjtTest;

public class ObjectClass_custom_constructor_base_study {
	
	public int x;
	public int y;
	
	public ObjectClass_custom_constructor_base_study(String s, int[] i) {
		System.out.println("생성자 호출");
		
		System.out.println("s ---> "+ s);
		System.out.println("int[] i ----->" + i);
		
		// 만약 디폴트 생성자가 없다면, 컴파일러가 컴파일을 수행할 때, 자동으로 아무것도없는 생성자를 생성함.
		// 생성자 자체에서 파라미터값을 받아서 활용할 수 도 있다.
		// 이것을 사용자 정의 생성자라 한다.
		
	
	}
	public ObjectClass_custom_constructor_base_study(int x, int y) {
		// 해당 생성자에서 받아온 int x와 int y는 지역변수라 메모리에서 잠깐 담고있다가 사라진다.
		// 하지만 , 해당 클래스의 public int x, public int y는 멤버변수라서 전역으로 데이터를 가지고있다.
		// 지역변수에 받아온 int x와 int y를 전역변수 x,y에 담고싶다면,
//		x = x;
//		y = y;
		// 이렇게 표현할 수 있다. 그러나, 육안상으로 보았을때 헷갈릴 수 있다.
	    // 그래서 this 키워드를 사용한다.
		
		this.x = x;
		this.y = y;
		
		// this가 붙은 x는, ObjectClass_custom ''' 에서 작동하는 객체를 가르킨다.
		// 따라서 this.x는 전역변수 x이다.
		// this.y는 전역변수 y이다
		// x, y는 지역변수의 x, y를 나타낸다.
	}
	
	public void getInfo() {
		System.out.println("getInfo 메서드 호출");
		System.out.println("x --- > " + x);
		System.out.println("y --- > " + y);
	}
}
