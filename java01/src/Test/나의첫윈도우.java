package Test;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		//1. jframe 부품을 새로 만들기
		JFrame f = new JFrame();
		
		//2. 새로 만든 부품의 크기를 결정
		f.setSize(500,500);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\coding\\multicam\\java-workspace\\java01\\gimochi.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("기모지");
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		//3. 새로 만든 부품 "보여주세요"설정
		f.setVisible(true);

	}

}
