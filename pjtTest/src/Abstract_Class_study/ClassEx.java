package Abstract_Class_study;

public class ClassEx extends Abstract_class{
	
	public ClassEx() {
		System.out.println("abstract_class�� ��ӹ޴� ClassEx�� ������ START");
	}
	
	public ClassEx(int a, String b) {
		// super Ű���带 ����ؼ�, Abstract_class�� �����ڿ� ���� ����
		super.num = a;
		super.str =b;
	}
	
	@Override
	public void fun2() {
		System.out.println("----fun2() �޼��� start----");
		System.out.println("ClassEx������ num : "+ super.num);
		System.out.println("ClassEx������ str : "+ super.str);
	}
	
	
	
}
