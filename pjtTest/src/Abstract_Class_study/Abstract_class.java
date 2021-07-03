package Abstract_Class_study;

public abstract class Abstract_class {
	// �߻�Ŭ������, �Ϲ� Ŭ������ ���������� �������, ������, �޼��带 ���� �� �ִ�.
	// ���� interface�� �����ϰ� �޼��带 ���Ǹ� �س���, 
	// ���� ����� �߻�Ŭ������ extends�� Ŭ�������� �����Ͽ� ����� �� �ִ�.
	
	int num;
	String str;
	
	public Abstract_class() {
		// �߻�Ŭ���� ������
		System.out.println("�߻� Ŭ���� ������ START");
	}
	
	public Abstract_class(int a, String b) {
		// �߻�Ŭ���� custom ������
		// �Ϲ� Ŭ������ �����ϰ� this Ű���带 ����� ��������� ���� ������ �� �ִ�.
		this.num = a;
		this.str = b;
	}
	
	public void fun1() {
		// �߻�Ŭ������ �޼���
		System.out.println("�߻�Ŭ���� fun1() START");
		System.out.println("�߻�Ŭ������ num : "+num);
		System.out.println("�߻�Ŭ������ str : "+str);
	}
	
	// interface�� �����ϰ� �߻�Ŭ���������� �޼��带 ���Ǹ� �Ͽ� ����� �� �ִ�.
	// interface�� implements Ű���带 ����ؼ� �������־����µ�,
	// �߻� Ŭ������ extends Ű���带 ����� �߻� Ŭ������ ��ӹ޾ƾ� ����� �� �ִ�.
	// ��ӹ��� Ŭ�������� , fun2()�޼��带 �������̵��� ����Ѵ�.
	public abstract void fun2();
}
