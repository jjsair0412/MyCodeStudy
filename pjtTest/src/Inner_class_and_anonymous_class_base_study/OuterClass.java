package Inner_class_and_anonymous_class_base_study;

public class OuterClass {
	
	// InnerClass��, Ŭ���� ���ο� �Ǵٸ� Ŭ������ �����ϴ°��̴�.
	
	int num = 10;
	String str1 = "java";
	static String str2 = "world";
	
	public OuterClass() {
		System.out.println("OuterClass ������");
	}
	
	class InnerClass{
		
		int num = 100;
		String str1  = str2;
		
		public InnerClass() {
			System.out.println("InnerClass ������");
		}
	}
	
	static class SInnerClass{
		
		int num = 1000;
		String str3 = str2;
		
		public SInnerClass() {
			System.out.println("static InnerClass ������");
		}
	}
	
	// Inner class�� ����ϸ�, ���� class�� ��������� ���� ������ �� �ִ�.
}
