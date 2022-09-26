package 변수;

import javax.swing.JOptionPane;

public class 나의두번째부품 {

	public static void main(String[] args) {
		
		//prompt(), 입력용
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		
		String hobby = JOptionPane.showInputDialog("당신의 취미를 입력하세요.");
		
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		
		//alert()
		JOptionPane.showMessageDialog(null, "나의 나이는 "+age+" 취미는"+hobby+" 이름은 "+name);
		
		

	}

}
