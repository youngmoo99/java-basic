package 연산자;

import javax.swing.JOptionPane;

public class 내년나이계산 {

	public static void main(String[] args) {
		//입력
		String age = JOptionPane.showInputDialog("올해 나이 입력");
		//처리
		//age를 정수형으로 변경 
		int age2 = Integer.parseInt(age);
		age2 += 1;
		//출력
		JOptionPane.showMessageDialog(null, "당신의 내년 나이는 "+age2+ "살입니다.");
		
		int a=3;
		int b = 0;
		b = a++;
		System.out.println(b);
	}

}
