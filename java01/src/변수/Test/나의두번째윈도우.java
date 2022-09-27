package Test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class 나의두번째윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(33, 49, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(33, 178, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(33, 273, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(137, 46, 231, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 175, 231, 21);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 270, 231, 21);
		f.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(91, 374, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("닫기");
		btnNewButton_1.setBounds(271, 374, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}
}
