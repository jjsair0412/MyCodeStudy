package Custom_constructor_study;

public class MainClass_custom_constructor_base_study {
	public static void main(String[] arg) {
		String a = "������";
		int[] arr = {10, 11, 12 ,13 ,14};
		ObjectClass_custom_constructor_base_study object = new ObjectClass_custom_constructor_base_study(a,arr);
		
		
		ObjectClass_custom_constructor_base_study object2 = new ObjectClass_custom_constructor_base_study(10, 20);
		// ����� ���� ������ ��ü ����
		object2.getInfo();
		
	}
	
}
