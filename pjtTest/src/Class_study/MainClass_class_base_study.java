package Class_study;

public class MainClass_class_base_study {

	public static void main(String[] args) {
		// ��� ���α׷���, main �޼������ ����ȴ�. main�� �� �ʿ��ϴ�.
		
		Grandeur_class_base_study gran = new Grandeur_class_base_study();
		// new�� ����ؼ� �ʱ�ȭ�ϰ� �����ϴ� ����. Grandeur_class_base_study Ŭ������ �����ڰ� ȣ��ȴ�.
		gran.color = "Red"; 
		// gran��, Grandeur_class'''�� ��ü�� �ּҸ� ����Ű�� �ִ�.
		// ���� ���۷������ ���� ����Ѵ�.
		// Grandeur Ŭ������ color�� Red�� �־��ش�.
		gran.gear = "auto";
		gran.price = 300000;
		
		gran.run();
		// Grandeur_class_base_studyd�� run �޼��尡 ȣ��ȴ�.
		gran.stop();
		// Grandeur_class_base_studyd�� stop �޼��尡 ȣ��ȴ�.
		gran.info();
		// Grandeur_class_base_studyd�� info �޼��尡 ȣ��ȴ�.
		
		System.out.println("\n");
		
		Grandeur_class_base_study gran2 = new Grandeur_class_base_study();
		// new �޼��带 ����ؼ� �ٽ� �ѹ� �ʱ�ȭ��Ű��, ������ �������־��� gran���� �ٸ� �޸𸮿� ����ȴ�
		gran2.color = "Black";
		gran2.gear = "Auto";
		gran2.price = 100000;
		
		gran2.run();
		gran2.stop();
		gran2.info();
		
		System.out.println("\n");
		
		bike_class_base_study bike = new bike_class_base_study("red",1000);
		// bike_class_base_study ������ ȣ���ϸ� �Ķ���Ͱ��� �����Ѵ�. String��, int��
		bike.info();
		// bike_class_base_study�� info �޼��� ȣ��
		// color�� red�� ȣ��
		
		bike.color = "yellow";
		// �ٽ� ���� ��������� ���� ��ȭ��ų �� �ִ�.
		
		bike.info();
		// color�� yellow�� ȣ��
		
	}

}
