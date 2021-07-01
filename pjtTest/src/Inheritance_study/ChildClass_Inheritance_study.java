package Inheritance_study;

public class ChildClass_Inheritance_study extends ParentClass_Inheritance_study{
	
	int openYear = 1000;
	
	// ChildClass��, ParentClass�� ��ӹ޾ұ� ������, 
	// ParentClass�� �޼����� parentFun() �޼������ �̿��� �� �ִ�.
	public ChildClass_Inheritance_study() {
		System.out.println(" �ڽ�Ŭ���� ������ ");
		System.out.println(" �ڽ�Ŭ������ openyear"+ this.openYear);
		// this��, �� �ڽ�(��ü)�ȿ��� ���𰡸� ����ų�� ����Ѵ�
		System.out.println(" �θ�Ŭ������ openyear"+ super.openYear);
		// super��, ���� ��ӹ޴� �θ�Ŭ������ ���𰡸� ����ų �� ����Ѵ�.
		// �θ�Ŭ������ openYear�� �����Ѽ� ����Ѵ�.
	}
	
	public void childFun() {
		System.out.println("--childFun() START--");
	}
	
	// Override��, �θ�Ŭ������ ��ӹ޴� �ڽ�Ŭ������, �θ�Ŭ�������ִ� �޼��带 �������ؼ� ����ϴ°Ŵ�.
	// ���࿡ Override�����ʰ� MainClass���� �ش� �޼��带 child ��ä�� �̿��� ȣ���Ѵٸ�,
	// �θ�Ŭ������ �ִ� makeJjajang() �޼��尡 ȣ��� ���̴�.
	// ������ Override �Ͽ��� ������, �ڽ�Ŭ�������� �������� �ڽ�Ŭ������ �޼����� makeJjajang()�� ȣ��ȴ�.
	// �θ�Ŭ������ �޼���(���)�� �� �����ؼ� �ٸ��� ����ϴ°��� �޼��� �������̵��̴�.
	@Override
	public void makeJjajang() {
		System.out.println("FirstchildClass's makeJjajang()");
	}
}
