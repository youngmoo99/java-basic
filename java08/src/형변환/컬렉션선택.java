package 형변환;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션선택 {

	public static void main(String[] args) {
		//set 데이터 중복을 허용하지 않음, 순서를 유지하지 않는 데이터 
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("db관리자");
		System.out.println(team);
		
		//2.queue -> linkedlist 
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println(milk);
		
		//3. list- >ArrayList
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		ski.remove(1);
		System.out.println(ski);

	}

}
