package Interface_base_study;

// �������̽��� ����ϴ� ������, ��ü�� �پ��� ������ Ÿ��(�ڷ���)�� ���� �� �ֱ� �����̴�.
// �������̽��� �����ϱ� ���ؼ�, implementsŰ���� �ڿ� interface�̸��� �����Ѵ�.
public class ImplementClass implements interfaceA, interfaceB{
	
	float a;
	public ImplementClass() {
		System.out.println("ImplementClass ������");
	}
	
	
	// interface���� ���� ���ְ� ����� ���������� ���� �޼������,
	// implements�� class���� �������ؼ� ����� �����Ѵ�.
	@Override
	public void funA(float a) {
		this.a =a ;
		// interfaceA�� ��ġ�� funA()
		System.out.println("funA() START");
	}
	
	@Override
	public float aListener() {
		// interfaceB�� ��ġ�� funB()
		System.out.println("funB() START");
		return a;
	}
	
}
