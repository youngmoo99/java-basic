package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.setFont(new Font("메이플스토리", Font.PLAIN, 35));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("메이플스토리", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("중앙");
		btnNewButton_2.setFont(new Font("메이플스토리", Font.PLAIN, 27));
		btnNewButton_2.setBackground(Color.YELLOW);
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setFont(new Font("메이플스토리", Font.PLAIN, 18));
		btnNewButton_3.setBackground(Color.MAGENTA);
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.setFont(new Font("메이플스토리", Font.PLAIN, 16));
		btnNewButton_4.setBackground(Color.CYAN);
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
