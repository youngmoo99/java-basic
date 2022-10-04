package 클래스사용하기;

import 클래스만들기.계좌;

public class 우리집계좌 {

	public static void main(String[] args) {
		계좌 dad = new 계좌();
		dad.account = "튼튼적금";
		dad.name = "홍길동";
		dad.price = 1000;
		
		dad.입금하다();
		dad.출금하다();
		

	}

}
