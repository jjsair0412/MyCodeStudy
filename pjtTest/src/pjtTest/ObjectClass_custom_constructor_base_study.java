package pjtTest;

public class ObjectClass_custom_constructor_base_study {
	
	public int x;
	public int y;
	
	public ObjectClass_custom_constructor_base_study(String s, int[] i) {
		System.out.println("������ ȣ��");
		
		System.out.println("s ---> "+ s);
		System.out.println("int[] i ----->" + i);
		
		// ���� ����Ʈ �����ڰ� ���ٸ�, �����Ϸ��� �������� ������ ��, �ڵ����� �ƹ��͵����� �����ڸ� ������.
		// ������ ��ü���� �Ķ���Ͱ��� �޾Ƽ� Ȱ���� �� �� �ִ�.
		// �̰��� ����� ���� �����ڶ� �Ѵ�.
		
	
	}
	public ObjectClass_custom_constructor_base_study(int x, int y) {
		// �ش� �����ڿ��� �޾ƿ� int x�� int y�� ���������� �޸𸮿��� ��� ����ִٰ� �������.
		// ������ , �ش� Ŭ������ public int x, public int y�� ��������� �������� �����͸� �������ִ�.
		// ���������� �޾ƿ� int x�� int y�� �������� x,y�� ���ʹٸ�,
//		x = x;
//		y = y;
		// �̷��� ǥ���� �� �ִ�. �׷���, ���Ȼ����� �������� �򰥸� �� �ִ�.
	    // �׷��� this Ű���带 ����Ѵ�.
		
		this.x = x;
		this.y = y;
		
		// this�� ���� x��, ObjectClass_custom ''' ���� �۵��ϴ� ��ü�� ����Ų��.
		// ���� this.x�� �������� x�̴�.
		// this.y�� �������� y�̴�
		// x, y�� ���������� x, y�� ��Ÿ����.
	}
	
	public void getInfo() {
		System.out.println("getInfo �޼��� ȣ��");
		System.out.println("x --- > " + x);
		System.out.println("y --- > " + y);
	}
}
