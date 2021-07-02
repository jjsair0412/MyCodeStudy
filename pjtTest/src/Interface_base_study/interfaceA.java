package Interface_base_study;

// 클래스와 구조는 비슷하지만, 키워드가 class가 아닌 interface로 생성ㄴ
public interface interfaceA {

	public void funA(float data);
	// 인터페이스는, 어떠한 메소드를 생성만 하고 정의하지는 않는다.
	// 풀어서 funA()라는 메서드가 할 수 있는 기능을 정의하지 않고, 선언만해준다.
	// 그 후 , 해당 기능을 정의하는것은 interfaceA를 사용하는 class에서 기능을 정의한다.
	
}
