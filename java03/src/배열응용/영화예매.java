package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(550,750);
		
		//레이아웃 부품 지정
		//물처럼 흐르듯 왼쪽부터 하나씩 순서대로 붙여주는 배치 부품을 만들어서
		//f에 설정
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		int [] seat = new int[500];
		
		for (int i = 1; i < 501; i++) {
			JButton b = new JButton(i+ "");
			f.add(b);
			
			
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); //버튼위의 글자를 가져다줌
					JOptionPane.showMessageDialog(f, s+ "번 예약완료");
					b.setEnabled(false); //한번 누르면 예약불가능 
					b.setBackground(Color.red);
					int index = Integer.parseInt(s);
					seat[index] = 1; //예약완료
					
					int count = 0;
					//예약 몇개 되었는지 확인. 
					for (int j : seat) {
						if(j==1) {
							count++;
						}
					}
					//한자리당 금액이 13000원 결제금액을 출력해주세요.
					JOptionPane.showMessageDialog(f, "예약된 좌석은 "+count+"개 입니다.");
					JOptionPane.showMessageDialog(f, "누적 금액은 "+(count*13000)+"원 입니다.");
				}
			});
		}
			
		f.setVisible(true);

	}

}
