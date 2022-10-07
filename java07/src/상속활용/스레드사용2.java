package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import 상속활용.스레드그래픽.시각스레드2;
import 상속활용.스레드그래픽.이미지스레드2;
import 상속활용.스레드그래픽.카운터스레드2;

public class 스레드사용2 extends JFrame{
	JLabel count,count2;
	스레드1 count3;
	스레드2 count4;
	public 스레드사용2() {
		getContentPane().setBackground(Color.GREEN);
		setSize(800,300);
		count = new JLabel("하락");
		count2 = new JLabel("상승");
		Font font = new Font("궁서",Font.BOLD,30);
		count.setFont(font);
		count2.setFont(font);
		
		add(count,BorderLayout.WEST);
		add(count2,BorderLayout.EAST);
		setVisible(true);
		
		count3 = new 스레드1();
		count4 = new 스레드2();
		
		count3.start();
		count4.start();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		스레드사용2 name = new 스레드사용2();
	}
	
	public class 스레드1 extends Thread{
		@Override
		public void run() {
			for (int i = 100; i >= 0 ; i--) {
				count.setText("100부터 감소 : "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i==0) {
					JOptionPane.showMessageDialog(null, "0까지 끝");
				}

			}
		}
	}
	public class 스레드2 extends Thread{
		@Override
		public void run() {
			for (int i = 0; i <= 100; i++) {
				count2.setText("0부터 증가 : "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i==100) {
					JOptionPane.showMessageDialog(null, "100까지 끝");
				}
				
			}
			
		}
		
	}

}
