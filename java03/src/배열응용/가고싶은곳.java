package 배열응용;

import java.util.Scanner;

public class 가고싶은곳 {

	public static void main(String[] args) {
		// 1. 작년에 가고 싶었던 곳 세곳을 입력받아 넣으세요 
		Scanner sc = new Scanner(System.in);
		String[] travel1 = new String[3];
		System.out.print("작년에 가고싶었던곳 세곳을 입력하세요 >> ");
		for (int i = 0; i < travel1.length; i++) {
			travel1[i] = sc.next();
		}
		
		
		
		//2. 올해에 가고 싶었던 곳 세곳을 입력받아 넣으세요 
		String[] travel2 = new String[3];
		System.out.print("올해에 가고싶은곳 세곳을 입력하세요 >> ");
		for (int i = 0; i < travel2.length; i++) {
			travel2[i] = sc.next();
		}
		
		//3. 일치하는 항목이 있으면 어디인지 위치를 찾아주세요
		int count =0;
		for (int i = 0; i < travel2.length; i++) {
			if(travel1[i].equals(travel2[i])) {
				count++;
			}
		}
		System.out.println("작년과 올해 가고싶은곳이 동일한 곳은 "+count+"곳입니다.");
	}

}
