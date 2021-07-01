package Class_study;

public class Grandeur_class_base_study {
	public String color; // 멤버 변수
	public String gear;
	public int price; 

	public Grandeur_class_base_study() { 
		// 생성자. 해당 클래스에서 가장 먼저 실행되는 부분이다.
		// 실행될 기능이 없다면 빈칸으로 놔두어도 된다.
		System.out.println("Grandeur constructor 생성자 실행");
	}
	
	public void run() {
		// 메서드. 해당 클래스의 기능을 나타낸다.
		// run메서드가 실행되면 내부의 기능들이 실행된다.
		// public : 접근제어자, void : 반환값이 없다는 뜻. return을 사용해서 반환값이 
		// String이면 public String run(){}, return에 반환값이 int라면 public int run(){}
		System.out.println("-------run-------");
	}
	
	public void stop(){
		System.out.println("-------stop-------");
	}
	
	public void info() {
		System.out.println("Car Color : "+ color);
		System.out.println("Car gear : "+ gear);
		System.out.println("Car price : "+ price);
	}
}
