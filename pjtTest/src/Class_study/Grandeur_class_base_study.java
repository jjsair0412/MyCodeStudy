package Class_study;

public class Grandeur_class_base_study {
	public String color; // ��� ����
	public String gear;
	public int price; 

	public Grandeur_class_base_study() { 
		// ������. �ش� Ŭ�������� ���� ���� ����Ǵ� �κ��̴�.
		// ����� ����� ���ٸ� ��ĭ���� ���ξ �ȴ�.
		System.out.println("Grandeur constructor ������ ����");
	}
	
	public void run() {
		// �޼���. �ش� Ŭ������ ����� ��Ÿ����.
		// run�޼��尡 ����Ǹ� ������ ��ɵ��� ����ȴ�.
		// public : ����������, void : ��ȯ���� ���ٴ� ��. return�� ����ؼ� ��ȯ���� 
		// String�̸� public String run(){}, return�� ��ȯ���� int��� public int run(){}
		System.out.println("-------run-------");
	}
	
	public void stop(){
		System.out.println("-------stop-------");
	}
	
	public void info() {
		System.out.println("Car Color : "+ color);
		System.out.println("Car gear : "+ gear);
		System.out.println("Car price : "+ price);
	}
}
