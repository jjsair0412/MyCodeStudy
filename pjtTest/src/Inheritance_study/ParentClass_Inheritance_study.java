package Inheritance_study;

public class ParentClass_Inheritance_study {
	
	// �ƹ��� Ŭ������ ��ӹް� ���� �ʴ��� , ��� Ŭ������ �ֻ��� Ŭ������ java.lang.Object Ŭ�����̴�.
	int openYear = 2000;
	
	public ParentClass_Inheritance_study() {
		System.out.println(" �θ�Ŭ���� ������ ");
	}
	
	public void parentFun() {
		System.out.println("--parentFun() START--");
	}
	
	private void privateFun() {
		System.out.println(" -- privateFun() START --");
	}
	
	public void makeJjajang() {
		System.out.println("ParentClass jjajang");
	}
}
