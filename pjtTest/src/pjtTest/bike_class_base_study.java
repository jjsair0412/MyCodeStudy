package pjtTest;

public class bike_class_base_study {

	public String color; // �������
	public int price;
	
	public bike_class_base_study() {
		// ������
		System.out.printf("bike!!,%s,%d");
	}
	
	public bike_class_base_study(String c, int p) {
		// �����ڿ��� �Ķ���Ͱ��� �޾Ƽ� ����� �� �ִ�. �Ķ���Ͱ��� �ٸ��ٸ� �ٸ� �������̴�.
		System.out.println("bike!! - 2");
		color = c; 
		// �޾ƿ� �Ķ���Ͱ���, bike_class_base_studyŬ���� ��������� color�� ����
		price = p; 
		// �޾ƿ� �Ķ���Ͱ���, bike_class_base_studyŬ���� ��������� price�� ����
	}
	
	public void info() {
		// �޼���
		System.out.println("---info---");
		System.out.println("color : "+ color);
		System.out.println("price : "+ price);
	
	}
}
