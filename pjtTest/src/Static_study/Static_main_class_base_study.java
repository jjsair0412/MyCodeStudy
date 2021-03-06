package Static_study;

import java.util.Scanner;
// 다른 패키지에 존재하는 Scanner를 사용하기 위해, import 키워드를 사용했다.
// Scanner는 java => util 폴더에 위치한다.

public class Static_main_class_base_study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객 이름을 입력해주세요 : ");
		
		String Cusname = sc.next();
		Static_sub_class_base_study sub = new Static_sub_class_base_study(Cusname);
		
		sub.getInfo();
		
		System.out.print("두번째 고객 이름을 입력해주세요 : ");
		
		String secondCusname = sc.next();
		
		Static_sub_class_base_study sub2 = new Static_sub_class_base_study(secondCusname);
		
		sub2.getInfo();
		sub2.setName("홍길동");
		// get,set 메서드를 활용해서 private로 막아두었던 멤버변수 값을 교체해주었다.
		sub2.getInfo();
		
		System.out.printf("%s 고객님, 얼마 저축하시겠습니까 ? : ", Cusname);
		int SaveMoney = sc.nextInt();
		
		sub.saveMoney(SaveMoney);
		sub.getInfo();
		
		System.out.println("\n");

		System.out.printf("%s 고객님, 얼마 저축하시겠습니까 ? : ",secondCusname);
		// 아까 키보드로 기입했던 이름이 출력된다.
		int SaveMoney2 = sc.nextInt();
		
		sub2.saveMoney(SaveMoney2);
		sub2.getInfo();
		// get,set 메서드로 바꿔주었던 이름 홍길동으로 getinfo 메서드가 출력된다.
		
		// 멤버변수에 static 키워드를 사용한다면, 여러 객체가 생성되어서 다른 메모리에 존재하더라도,
		// static키워드가 붙어있는 멤버변수는 다른 객체에서도 데이터 공유가 가능하다.
		// amount를 공유해서, 두 객체가 서로 값을 공유한다.
		
	}
}
