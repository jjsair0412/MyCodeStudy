package Abstract_Class_study;

public class MainClass {
	public static void main(String[] args) {
		ClassEx ex =  new ClassEx(10,"java");
		// ex��ü�� �����ϴ� ���ÿ�, ���� ����Ŭ������ Abstract_class�� �����ڰ� ���� ���� ȣ��� ��,
		// ClassEx�� �����ڰ� ȣ���..
		// �׸��� custom �����ڿ��� �Ķ���Ͱ��� �Ѱ��� ��,
		// super Ű���带 ����� ���� ����Ŭ������ Abstract_Class�� ���� ���޵�
		
		ex.fun1();
		// ���޵� ���� fun1() �޼��忡�� �α׷� ������ �ȴ�.
		
		System.out.println();
		
		ex.fun2();
		// Abstract_Class���� ���Ǹ� ���־��� fun2() �޼��带 
		// ClassEx���� override�Ͽ� ����� ������ ����� ȣ��
		
		
		// �������̽� vs �߻�Ŭ����
		// interface�� �������� ���� �� �ִ�.
		// interface�� ����� �߻�޼��常 ���� �� �ִ�.
		// �߻�Ŭ������ ���� ��Ӹ��� ���� �Ѵ�.
		// �߻�Ŭ������ Ŭ������ ������ ��� �Ӽ��� ����� ���� �� �ִ�.
	}
}
