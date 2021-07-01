package pjtTest;

public class Static_sub_class_base_study {
	String name;
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
	
}
