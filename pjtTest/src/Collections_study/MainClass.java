package Collections_study;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		// ArrayList는 interface이다.
		// String형 arraylist list레퍼런스 생성
		ArrayList<String> list = new ArrayList<>();
		
		// 데이터 추가
		list.add("hi");
		list.add("jinseong");
		list.add("java");
		System.out.println(list);

		// 인덱스를 추가해서 몇번째에 들어갈지도 선택할 수 있다.
		// 0,1,2 번째에 programming 추가
		list.add(2,"programming");
		
		System.out.println(list);
		
		// set을 활용해서, 몇번째를 바꿀수도 있다.
		// 0번째 index를 hello로 변경
		list.set(0, "hello");
		
		System.out.println(list);
		
		// get 메서드를 활용해서, 값을 꺼내올 수 있다.
		// 2번째 인덱스인 programming 꺼내와 str에 저장
		String str = list.get(2);
		System.out.println(str);
		
		// remove를 활용해서, 몇번째 인덱스의 값을 삭제시킬 수 있다.
		list.remove(2);
		System.out.println(list);
		
		// 크기를 반환반을 수 있다.
		int lsize = list.size();
		System.out.println(lsize);
		
		// 데이터 전체를 삭제시킬 수 있다.
		list.clear();
		System.out.println(list);
		
		
		// 비어잇는지 확인할 수 있다.
		// 비어있으면 true, 무언가 있다면 false
		boolean a = list.isEmpty();
		System.out.println(a);
		
		
		System.out.println();
		
		// map또한 interface이다.
		// map은, key와 매칭된 데이터를 관리한다.
		// key는 중복될 수 없지만, 데이터는 중복이 가능하다.
		// ArrayList는 인덱스로 데이터를 관리하지만, map은 key값으로 데이터를 관리한다.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// 왼쪽이 key값( 여기선 key의 데이터타입은 Integer이다. )
		// 오른쪽이 key값에 대응하는 데이터 ( 데이터의 데이터타입은 String )
		map.put(1, "hello");
		map.put(3, "java");
		map.put(5, "world");
		// 이렇게되면, map의 size는 3
		System.out.println(map);
		
		map.put(3, "C");
		System.out.println(map);
		// 3번자리의 java를 C로 교체함
		
		// key값이 1인 데이터 추출
		String str1 = map.get(1);
		System.out.println(str1);
		
		// key값이 3인 데이터 삭제
		map.remove(3);
		System.out.println(map);
		
		// 특정 데이터 포함 유무
		System.out.println(map.containsValue("hello"));
	
		// 데이터 전체 삭제
		map.clear();
		System.out.println(map);
	}

}
