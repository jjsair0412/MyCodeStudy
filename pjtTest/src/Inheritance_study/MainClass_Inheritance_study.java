package Inheritance_study;

public class MainClass_Inheritance_study {
	public static void main(String[] args) {
		ChildClass_Inheritance_study child = new ChildClass_Inheritance_study();
		// childclass�� ParentClass�� ��ӹ޾ұ� ������, ��ü�� �����ϴ� ���ÿ�
		// ParentClass�� �����ڸ� ȣ���� �� ChildClass�� �����ڸ� ȣ���Ѵ�.
		// ��ӹް� �ִ� class�� �����ڴ�, ������ִ� class�� �����ڰ� ���� ȣ��� ���Ŀ� ȣ��ȴ�.
		// ����� ���ַ���, ���� ������ �ڿ� �־���ϱ� �����̴�.
		
		child.parentFun();
		// ParentClass�� ChildClass�� ��ӹ޾ѱ� ������, parentFun() �޼��带 ����� �� �ִ�.
		
		child.childFun();
		
		// �ڹٴ�, ���߻���� �������� �ʴ´�. ���� Ŭ������ ��ӹ��� �� ����.
		
//		child.privateFun();
		// �θ�Ŭ������ ��ӹ޴´� �ϴ���, �θ� Ŭ������ private ���������ڷ� �Ǿ��ִ� ��ɵ��� ������ �� ����.
	}
}
