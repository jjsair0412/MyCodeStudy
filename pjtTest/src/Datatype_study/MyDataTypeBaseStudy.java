package Datatype_study;

public class MyDataTypeBaseStudy {
	public static void main(String[] args) {
		
		char c = 'a';
		System.out.println("c = "+c);
	
		int i = 10;
		System.out.println("i = "+i);
		
		double d = 10.123;
		System.out.println("d = "+d);
		
		boolean b = true;
		System.out.println("b = "+b);
		
		String s = "Hello java world !!!"; 
		// String�� ��ü �ڷ����̴�. s���� ������ ���ڿ��� ���� �� �ִ� �޸��� �ּҰ��� ����Ǿ��ִ�.
		System.out.println("s = "+s);
		
		s = "Good";
		System.out.println("s = "+s); // ������ ���� �ڷ����� �������� ��ȯ�� �����ϴ�.
		
		
		// �ڵ�(������) �� ��ȯ
		// ���� ������ �޸𸮿��� ū ������ �޸𸮷� ��ȯ
		byte by = 10;
		int in = by;
		System.out.println("in = "+in);
		
		//����� �� ��ȯ
		// ū ������ �޸𸮿��� ���� ������ �޸𸮷� ��ȯ
		int ivar = 100;
		byte bvar = (byte)ivar; // (byte)�� ��ȯ�ؼ� bvar�� ����
		System.out.println("bvar = "+bvar); // 100 ���
		
		ivar = 123456;
		bvar = (byte)ivar; 
		// ����� �� ��ȯ�� �������� ��, byte�� �� �� �ִ� ũ�⺸�� int���� ���ִ� ���� �� ũ�⶧����
		// �����Ͱ� ���ǵ� �� �ִ�.
		System.out.println("bvar = "+bvar); // 64 ���
		
	}
}
