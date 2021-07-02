package Interface_base_study;

public class MainClass {	
	public static void main(String[] args) {
	
		interfaceA ia = new ImplementClass();
		// ia의 객체타입은 interfaceA이다.
		// 따라서 ia 레퍼런스에 접근할 수 있는 메서드는 funA()가 유일하다.
		// 왜냐하면 객체타입이 interfaceA니까 interfaceB에 위치한 메서드는 접근할 수 없다.
		interfaceB ib = new ImplementClass();
		// ib의 객체타입도 동일하게 interfaceB이다.
		
		ia.funA();
		
		
		ib.funB();
	
		ImplementClass im = new ImplementClass();
		im.funA();
		im.funB();
		
	}

}
