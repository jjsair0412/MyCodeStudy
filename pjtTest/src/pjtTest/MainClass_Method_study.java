package pjtTest;

public class MainClass_Method_study {
	public static void main(String[] args) {
		ChildClass_Method_study child1 = new ChildClass_Method_study();
		child1.getInfo();
		// 객체를 생성만하고, 멤버변수를 지정해주지 않는다면, String이라면 null값과 Int라면 0
		// 이 출력된다.
		
		System.out.println("\n");
		
		child1.age = 15;
		child1.gender = "boy";
		child1.name = "Hong";
		
		child1.getInfo();
		// 해당 클래스의 멤버변수에 직접 넣어주어서 사용
		
		System.out.println("\n");
		
		child1.setInfo("Gill_Man", "Girl", 25);
		child1.getInfo();
		// 메서드의 파라미터값으로 값을 전달해서 사용
		
		// 중복 메서드 실습 
		child1.getInfo(10, 20);
		
		System.out.println("\n");
		
		child1.getInfo("kIM", "Ju");
		
		
	}
}
