package pjtTest;

public class ChildClass_Method_study {
	public String name; // �������
	public String gender;
	public int age;
	
	
	public ChildClass_Method_study() {
		// ������ . ������� ȣ��
		System.out.println("--ChildClass constructor ������ ���� -- ");
		
		mySecret(); // ���������ڰ� private�̶� ���� Ŭ���������� ����� �����ϴ�.
	}
	
	public void setInfo(String n, String g, int a) {
		// �Ű�����(�Ķ����)�� name, gender, age�� �޾ƿͼ�, ChildClass_Method_study
		// ��  �ɹ������� �ִ´�.
		name = n; // name
		age = a; // age
		gender = g; // gender
	}
	
	public void getInfo() {
		// �޼���
		System.out.println("--getInfo() START--");
		System.out.println("name : "+ name);
		System.out.println("gender : "+ gender);
		System.out.println("age : "+ age);
		

	}
	
	public void getInfo(int i, int j) {
		// �޼��� �̸��� �ߺ��ȴٰ� �ϴ���, �Ķ���Ͱ��� �ٸ��� �ٸ� �޼����̴�.
		// �޼��� �̸��� �ߺ����Ѽ� ����Ϸ��� �Ķ���Ͱ��� �޶�� �Ѵ�.
		// �̰��� �����ε��̶�� �Ѵ�. �ѱ۷� �ߺ� �޼����� �Ѵ�.
		System.out.println("--getInfo(int i, int j) START--");
		System.out.printf("%d + %d = %d",i,j,(i+j));
	}
	
	public void getInfo(String a, String b) {
		System.out.println("--getInfo(String a, String b) START--");
		System.out.printf("%s�� %s�� ģ����.",a,b);
	}
	
	// mySecret�� ������������ �ٸ� Ŭ�������� ������ �� ���Բ� �ϴ� ���� �������̴�.
	// �ܺο��� ȣ�� �� �� ����.
	// public�� �ܺο��� ȣ���� �� �ִ�.
	private void mySecret() {
		System.out.println(" -- mySecret() START -- ");
	}

}
