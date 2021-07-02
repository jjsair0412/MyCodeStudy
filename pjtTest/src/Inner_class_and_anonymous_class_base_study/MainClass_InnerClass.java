package Inner_class_and_anonymous_class_base_study;


public class MainClass_InnerClass {
	
	public static void main(String[] args) {
		OuterClass outclass = new OuterClass();
		System.out.println("OuterClass�� num : "+ outclass.num);
		System.out.println("OuterClass�� str1 : "+ outclass.str1);
		
		System.out.println();
		
		// ����Ŭ���� ��ü �������
		OuterClass.InnerClass In = outclass.new InnerClass();
		System.out.println("InnerClass�� num : "+ In.num);
		System.out.println("InnerClass�� str1 : "+ In.str1);
		
		System.out.println();
		
		//Static InnerClass ��ü ����
		OuterClass.SInnerClass sIn = new OuterClass.SInnerClass();
		System.out.println("Static InnerClass�� num : "+ sIn.num);
		System.out.println("Static InnerClass�� str3 : "+ sIn.str3);
		
		System.out.println();
		
		// �̸��� ���� Ŭ�����̱⶧����, �͸� Ŭ�����̴�.( AnonymousClass )������ ��ü�� �����Ҽ� ����.
		// �͸�Ŭ���� ���ο�, �����ǰ� �ʿ��� �޼��带 �ϳ� �ۼ��ؼ� �ѹ� �޼��带 �������� �� �ִ�.
		// �͸�Ŭ������ �������̽���, �߻�Ŭ������ ���Ǵ� ���α׷��� ����̴�.
		
		new AnonymousClass() {
			
			@Override
			public void Jinmethod() {
				System.out.println("Main�� Anonymous method START");
			}
			
		}.Jinmethod();
		
	}
}
