package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	static int count;
	static JLabel t1;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(400,400);
		f.getContentPane().setLayout(null);
		
		JLabel t1 = new JLabel("");
		t1.setForeground(Color.RED);
		t1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 98));
		t1.setBounds(112, 148, 239, 150);
		f.getContentPane().add(t1);
		
		JButton btnNewButton = new JButton("1더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count+"");
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(12, 10, 97, 50);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0으로 초기화");
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				t1.setText(count+"");
			}
		});
		btnNewButton_1.setBounds(132, 10, 122, 50);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1빼기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				t1.setText(count+"");
			}
		});
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(275, 10, 97, 50);
		f.getContentPane().add(btnNewButton_2);
		
		
		f.setVisible(true);
		

	}
}
