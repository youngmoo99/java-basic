package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;

public class 많은양의데이터 {

	public static void main(String[] args) {
		// 데이터타입도 다르고, 크기도 유동적
		//순서가 중요 
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add("홍길동");
		list.add("홍길동");
		list.add(100);
		list.add(10.5);
		
		System.out.println(list);
		
		//중복을 제외하고 싶은경우 set데이터 --> HashSet 
		HashSet list2 = new HashSet();
		for (int i = 0; i < list.size(); i++) {
			list2.add(list.get(i));
		}
		System.out.println(list2);
//		list2.add("홍길동");
//		list2.add("홍길동");
//		list2.add("홍길동");
//		list2.add(100);
//		list2.add(10.5);
	

	}

}
