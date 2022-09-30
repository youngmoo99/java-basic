package 배열응용;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범 {
	static int start = 2; //전역변수 
	public static void main(String[] args) {
		
		//영화제목
		String[] title= {"인생은 아름다워","공조2","정직한 후보2","늑대사냥","짱구는못말려극장판"};
		// 포스터파일
		String[] img = {"insang.jpg","jong.jpg","hubo.jpg","wolf.jpg","jjang.jpg"};
		
		// 평점
		double[] jumsu = {8.87, 8.03, 7.85, 5.47, 9.44};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		
		JLabel top = new JLabel("정직한 후보2");
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel("78.5");
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을때 처리하고 싶은 내용 
				//actionPerformed()함수안에 넣어주기 
				//제목이 표시된 라벨에 제목을 변경해야함 
				if (start>0) {
						
				start--;
				top.setText(title[start]);
				under.setText(jumsu[start]+"점");
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "처음 페이지 입니다.");
				}
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start <4){
					
				start++;
				top.setText(title[start]);
				under.setText(jumsu[start]+"점");
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "끝 페이지입니다.");
				}
			}
		});
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
	
		f.setSize(418,443);
		f.setVisible(true);
	}

}
