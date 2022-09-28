package 반복문;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		while (true) {
			System.out.print("(1)아이유, (2)유재석, (3)방탄 >> ");
			String mc = sc.next();
			
			if (mc.equals("1")) {
				count1++;
			}
			else if(mc.equals("2")) {
				count2++;
			}
			else {
				count3++;
			}
			
			
			System.out.print("더하실껀가요 o x");
			String yesno = sc.next();
			if(yesno.equals("x")) {
				System.out.println("아이유 : "+count1);
				System.out.println("유재석 : "+count2);
				System.out.println("방탄 : "+count3);
				System.exit(0);
			}
			
			
		}

	}

}
