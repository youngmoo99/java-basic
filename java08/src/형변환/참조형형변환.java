package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 배열의 단점 : 고정된 크기, 같은 타입만 모을 수 있음
		// ArrayList : 가변크기, 다른 타입들도 넣을 수 있음
		ArrayList list = new ArrayList();
		// 큰 <--- 작(자동형변환, up casting, 업캐스팅)
		list.add("홍길동");
		list.add(100);
		list.add(0.2);
		list.add(true);
		list.add(new JButton());
		System.out.println(list.size());

		String name = (String) list.get(0); // 홍길동
		// 강제현변환, 다운캐스팅

		// int <--> Integer <-- Object
		// 기본형과 처리를 하기위해서 부품으로 크게 만들어놨음
		// 기본형 + 포장 => 포장클래스(Wrapper클래스)
		// 기본형과 포장클래스 간에는 자동변환이 가능
		// int --> Integer : boxing ,박싱
		// int <-- Integer : unboxing, 언박싱
		// autoboxing, autounboxing
		int age = (int) list.get(1);
		double eye = (double) list.get(2);
		boolean food = (boolean) list.get(3);
		JButton b = (JButton) list.get(4);

		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		System.out.println(me);

		int money = (int) me.get(0) + 2000; // int <- 오토언박싱- Integer <- 강제형변환 -Object
		System.out.println(money);

		double height = (double) me.get(1) + 10;
		System.out.println(height);

		if ((boolean) me.get(2) == false) {
			System.out.println("배고파요");
		} else {
			System.out.println("배불러요");
		}

		if ((char) me.get(3) == '남') {
			System.out.println("주민번호는 1,3 이에요");
		} else {
			System.out.println("주민번호는 2,4에요");
		}

	}

}
