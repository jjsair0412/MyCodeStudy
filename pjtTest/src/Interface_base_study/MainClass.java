package Interface_base_study;

public class MainClass {	
	public static void main(String[] args) {
	
		interfaceA ia = new ImplementClass();
		// ia�� ��üŸ���� interfaceA�̴�.
		// ���� ia ���۷����� ������ �� �ִ� �޼���� funA()�� �����ϴ�.
		// �ֳ��ϸ� ��üŸ���� interfaceA�ϱ� interfaceB�� ��ġ�� �޼���� ������ �� ����.
		interfaceB ib = new ImplementClass();
		// ib�� ��üŸ�Ե� �����ϰ� interfaceB�̴�.
		
		ia.funA();
		
		
		ib.funB();
	
		ImplementClass im = new ImplementClass();
		im.funA();
		im.funB();
		
	}

}
