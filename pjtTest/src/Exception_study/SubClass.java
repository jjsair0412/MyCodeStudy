package Exception_study;

public class SubClass {
	// throws��, ���ܰ� �߻��ϸ� ��(���� ��ġ�� �޼���)�� ȣ���� ������ ���ܸ� ����������.
		public void firstMethod() throws Exception{ 
			secondMethod();
		}
		
		public void secondMethod() throws Exception{
			thirdMethod();
		}
		
		public void thirdMethod() throws Exception{
			System.out.println("10 / 0 : "+(10/0));
		}
}
