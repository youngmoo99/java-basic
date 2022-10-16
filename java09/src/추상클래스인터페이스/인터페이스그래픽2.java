package 추상클래스인터페이스;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class 인터페이스그래픽2 implements ActionListener{
	static JTextArea list;
	static JButton b1,b2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(new FlowLayout());
		
		b1 = new JButton("나를 눌러요.");
		b2 = new JButton("나도 눌러요.");
		f.add(b1);
		f.add(b2);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
		인터페이스그래픽2 act3 = new 인터페이스그래픽2();	
		b1.addActionListener(act3);	
		b2.addActionListener(act3);
		
		list = new JTextArea(6,10);
		list.setFont(font);
		f.add(list);
		list.setBackground(Color.yellow);
		
		
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			list.append("b1클릭함\n");
			
		} else {
			list.append("b2클릭함\n");
			
		}
		
	}

}
