package Abstract_Class_study;

public class ClassEx extends Abstract_class{
	
	public ClassEx() {
		System.out.println("abstract_class를 상속받는 ClassEx의 생성자 START");
	}
	
	public ClassEx(int a, String b) {
		// super 키워드를 사용해서, Abstract_class의 생성자에 값을 전달
		super.num = a;
		super.str =b;
	}
	
	@Override
	public void fun2() {
		System.out.println("----fun2() 메서드 start----");
		System.out.println("ClassEx에서의 num : "+ super.num);
		System.out.println("ClassEx에서의 str : "+ super.str);
	}
	
	
	
}
