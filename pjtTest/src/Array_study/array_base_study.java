package Array_study;

import java.util.Arrays;
import java.util.Scanner;

public class array_base_study {

	public static void main(String[] args) {
		
		// �ڹٿ��� �迭�� ũ�⸦ �ѹ� ���ϸ� ũ�Ⱑ ������� �ʴ´�.
		
		// �迭 ���� �� �ʱ�ȭ�ϴ� ���
		int [] arr1 = new int[5]; // 5ĭ�� ������ arr1 �迭 ���� (�ε����� 0��°���� 4��°���� 5ĭ)
		arr1[0] = 100; // 0��° ��ġ�� 100
		arr1[1] = 200; // 1��° ��ġ�� 200
		arr1[2] = 300; 
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : "+ arr1[0]); // 0����� ( 100 ��� )
		System.out.println("arr1[1] : "+ arr1[1]); // 1����� ( 200 ��� )
		System.out.println("arr1[2] : "+ arr1[2]);
		System.out.println("arr1[3] : "+ arr1[3]);
		System.out.println("arr1[4] : "+ arr1[4]);

		
		// �迭�� ����� �ʱ�ȭ�� ���ÿ� �ϴ� ���
		int [] arr2 = {10, 20, 30, 40, 50};
		// int [] arr2 = new int[5]
		// arr2[0] = 10;
		// �̷������� �ѰͰ� �����ϴ�.
		
		System.out.println("arr2[0] : "+ arr2[0]); // 0����� ( 10 ��� )
		System.out.println("arr2[1] : "+ arr2[1]); // 1����� ( 20 ��� )
		System.out.println("arr2[2] : "+ arr2[2]);
		System.out.println("arr2[3] : "+ arr2[3]);
		System.out.println("arr2[4] : "+ arr2[4]);

		
		String[] name = {"����ȣ", "�̽¿�", "�ں�ȣ", "�̺���", "������"};
		int [] score = new int[5]; 
		// int�� �迭 5��, int�ϳ��� 4byte�� ������ 4*5 = 20byte, score�� �� 20byte�̴�.
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("%s�� ������ �Է��ϼ���",name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��ϼ���",name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��ϼ���",name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��ϼ���",name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �Է��ϼ���",name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s�� ���� : %.2f\n",name[0],(double)score[0]);
		System.out.printf("%s�� ���� : %.2f\n",name[1],(double)score[1]);
		System.out.printf("%s�� ���� : %.2f\n",name[2],(double)score[2]);
		System.out.printf("%s�� ���� : %.2f\n",name[3],(double)score[3]);
		System.out.printf("%s�� ���� : %.2f\n",name[4],(double)score[4]);
		
		double avg = (double)(score[0]+ score[1]+ score[2]+ score[3]+ score[4])/5;
		System.out.printf("���� : %.2f",avg);
		
		scanner.close();
		
		int [] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// �迭�� ���� ���ϱ�
		System.out.println("�迭 arrAtt1�� ���� : "+arrAtt1.length);
		
		// �迭 ��� ���
		System.out.println("�迭 arrAtt1�� ���� ��� : "+Arrays.toString(arrAtt1));
		
		// �迭 ��� ����
		// �����Ϸ��� �迭�� ���� ����, �� �迭�� ũ�⸦ ���´�. �׷��� arrAtt3�� arrAtt1�� ���� ����Ǿ� ����ȴ�.
		// �����Ͽ��� ���� ���� ������ �ִ� �ϴ���, �ٸ� �ּҸ� ������ �ִ� ���̴�. ������ �迭�� �ٸ� ��ġ�� �ִ�.
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		
		// �迭 ���۷���
		arrAtt2 = arrAtt1; // arrAtt1�� �޸� �ּҸ� arrAtt2�� �����Ѵ�.
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		// ���� arrAtt1�� arrAtt2�� ���� �ּҸ� ������ �ֱ� ������, ���� ���� ����Ѵ�.
		System.out.println("arrAtt2�� ���� ��� : " + Arrays.toString(arrAtt2));
		
		
		// 2���� �迭
		int [][] arrMul = new int [3][2]; // 3�� 2��¥�� �迭 ����
		arrMul[0][0] = 10; // 0�� 0���� 10 
		arrMul[0][1] = 20; // 0�� 1���� 20
		arrMul[1][1] = 11; // 1�� 1���� 11
		
		System.out.println(arrMul[1][1]); // 11���
		System.out.println(arrMul[0][0]); // 10���
	}
}
