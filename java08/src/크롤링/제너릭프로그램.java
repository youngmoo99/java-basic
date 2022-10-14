package 크롤링;

import java.util.ArrayList;

public class 제너릭프로그램 {
//generic == general <--> specific, special
	public static void main(String[] args) {
		// 클래스를 만들때 데이터타입을 정하지 않고, 
		// 일반적인(특정하지 않은) 형태로 만들어놓음 
		// 데이터타입은 객체생성시 데이터 타입을 정할 수 있음 
		ArrayList<String> list = new ArrayList<>();
		
		list.add("스트링1");
		list.add("스트링2");
		list.add("스트링3");
		list.add("스트링4");
		list.add("스트링5");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(10);
		list2.add(20);
		list2.add(105);
		list2.add(104);
		list2.add(1033);
		System.out.println(list2);

	}

}
