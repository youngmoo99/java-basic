package 순차문;

import java.util.Scanner;

public class 나에대한정보2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나의 이름은? ");
		String name = sc.next();
		
		System.out.print("나의 키는? ");
		double height = sc.nextDouble();
		double height2 = height + 10;
		
		System.out.print("나의 몸무게는? ");
		double weight = sc.nextDouble();
		double weight2 = weight - 10;
		
		System.out.print("나눈 저녁을 먹었나요? ");
		boolean dinner = sc.nextBoolean(); 
		
		sc.nextLine();
		System.out.print("나의 좌우명은?");
		String life = sc.nextLine();
		
		System.out.println("-----------------------");
		
		System.out.println("내 이름은 "+name+"입니다.");
		System.out.println("내 내년 키는 "+height2+"입니다.");
		System.out.println("내 내년 몸무게는 "+weight2+"입니다.");
		System.out.println("나는 저녁을 "+dinner+"했습니다.");
		System.out.println("나의 좌우명은 "+life+"입니다.");		
	}
}
