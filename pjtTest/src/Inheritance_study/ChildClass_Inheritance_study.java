package Inheritance_study;

public class ChildClass_Inheritance_study extends ParentClass_Inheritance_study{
	
	
	// ChildClass��, ParentClass�� ��ӹ޾ұ� ������, 
	// ParentClass�� �޼����� parentFun() �޼������ �̿��� �� �ִ�.
	public ChildClass_Inheritance_study() {
		System.out.println(" �ڽ�Ŭ���� ������ ");
	}
	
	public void childFun() {
		System.out.println("--childFun() START--");
	}
}
