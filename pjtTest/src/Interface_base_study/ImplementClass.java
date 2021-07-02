package Interface_base_study;

// �������̽��� ����ϴ� ������, ��ü�� �پ��� ������ Ÿ��(�ڷ���)�� ���� �� �ֱ� �����̴�.
// �������̽��� �����ϱ� ���ؼ�, implementsŰ���� �ڿ� interface�̸��� �����Ѵ�.
public class ImplementClass implements interfaceA, interfaceB{
	
	public ImplementClass() {
		System.out.println("ImplementClass ������");
	}
	
	// interface���� ���� ���ְ� ����� ���������� ���� �޼������,
	// implements�� class���� �������ؼ� ����� �����Ѵ�.
	@Override
	public void funA() {
		// interfaceA�� ��ġ�� funA()
		System.out.println("funA() START");
	}
	
	@Override
	public void funB() {
		// interfaceB�� ��ġ�� funB()
		System.out.println("funB() START");
	}
	
}
