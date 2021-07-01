package Inheritance_study;

public class MainClass_Inheritance_study {
	public static void main(String[] args) {
		ChildClass_Inheritance_study child = new ChildClass_Inheritance_study();
		// childclass�� ParentClass�� ��ӹ޾ұ� ������, ��ü�� �����ϴ� ���ÿ�
		// ParentClass�� �����ڸ� ȣ���� �� ChildClass�� �����ڸ� ȣ���Ѵ�.
		// ��ӹް� �ִ� class�� �����ڴ�, ������ִ� class�� �����ڰ� ���� ȣ��� ���Ŀ� ȣ��ȴ�.
		// ����� ���ַ���, ���� ������ �ڿ� �־���ϱ� �����̴�.
		
		child.parentFun();
		// ParentClass�� ChildClass�� ��ӹ޾ѱ� ������, parentFun() �޼��带 ����� �� �ִ�.
		
		child.childFun();
		
		// �ڹٴ�, ���߻���� �������� �ʴ´�. ���� Ŭ������ ��ӹ��� �� ����.
		
//		child.privateFun();
		// �θ�Ŭ������ ��ӹ޴´� �ϴ���, �θ� Ŭ������ private ���������ڷ� �Ǿ��ִ� ��ɵ��� ������ �� ����.
	
		child.makeJjajang();
		
		ParentClass_Inheritance_study par[] = new ParentClass_Inheritance_study[2];
		// Class�� �̸����� int�� short�� ���� ������ Ÿ���̴�.
		// ���� ���۷�����ü�� �迭�� �� �� �ִ�.
		// ��ü�� �����ϸ鼭 �迭�� �������
		
		par[0] = new ChildClass_Inheritance_study();
		par[1] = new SecondChildClass_Inheritance_study();
		// �迭�� ������, ParentClass�� ��ӹ޴� firstChild�� secondChild class ���
		// ParentClass�� ��ӹް� �ֱ� ������, ParentClass�� ���۷����迭�� par[]�� ���������� ��� �� �ִ�.
		
		for( int i = 0; i<=1; i++) { // �迭�� 2ĭ�ֱ⶧����, 0,1 �ι���
			par[i].makeJjajang();
			// par[] �迭�� ����Ǿ��ִ� ù��° childclass�� �����ǵ� �޼����� makeJjajang()��
			// SecondChildClass�� �����ǵ� �޼����� makeJjajang()�� ������� ����Ѵ�.
		}
		
		System.out.println("\n");
		
		ParentClass_Inheritance_study fch = new ChildClass_Inheritance_study();
		System.out.println("--------");
		ParentClass_Inheritance_study sch = new SecondChildClass_Inheritance_study();
		// �ֻ��� Ŭ������ ParentClass�� ��ü�� ����, �ش� Ŭ������ ��ӹ޴� ��� Ŭ������
		// ��ü�� ���� �� �ִ�.
		// �̷��� ������ָ�, ���� �θ�Ŭ������ �����ڰ� ȣ��ǰ�, �� ���� new �޼���� ������ �ڽ�Ŭ������ �����ڰ� ȣ��ȴ�.
		
		
	}
}
