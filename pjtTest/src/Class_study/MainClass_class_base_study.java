package Class_study;

public class MainClass_class_base_study {

	public static void main(String[] args) {
		// 모든 프로그램은, main 메서드부터 실행된다. main은 꼭 필요하다.
		
		Grandeur_class_base_study gran = new Grandeur_class_base_study();
		// new를 사용해서 초기화하고 생성하는 순간. Grandeur_class_base_study 클래스의 생성자가 호출된다.
		gran.color = "Red"; 
		// gran은, Grandeur_class'''의 객체의 주소를 가르키고 있다.
		// 따라서 레퍼런스라는 말을 사용한다.
		// Grandeur 클래스의 color에 Red를 넣어준다.
		gran.gear = "auto";
		gran.price = 300000;
		
		gran.run();
		// Grandeur_class_base_studyd의 run 메서드가 호출된다.
		gran.stop();
		// Grandeur_class_base_studyd의 stop 메서드가 호출된다.
		gran.info();
		// Grandeur_class_base_studyd의 info 메서드가 호출된다.
		
		System.out.println("\n");
		
		Grandeur_class_base_study gran2 = new Grandeur_class_base_study();
		// new 메서드를 사용해서 다시 한번 초기화시키면, 일전에 생성해주었던 gran과는 다른 메모리에 저장된다
		gran2.color = "Black";
		gran2.gear = "Auto";
		gran2.price = 100000;
		
		gran2.run();
		gran2.stop();
		gran2.info();
		
		System.out.println("\n");
		
		bike_class_base_study bike = new bike_class_base_study("red",1000);
		// bike_class_base_study 생성자 호출하며 파라미터값을 전달한다. String값, int값
		bike.info();
		// bike_class_base_study의 info 메서드 호출
		// color가 red로 호출
		
		bike.color = "yellow";
		// 다시 직접 멤버변수에 값을 변화시킬 수 있다.
		
		bike.info();
		// color가 yellow로 호출
		
	}

}
