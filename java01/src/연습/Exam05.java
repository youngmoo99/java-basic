package 연습;

import javax.swing.JOptionPane;

public class Exam05 {

	public static void main(String[] args) {
		String pwd = JOptionPane.showInputDialog("암호 입력");
		String pwd2 = "p";
		
		if (pwd.equals(pwd2)) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");

		}
		
	}

}
