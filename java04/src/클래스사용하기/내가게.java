package 클래스사용하기;

import 클래스만들기.계산기2;

public class 내가게 {

	public static void main(String[] args) {
		//자바는 "입력값이 다르면" 메서드이름은 동일
		
		계산기2 cal2 = new 계산기2();
		
		int result = cal2.add(100,200);
		double result2 = cal2.add(100,200.4);
		double result3 = cal2.add(100.2,200.5);
		String result4 = cal2.add("안녕", "하세요");
		int result5 = cal2.multi(3000,4);
	    double result6 = cal2.div(result5, 4);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println("한사람당 "+result6+"원");

	}

}
