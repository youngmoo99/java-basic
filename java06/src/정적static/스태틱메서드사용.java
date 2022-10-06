package 정적static;

import javax.swing.JOptionPane;

public class 스태틱메서드사용 {
	public static void main(String[] args) {
		String s= JOptionPane.showInputDialog("숫자입력");
		
		int n = Integer.parseInt(s); 
		System.out.println();
	}
}
