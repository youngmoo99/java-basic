package 추상클래스인터페이스;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class 인터페이스그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(new FlowLayout());
		
		JButton b1 = new JButton("나를 눌러요.");
		JButton b2 = new JButton("나도 눌러요.");
		f.add(b1);
		f.add(b2);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
		
		버튼1처리클래스 버튼1처리 = new 버튼1처리클래스();
		b1.addActionListener(버튼1처리);
		버튼2처리클래스 버튼2처리 = new 버튼2처리클래스();
		b2.addActionListener(버튼2처리);
		
		JTextArea list = new JTextArea(6,10);
		list.setFont(font);
		f.add(list);
		list.setBackground(Color.yellow);
		
		
		f.setVisible(true);

	}

}
