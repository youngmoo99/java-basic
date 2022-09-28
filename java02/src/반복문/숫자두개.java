package 반복문;

import java.util.Scanner;

public class 숫자두개 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count2 = 0;
		
		
		while (true) {
			System.out.print("숫자입력1 >> ");
			int num1 = sc.nextInt();
			System.out.print("숫자입력2 >> ");
			int num2 = sc.nextInt();
			
			
			if (num1 > num2) {
				System.out.println("앞 숫자가 더 큽니다");
				count++;
				
			}else if(num2 > num1){
				System.out.println("뒷 숫자가 더 큽니다");
				count2++;
			}else {
				System.out.println("두 숫자가 일치합니다");
			}
			
			System.out.print("종료할까요?(x) 계속할까요?(o)");
			String yesno= sc.next();
			if (yesno.equals("x")) {
				System.out.println("앞숫자가 더큰횟수 "+count);
				System.out.println("뒷숫자가 더큰횟수 "+count2);
				 System.exit(0);
			}
				
		}
		
	}

}
