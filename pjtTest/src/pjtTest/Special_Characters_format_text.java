package pjtTest;

public class Special_Characters_format_text {

	public static void main(String[] args) {
		
		System.out.println("Good\tMorning"); // ��
		System.out.println("Good\nMorning"); // ����
		System.out.println("\\'GoodMorning\\'"); // ��������ǥ ���
		System.out.println("\"GoodMorning\""); // ū����ǥ ���

		// ���Ĺ���
		// ���Ĺ��ڸ� ����ϱ� ���ؼ� printf�� ����Ѵ�. f�� format�� �����̴�.
		System.out.println("������ ����� 10�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n", 10);
		
		int num1 = 20;
		System.out.println("������ ����� " + num1 +"�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n", num1); // %d ���Ĺ��ڸ� ����ؾ� �ϱ� ������ printf�� ���
		System.out.printf("ȫ�浿's Info. : %d�г� %d�� %d��\n", 6, 2, 10);
		
		// ����
		int num2 = 30;
		System.out.printf("num2(10����) : %d\n", num2); // %d�� 10������ ��ȯ�ϴ� ���Ĺ���
		System.out.printf("num2(8����) : %o\n", num2); // %o�� 8������ ��ȯ�ϴ� ���Ĺ���
		System.out.printf("num2(16����) : %x\n", num2); // %x�� 16������ ��ȯ�ϴ� ���Ĺ���
		
		// ����
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n", 'a', 'A');
		
		// ���ڿ�
		System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n", "java", "JAVA");
		
		// �Ǽ�
		float f = 1.23f;
		System.out.printf("f = %f\n", f);
		double d = 1.23456d;
		System.out.printf("d = %f\n", d);
		
		// ���Ĺ��� ���� ���
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		
		System.out.println();
		
		// %5�� 5ĭ�� ������ ����� ���� ��, �����ʿ������� ä���� �����Ѵ�.
		// �����ϰ� %n�� n��ĭ�� ������ �������´�.
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		System.out.println();
		
		// ���Ĺ��� �Ҽ������� ���
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		// %.0f�� �Ҽ��� ���ڸ��� ���δ� ����
		System.out.printf("%.1f\n", 1.23);
		// %.1f�� �Ҽ��� ���ڸ� ù��°���� ����Ѵ�.
		System.out.printf("%.2f\n", 1.23);
		// %.2f�� �Ҽ��� ���ڸ� �ι�°���� ����Ѵ�.
		System.out.printf("%.3f\n", 1.23);	
		// �����ϱ� %.nf�� �Ҽ��� ���ڸ� n��°���� ����Ѵ�.
		
	}

}
