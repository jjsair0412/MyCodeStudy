package String_Class_Study;

public class MainClass {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println("�ʱ� str : "+str);
		
		str += "jinsoung";
		System.out.println("�߰��� str : "+str);
		
		// ���� String��, �����͸� �߰��Ҷ� ���� �ִ� hello�� jinsoung�� �߰��ϴ°��� �ƴ϶�
		// str�� ���۷����� �ƿ� ������ �޸𸮰����� ���� ó������ �ٽ� hellojinsoung�� ����°��̴�.
		// �׸��� ���۷����� ��ü�� ����Ű�� ���� �ʱ� ������ ������ hello���ִ� �޸� ������ GC�� ȸ���Ѵ�.
		// ���� �ӵ��� ���� ������ ��Ȱ���� ���� �ʴ´ٴ� ������ �����Ѵ�
		
		System.out.println();
		
		StringBuffer sf = new StringBuffer("java");
		System.out.println("�ʱ� StringBuffer : "+sf);
		sf.append(" hello");
		System.out.println("�߰��� StringBuffer : "+ sf);
		
		// �׷��� StringŬ������ ������ ������ StringBuffer, StringBuilder�� �ִ�.
		// StringBuffer�� StringBuilder�� ������ �ִ� �޸� ������ ��Ȱ���ؼ�, �ڿ� �߰��ؼ� ����Ѵ�.
		// ������ �������� StringBuffer�� �� ����, �ӵ��� StringBuilder�� ���� ������.
		
		
		// ������ ���� �����Ͱ� ��� �ٲ�ٰų� �Ѵٸ�, StringBuilder�� StringBuffer�� Ȱ������..
	}
}
