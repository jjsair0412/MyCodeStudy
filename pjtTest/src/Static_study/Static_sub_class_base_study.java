package Static_study;

public class Static_sub_class_base_study {
//	public String name;
	// public�� ��������, �ٸ� Ŭ�������� ������ �����Ӵٴ°� ������ �ȴ�.
	// ������𼭵� �ش� ��������� ������ų�� �ֱ� �����̴�.
	// �����͸� �ܺηκ��� ��ȣ�ϱ� ���ؼ� �̷� ������ private�� ������ش�.
	private String name;
	static int amount = 0;
	
	// ��������� static Ű���带 ����Ѵٸ�, ���� ��ü�� �����Ǿ �ٸ� �޸𸮿� �����ϴ���,
	// staticŰ���尡 �پ��ִ� ��������� �ٸ� ��ü������ ������ �����ϴ�.
	
	public Static_sub_class_base_study(String Cusname) {
		this.name =Cusname;
	}
	
	public void saveMoney(int money) {
		amount += money;
		System.out.println("amount : "+ amount);
	}
	
	public void spendMoney(int money) {
		amount -= money;
		System.out.println("amount : "+ amount);
	}
	
	public void getInfo() {
		System.out.println("�� �̸� : "+ name);
		System.out.println("���� �ܾ� : "+ amount);
	}

	// private�� ���Ƴ��� ������, �ܺ� Ŭ�������� ������ �� ����. 
	// �׷��� �ش� �������� �ܺ� Ŭ�������� ������ �ʿ䰡 ���� ��, get,set �޼��带 ����Ѵ�.
	public String getName() {
		// �Ӽ��� �����͸� ��ȯ�Ѵ�.
		return name;
	}

	public void setName(String name) {
		// �Ӽ� �����͸� �־��ش�.
		// get set�� Ȱ���������� ������, ���������� �־��� �� �ִٴ� ���̴�.
		this.name = name;	
	}
}
