package 연습;

import javax.swing.JOptionPane;

public class Exam07 {

	public static void main(String[] args) {
		String pwd = JOptionPane.showInputDialog("암호 입력");
		String pwd2 = "p";
		
		double yester = 80.5; 
		double today = 76.5;
		
		double diet = yester - today;
		
		if(pwd.equals(pwd2) && diet >2) {
			System.out.println("오늘은 성공!");
		}else {
			System.out.println("내일 다시 도전!");
		}

	}

}
