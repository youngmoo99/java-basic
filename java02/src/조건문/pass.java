package 조건문;

import java.util.Scanner;

public class pass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("암호를 대시오 : ");
		String pwd = sc.next();
		

		switch (pwd) {
		case "pass":
			System.out.println("들어오세요");
			break;

		default:
			System.out.println("나가세요");
			break;
		}

	}

}
