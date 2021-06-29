package pjtTest;

public class bike_class_base_study {

	public String color; // 멤버변수
	public int price;
	
	public bike_class_base_study() {
		// 생성자
		System.out.printf("bike!!,%s,%d");
	}
	
	public bike_class_base_study(String c, int p) {
		// 생성자에서 파라미터값을 받아서 사용할 수 있다. 파라미터값이 다르다면 다른 생성자이다.
		System.out.println("bike!! - 2");
		color = c; 
		// 받아온 파라미터값을, bike_class_base_study클래스 멤버변수인 color에 대입
		price = p; 
		// 받아온 파라미터값을, bike_class_base_study클래스 멤버변수인 price에 대입
	}
	
	public void info() {
		// 메서드
		System.out.println("---info---");
		System.out.println("color : "+ color);
		System.out.println("price : "+ price);
	
	}
}
