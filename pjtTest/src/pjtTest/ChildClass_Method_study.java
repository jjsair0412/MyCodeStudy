package pjtTest;

public class ChildClass_Method_study {
	public String name; // 멤버변수
	public String gender;
	public int age;
	
	
	public ChildClass_Method_study() {
		// 생성자 . 가장먼저 호출
		System.out.println("--ChildClass constructor 생성자 실행 -- ");
		
		mySecret(); // 접근제어자가 private이라 내부 클래스에서만 사용이 가능하다.
	}
	
	public void setInfo(String n, String g, int a) {
		// 매개변수(파라미터)로 name, gender, age를 받아와서, ChildClass_Method_study
		// 의  맴버변수에 넣는다.
		name = n; // name
		age = a; // age
		gender = g; // gender
	}
	
	public void getInfo() {
		// 메서드
		System.out.println("--getInfo() START--");
		System.out.println("name : "+ name);
		System.out.println("gender : "+ gender);
		System.out.println("age : "+ age);
		

	}
	
	public void getInfo(int i, int j) {
		// 메서드 이름이 중복된다고 하더라도, 파라미터값이 다르면 다른 메서드이다.
		// 메서드 이름을 중복시켜서 사용하려면 파라미터값이 달라야 한다.
		// 이것을 오버로딩이라고 한다. 한글로 중복 메서드라고도 한다.
		System.out.println("--getInfo(int i, int j) START--");
		System.out.printf("%d + %d = %d",i,j,(i+j));
	}
	
	public void getInfo(String a, String b) {
		System.out.println("--getInfo(String a, String b) START--");
		System.out.printf("%s와 %s는 친구다.",a,b);
	}
	
	// mySecret은 접근제어자중 다른 클래스에서 접근할 수 없게끔 하는 접근 제어자이다.
	// 외부에서 호출 할 수 없다.
	// public은 외부에서 호출할 수 있다.
	private void mySecret() {
		System.out.println(" -- mySecret() START -- ");
	}

}
