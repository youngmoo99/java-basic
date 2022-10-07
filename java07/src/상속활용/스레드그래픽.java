package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame {
	JLabel count, image, day;
	카운터스레드2 count2;
	시각스레드2 day2;
	이미지스레드2 image2;
	
	public 스레드그래픽() {
		getContentPane().setBackground(Color.GREEN);
		
		setSize(800,300);
		count = new JLabel("카운터");
		image = new JLabel("이미지");
		day = new JLabel("시각");
		Font font = new Font("궁서",Font.BOLD,30);
		count.setFont(font);
		day.setFont(font);
		add(count,BorderLayout.WEST);
		add(image,BorderLayout.EAST);
		add(day,BorderLayout.SOUTH);
		setVisible(true);
		count2 = new 카운터스레드2();
		day2 = new 시각스레드2();
		image2 = new 이미지스레드2();
		count2.start();
		day2.start();
		image2.start();
		
		
	}
	public static void main(String[] args) {
		//main이 static 이기때문에
		//static이 없는 생성자 메서드를 활용 
		스레드그래픽 name = new 스레드그래픽();
	}
	
	public class 시각스레드2 extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				Date date = new Date();
				day.setText(date+"");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}
	
	public class 이미지스레드2 extends Thread{
		@Override
		public void run() {
			String[] list = {"1.png", "2.png","3.png","4.png","5.png"};
			
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public class 카운터스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 10; i >= 0; i--) {
				count.setText(i+"");
				

				// cpu 1초씩 쉬엇다가 실행시켜줘라고 설정
				// ms 1000이 1초
				// 자바프로그램에서 외부자원(db, cpu, network, file)을 연결할때는
				// 프로그램이 중단되는 위험한 상황으로 인식되어
				// 그런상황이 발생했을때 어떻게 할지를 반드시 써주어야함 ==> 예외처리

				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i==0) {
					JOptionPane.showMessageDialog(null, "카운터 스레드 사용시간이 끝났습니다.");
				}
			}
		}
	}
}
