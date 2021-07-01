package Static_study;

public class Static_sub_class_base_study {
//	public String name;
	// public의 문제점은, 다른 클래스에서 접근이 자유롭다는게 문제가 된다.
	// 언제어디서든 해당 멤버변수를 변질시킬수 있기 때문이다.
	// 데이터를 외부로부터 보호하기 위해서 이런 변수는 private로 만들어준다.
	private String name;
	static int amount = 0;
	
	// 멤버변수에 static 키워드를 사용한다면, 여러 객체가 생성되어서 다른 메모리에 존재하더라도,
	// static키워드가 붙어있는 멤버변수는 다른 객체에서도 공유가 가능하다.
	
	public Static_sub_class_base_study(String Cusname) {
		this.name =Cusname;
	}
	
	public void saveMoney(int money) {
		amount += money;
		System.out.println("amount : "+ amount);
	}
	
	public void spendMoney(int money) {
		amount -= money;
		System.out.println("amount : "+ amount);
	}
	
	public void getInfo() {
		System.out.println("고객 이름 : "+ name);
		System.out.println("계좌 잔액 : "+ amount);
	}

	// private로 막아놓은 변수는, 외부 클래스에서 접근할 수 없다. 
	// 그런데 해당 변수값을 외부 클래스에서 접근할 필요가 있을 때, get,set 메서드를 사용한다.
	public String getName() {
		// 속성의 데이터를 반환한다.
		return name;
	}

	public void setName(String name) {
		// 속성 데이터를 넣어준다.
		// get set을 활용했을때의 장점은, 제약조건을 넣어줄 수 있다는 것이다.
		this.name = name;	
	}
}
