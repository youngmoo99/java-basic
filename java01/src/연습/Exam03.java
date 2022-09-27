package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("통신사");
		String tel = JOptionPane.showInputDialog("전화번호");
		String name = JOptionPane.showInputDialog("성명");
		
		JOptionPane.showMessageDialog(null, name+"님은 "+company+"에 "+tel+"로 가입되셨습니다.");
	
		

	}

}
