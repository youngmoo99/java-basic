package 클래스사용하기;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\coding\\multicam\\java-workspace\\java03\\jjang.jpg"));
		lblNewLabel.setBounds(135, 37, 211, 171);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디:");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(88, 245, 105, 39);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(205, 250, 161, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(88, 311, 105, 39);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(205, 317, 161, 30);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); // 아이디
				String s2 = t2.getText(); //비밀번호
				
				//id ='root' pw='1234'이면 일기쓰는 화면 띄우고 아니면 로그인 실패 화면 띄우기 
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인성공");
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				}else {
					JOptionPane.showMessageDialog(f, "로그인실패");
				}
				
				//저 일기쓰기 화면창을 띄우기 
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\coding\\multicam\\java-workspace\\java04\\lapis.png"));
		btnNewButton.setBounds(72, 375, 150, 76);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\coding\\multicam\\java-workspace\\java04\\zeros.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1, t2의 글자를 지워지는것처럼 공백넣기 
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setBounds(278, 375, 150, 76);
		f.getContentPane().add(btnNewButton_1);
		f.setSize(500,500);
		
		
		
		
		f.setVisible(true);

	}
}
