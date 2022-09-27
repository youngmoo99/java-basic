package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		String width = JOptionPane.showInputDialog("가로");
		String height = JOptionPane.showInputDialog("세로");
		
		double width2 = Double.parseDouble(width);
		double height2 = Double.parseDouble(height);
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 "+ width2*height2);

	}

}
