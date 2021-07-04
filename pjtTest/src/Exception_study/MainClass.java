package Exception_study;

public class MainClass {
	public static void main(String[] args) {
		// ����ó���� Checked Exception�� unChecked Exception�� �ִ�.
		// Checked�� ����ó���� �ݵ�� �ؾ� �ϴ� ����̴�. ( ��Ʈ��ũ, ���� �ý���(�����) �� )
		// UnChecked�� �������� �Ǵܿ� �ð� ���� ó���� ���ִ� ����̴�.
		// �ش� ������ UnChecked Exception�̴�.
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		SubClass sb = new SubClass();
		
		System.out.println("Exception BEFORE");
		
		try {
			// 0���� ���� �� ���� ������ ���ܹ߻�
			sb.firstMethod();
			r = i/j;
			// r = i/j���� ������ �߻��߱� ������, �ؿ��ִ� ��¹��� �������� �ʰ�
			// �ش��ϴ� catch������ �ٷ� �Ѿ
			// �׷���, �ش� try�� ���ο��� ��� ������ �� �����ؾ� �Ѵٸ�
			// finallyŰ���带 ����Ѵ�.
			System.out.println(" ���� !! ");
		}catch(Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("Exception : "+ msg);
			
		}finally {
			System.out.println("���ܹ߻� ���ο� ������� ������ ����Ǵ� finally ���� ������");
		}
		
		System.out.println("Exception AFTER");
	}
	
	
	
}
