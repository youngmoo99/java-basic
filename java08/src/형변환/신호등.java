package 형변환;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 신호등 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLACK);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5,5));
		f.setSize(600,600);
		
		
		JButton btnNewButton = new JButton("빨강신호");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("tra.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(31, 10, 118, 36);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("노랑신호");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("trfs.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setBounds(209, 10, 118, 36);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("파랑신호");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("green.png");
				img.setIcon(icon);
				f.add(img);
				f.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setBounds(389, 10, 118, 36);
		f.getContentPane().add(btnNewButton_2);
		
		
		
		
		
		
		f.setVisible(true);
		
		

	}
}
