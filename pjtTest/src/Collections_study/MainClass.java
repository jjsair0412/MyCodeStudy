package Collections_study;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		// ArrayList�� interface�̴�.
		// String�� arraylist list���۷��� ����
		ArrayList<String> list = new ArrayList<>();
		
		// ������ �߰�
		list.add("hi");
		list.add("jinseong");
		list.add("java");
		System.out.println(list);

		// �ε����� �߰��ؼ� ���°�� ������ ������ �� �ִ�.
		// 0,1,2 ��°�� programming �߰�
		list.add(2,"programming");
		
		System.out.println(list);
		
		// set�� Ȱ���ؼ�, ���°�� �ٲܼ��� �ִ�.
		// 0��° index�� hello�� ����
		list.set(0, "hello");
		
		System.out.println(list);
		
		// get �޼��带 Ȱ���ؼ�, ���� ������ �� �ִ�.
		// 2��° �ε����� programming ������ str�� ����
		String str = list.get(2);
		System.out.println(str);
		
		// remove�� Ȱ���ؼ�, ���° �ε����� ���� ������ų �� �ִ�.
		list.remove(2);
		System.out.println(list);
		
		// ũ�⸦ ��ȯ���� �� �ִ�.
		int lsize = list.size();
		System.out.println(lsize);
		
		// ������ ��ü�� ������ų �� �ִ�.
		list.clear();
		System.out.println(list);
		
		
		// ����մ��� Ȯ���� �� �ִ�.
		// ��������� true, ���� �ִٸ� false
		boolean a = list.isEmpty();
		System.out.println(a);
		
		
		System.out.println();
		
		// map���� interface�̴�.
		// map��, key�� ��Ī�� �����͸� �����Ѵ�.
		// key�� �ߺ��� �� ������, �����ʹ� �ߺ��� �����ϴ�.
		// ArrayList�� �ε����� �����͸� ����������, map�� key������ �����͸� �����Ѵ�.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// ������ key��( ���⼱ key�� ������Ÿ���� Integer�̴�. )
		// �������� key���� �����ϴ� ������ ( �������� ������Ÿ���� String )
		map.put(1, "hello");
		map.put(3, "java");
		map.put(5, "world");
		// �̷��ԵǸ�, map�� size�� 3
		System.out.println(map);
		
		map.put(3, "C");
		System.out.println(map);
		// 3���ڸ��� java�� C�� ��ü��
		
		// key���� 1�� ������ ����
		String str1 = map.get(1);
		System.out.println(str1);
		
		// key���� 3�� ������ ����
		map.remove(3);
		System.out.println(map);
		
		// Ư�� ������ ���� ����
		System.out.println(map.containsValue("hello"));
	
		// ������ ��ü ����
		map.clear();
		System.out.println(map);
	}

}
