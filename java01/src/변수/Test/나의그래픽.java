package Test;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame(); 
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(25, 34, 160, 28);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(25, 164, 160, 28);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어점수");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(25, 247, 160, 28);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학점수");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(25, 305, 160, 28);
		f.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("홍차")) {
					JOptionPane.showMessageDialog(f, "카페 가세요");
					
				} else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요");
				}
			}
		});
		btnNewButton.setBounds(25, 86, 403, 42);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				
				int s22 = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, "내년에"+(s22+1)+"세 입니다.");
			}
		});
		btnNewButton_1.setBounds(25, 195, 403, 42);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText(); 
				
				int s33 = Integer.parseInt(s3);
				int s44 = Integer.parseInt(s4);
				double sum = s33+ s44;
				
				double avg = (sum) / 2;
				JOptionPane.showMessageDialog(f, "평균은 "+avg+"점 입니다.");
			}
		});
		btnNewButton_2.setBounds(25, 368, 403, 42);
		f.getContentPane().add(btnNewButton_2);
		
		t1 = new JTextField();
		t1.setBackground(Color.ORANGE);
		t1.setBounds(214, 28, 202, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.PINK);
		t2.setColumns(10);
		t2.setBounds(214, 158, 202, 34);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(Color.CYAN);
		t3.setColumns(10);
		t3.setBounds(214, 247, 202, 34);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(Color.CYAN);
		t4.setColumns(10);
		t4.setBounds(214, 299, 202, 34);
		f.getContentPane().add(t4);
		f.setVisible(true);
		
		

	}
}
