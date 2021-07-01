package Custom_constructor_study;

public class MainClass_custom_constructor_base_study {
	public static void main(String[] arg) {
		String a = "주진성";
		int[] arr = {10, 11, 12 ,13 ,14};
		ObjectClass_custom_constructor_base_study object = new ObjectClass_custom_constructor_base_study(a,arr);
		
		
		ObjectClass_custom_constructor_base_study object2 = new ObjectClass_custom_constructor_base_study(10, 20);
		// 사용자 정의 생성자 객체 생성
		object2.getInfo();
		
	}
	
}
