package Method_study;

public class MainClass_Method_study {
	public static void main(String[] args) {
		ChildClass_Method_study child1 = new ChildClass_Method_study();
		child1.getInfo();
		// 객체를 생성만하고, 멤버변수를 지정해주지 않는다면, String이라면 null값과 Int라면 0
		// 이 출력된다.
		
		System.out.println("\n");
		
		ChildClass_Method_study child2 = new ChildClass_Method_study();
		ChildClass_Method_study child3 = new ChildClass_Method_study();
		
		System.out.println("child1 레퍼런스가 가진 주소 : "+ child1);
		System.out.println("child2 레퍼런스가 가진 주소 : "+ child2);
		System.out.println("child3 레퍼런스가 가진 주소 : "+ child3);
		
		if(child1 == child2 ) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		}
		
		if(child2 == child3) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		}
		
		if(child1 == child3) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		}
		// 전부다 주소가 다르다 출력
		
		// child1에는, childClass의 객체의 주소값을 가지고있다.
		// = 대입연산자가 있다고 해서, 저장되어있는것이 아니라, 주소를 가지고있다.
		// 이것을 레퍼런스라고 한다.
		// 따라서, 생성자 new를 사용해서 새로운 레퍼런스를 만들게 되면, 같은 클래스를 가지고 만들었다고 하여도
		// 다른 주소값을 가지고 있다.
		// 어떠한 객체를 가르키고있는 레퍼런스가 없다면, GC가 해당 객체를 메모리에서 회수해서 지워버린다.
		
		System.out.println("\n");
		
		child2.getInfo();
		// null이 저장되기 전에는 정상적으로 메서드가 실행된다.
		
//		child2 = null;
//		child2.getInfo();
		// 레퍼런스에 null이 저장된 후에는 해당 클래스의 메서드가 실행되지 않고 nullpointerException 오류 발생.
		
		// 레퍼런스에 null을 저장한다면, 그 레퍼런스는 객체와의 연결이 끊기고 더이상 사용할 수 없다,
		// 가비지컬렉터(GC)가 메모리에 null이 저장된 레퍼런스가 가르키는 객체를 삭제시킨것이기 때문,
		// 따라서 레퍼런스와 객체의 연결을 끊고싶다면 레퍼런스에 null을 저장하면 된다.
		
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
