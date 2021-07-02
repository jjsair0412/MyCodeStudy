package Interface_base_study;

// 인터페이스를 사용하는 이유는, 객체가 다양한 데이터 타입(자료형)을 가질 수 있기 때문이다.
// 인터페이스를 구현하기 위해서, implements키워드 뒤에 interface이름을 나열한다.
public class ImplementClass implements interfaceA, interfaceB{
	
	float a;
	public ImplementClass() {
		System.out.println("ImplementClass 생성자");
	}
	
	
	// interface에서 선언만 해주고 기능을 구현해주지 않은 메서드들을,
	// implements한 class에서 재정의해서 기능을 구현한다.
	@Override
	public void funA(float a) {
		this.a =a ;
		// interfaceA에 위치한 funA()
		System.out.println("funA() START");
	}
	
	@Override
	public float aListener() {
		// interfaceB에 위치한 funB()
		System.out.println("funB() START");
		return a;
	}
	
}
