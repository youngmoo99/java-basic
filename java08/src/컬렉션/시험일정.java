package 컬렉션;

import java.util.LinkedList;

public class 시험일정 {

	public static void main(String[] args) {
		// queue 선입 선출
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println("전체 시험볼 과목 : " + test);
		for (int i = 0; i <= test.size(); i++) {
			test.remove();
			System.out.println((i + 1) + "일차 시험본 후 남은 과목 : " + test);
		}

	}

}
