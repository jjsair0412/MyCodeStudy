package pjtTest;

public class MainClass_Method_study {
	public static void main(String[] args) {
		ChildClass_Method_study child1 = new ChildClass_Method_study();
		child1.getInfo();
		// ��ü�� �������ϰ�, ��������� ���������� �ʴ´ٸ�, String�̶�� null���� Int��� 0
		// �� ��µȴ�.
		
		System.out.println("\n");
		
		child1.age = 15;
		child1.gender = "boy";
		child1.name = "Hong";
		
		child1.getInfo();
		// �ش� Ŭ������ ��������� ���� �־��־ ���
		
		System.out.println("\n");
		
		child1.setInfo("Gill_Man", "Girl", 25);
		child1.getInfo();
		// �޼����� �Ķ���Ͱ����� ���� �����ؼ� ���
		
		// �ߺ� �޼��� �ǽ� 
		child1.getInfo(10, 20);
		
		System.out.println("\n");
		
		child1.getInfo("kIM", "Ju");
		
		
	}
}
