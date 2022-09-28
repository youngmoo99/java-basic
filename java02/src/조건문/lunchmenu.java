package 조건문;

import java.util.Scanner;

public class lunchmenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 먹고 싶은 점심 메뉴는(짜장면, 라면, 회)");
		String food = sc.next();
		
		switch (food) {
		case "짜장면":
			System.out.println("짜장면이면 중국집으로 가요");		
			break;
			
		case "라면":
			System.out.println("라면이면 분식집으로 가요");		
			break;
			
		case "회":
			System.out.println("회면 횟집으로 가요");		
			break;

		default:
			System.out.println("아니면 그냥 안먹어요.");
			break;
		}
	}
}
