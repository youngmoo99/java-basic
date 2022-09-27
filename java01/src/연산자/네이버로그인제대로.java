package 연산자;

import javax.swing.JOptionPane;

public class 네이버로그인제대로 {

	public static void main(String[] args) {
		String id = "root";
		String pw = "pass";
		
		String id2 = JOptionPane.showInputDialog("로그인id");
		String pw2 = JOptionPane.showInputDialog("비밀번호");
		
		//String은 기본형이 아니여서 값을 비교할떄 연산자를 쓸 수 없다.
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
