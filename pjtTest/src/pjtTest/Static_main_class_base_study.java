package pjtTest;

import java.util.Scanner;
// �ٸ� ��Ű���� �����ϴ� Scanner�� ����ϱ� ����, import Ű���带 ����ߴ�.
// Scanner�� java => util ������ ��ġ�Ѵ�.

public class Static_main_class_base_study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �̸��� �Է����ּ��� : ");
		
		String Cusname = sc.next();
		Static_sub_class_base_study sub = new Static_sub_class_base_study(Cusname);
		
		
		sub.getInfo();
		
		System.out.print("�ι�° �� �̸��� �Է����ּ��� : ");
		
		String secondCusname = sc.next();
		
		Static_sub_class_base_study sub2 = new Static_sub_class_base_study(secondCusname);
		
		sub2.getInfo();
		System.out.println("\n");
		
		System.out.printf("%s ����, �� �����Ͻðڽ��ϱ� ? : ", Cusname);
		int SaveMoney = sc.nextInt();
		
		sub.saveMoney(SaveMoney);
		sub.getInfo();
		
		System.out.println("\n");

		System.out.printf("%s ����, �� �����Ͻðڽ��ϱ� ? : ",secondCusname);
		int SaveMoney2 = sc.nextInt();
		
		sub2.saveMoney(SaveMoney2);
		sub2.getInfo();
		
		// ��������� static Ű���带 ����Ѵٸ�, ���� ��ü�� �����Ǿ �ٸ� �޸𸮿� �����ϴ���,
		// staticŰ���尡 �پ��ִ� ��������� �ٸ� ��ü������ ������ ������ �����ϴ�.
		// amount�� �����ؼ�, �� ��ü�� ���� ���� �����Ѵ�.
		
	}
}
