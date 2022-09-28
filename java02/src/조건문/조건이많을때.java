package 조건문;

import java.util.Date;

public class 조건이많을때 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay(); 
		//0 이 일요일 -> 6이 토요일 
		switch (day) {
		case 0: case 6:
			System.out.println("주말이니 놀자");
			break;

		default:
			System.out.println("평일이니 공부하자");
			break;
		}
		
		//계절을 판별해보세요 
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄입니다");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다");
			break;

		default:
			System.out.println("겨울입니다.");
			break;
		}
	}

}
