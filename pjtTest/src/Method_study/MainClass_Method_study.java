package Method_study;

public class MainClass_Method_study {
	public static void main(String[] args) {
		ChildClass_Method_study child1 = new ChildClass_Method_study();
		child1.getInfo();
		// ��ü�� �������ϰ�, ��������� ���������� �ʴ´ٸ�, String�̶�� null���� Int��� 0
		// �� ��µȴ�.
		
		System.out.println("\n");
		
		ChildClass_Method_study child2 = new ChildClass_Method_study();
		ChildClass_Method_study child3 = new ChildClass_Method_study();
		
		System.out.println("child1 ���۷����� ���� �ּ� : "+ child1);
		System.out.println("child2 ���۷����� ���� �ּ� : "+ child2);
		System.out.println("child3 ���۷����� ���� �ּ� : "+ child3);
		
		if(child1 == child2 ) {
			System.out.println("�ּҰ� ����");
		}else {
			System.out.println("�ּҰ� �ٸ���");
		}
		
		if(child2 == child3) {
			System.out.println("�ּҰ� ����");
		}else {
			System.out.println("�ּҰ� �ٸ���");
		}
		
		if(child1 == child3) {
			System.out.println("�ּҰ� ����");
		}else {
			System.out.println("�ּҰ� �ٸ���");
		}
		// ���δ� �ּҰ� �ٸ��� ���
		
		// child1����, childClass�� ��ü�� �ּҰ��� �������ִ�.
		// = ���Կ����ڰ� �ִٰ� �ؼ�, ����Ǿ��ִ°��� �ƴ϶�, �ּҸ� �������ִ�.
		// �̰��� ���۷������ �Ѵ�.
		// ����, ������ new�� ����ؼ� ���ο� ���۷����� ����� �Ǹ�, ���� Ŭ������ ������ ������ٰ� �Ͽ���
		// �ٸ� �ּҰ��� ������ �ִ�.
		// ��� ��ü�� ����Ű���ִ� ���۷����� ���ٸ�, GC�� �ش� ��ü�� �޸𸮿��� ȸ���ؼ� ����������.
		
		System.out.println("\n");
		
		child2.getInfo();
		// null�� ����Ǳ� ������ ���������� �޼��尡 ����ȴ�.
		
//		child2 = null;
//		child2.getInfo();
		// ���۷����� null�� ����� �Ŀ��� �ش� Ŭ������ �޼��尡 ������� �ʰ� nullpointerException ���� �߻�.
		
		// ���۷����� null�� �����Ѵٸ�, �� ���۷����� ��ü���� ������ ����� ���̻� ����� �� ����,
		// �������÷���(GC)�� �޸𸮿� null�� ����� ���۷����� ����Ű�� ��ü�� ������Ų���̱� ����,
		// ���� ���۷����� ��ü�� ������ ����ʹٸ� ���۷����� null�� �����ϸ� �ȴ�.
		
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
