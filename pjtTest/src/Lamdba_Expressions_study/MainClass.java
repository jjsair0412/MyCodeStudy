package Lamdba_Expressions_study;

public class MainClass {
	public static void main(String[] args) {
		
		// ������ �������̽��� ����ϱ� ���ؼ�, ���۷����� ������ ��, 
		// ������Ÿ���� �������̽��� �ϰ�, interface�� implements�� class����
		// �ش� interface �޼����� �� ����� ������ ��,
		// implements�� Ŭ������ new Ű���带 ����� �ʱ�ȭ�������μ� ����ߴ�.
		
		// �׷��� ���ٽ���, implements�Ͽ� �������̽��� ����� �������ϴ� �κ��� �����ϰ�
		// MainClass���� ������Ÿ���� �������̽��� �� ����, 
		// interface���� �����س��� ������Ÿ���� �������� , -> ��� Ű���带 �����
		// ��� ����� �� �� �ۼ��Ѵ�.
		Lamdba_interface li1 = (String s1, String s2, String s3) -> 
		{System.out.println(s1+" "+s2+" "+s3);};
		// �� ��, �������� ���۷����� ���������ڷ�(.) �������̽� �޼��带 �ҷ�����
		// �Ķ���Ͱ��� �ۼ������μ� ����Ѵ�.
		li1.method("Hello", "java", "word");
		li1.method("new", "Lamdba", "Expressions");
		
		System.out.println();
		
		// interface�� �޼����� �Ķ���Ͱ� �Ѱ��̰ų�, ��� Ÿ���� ������ ������ Ÿ���� ������ �� �ִ�.
		Lamdba_interface2 li2 = (s1) -> {System.out.println(s1);};
		li2.method("�Ķ���Ͱ� �Ѱ��̰ų� ��� Ÿ���� ������");
		
		System.out.println();
		
		// ���๮�� �Ѱ��϶��� {} �߰�ȣ�� ������ �� �ִ�.
		Lamdba_interface2 li3 = (s1) -> System.out.println(s1);
		li3.method("���๮�� �Ѱ��� ��");
		
		System.out.println();
		
		// ���๮�� �Ű������� �Ѱ��϶�, ()�� {}�� ������ �� �ִ�.
		Lamdba_interface2 li4 = s1 -> System.out.println(s1);
		li4.method("���๮�� �Ѱ��̰� �ްԺ����� �Ѱ��϶�");
		
		System.out.println();
		
		// �ŰԺ����� ������, �߰�ȣ () �� �ۼ��Ѵ�
		Lamdba_interface3 li5 = () -> System.out.println("no parameter");
		li5.method();
		
		System.out.println();
		
		
		// ��ȯ���� �ִ� ���
		// �������� ���۷����� ����ؼ� ��ȯ��Ű�� �����ϰ� ����� �� �ִ�
		Lamdba_interface4 li6 = (x,y) -> {
			int result = x + y;
			return result;
		};
		System.out.printf("li6.method(10,20)  + : %d\n",li6.method(10, 20));
		
		li6 = (x,y) -> {
			int result = x * y;
			return result;
		};
		System.out.printf("li6.method(10,20) * : %d",li6.method(10, 20));
		
		
	}
}
