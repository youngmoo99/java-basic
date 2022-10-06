package 생성자;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	static int count;
	static final int PRICE = 5000;
	static int 짬뽕count;
	static int 우동count;
	static int 짜장count;

	private static JTextField t1;
	static JLabel result;

	public static void main(String[] args) {

		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		JLabel result = new JLabel("결제금액");
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBounds(33, 373, 401, 65);
		f.getContentPane().add(result);

		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setBounds(368, 34, 104, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel lblNewLabel = new JLabel("개수");
		lblNewLabel.setBounds(336, 29, 32, 45);
		f.getContentPane().add(lblNewLabel);

		JLabel center = new JLabel("");
		// 라벨에 이미지를 변경하고싶으면, 이미지부품을 만들고, 라벨에 아이콘을 셋팅
		ImageIcon img = new ImageIcon("짜장.jpg");
		center.setIcon(img);
		center.setBounds(33, 109, 417, 229);
		f.getContentPane().add(center);
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				짬뽕count++;
				t1.setText(count + "개");
				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				center.setIcon(icon);
				result.setText("결제금액: " + count * PRICE + "원");
				f.setTitle("짬뽕 :" + 짬뽕count + "개 " + "우동 : " + 우동count + "개 " + "짜장 : " + 짜장count + "개");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 22));
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(12, 10, 97, 79);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				우동count++;
				t1.setText(count + "개");
				ImageIcon icon = new ImageIcon("우동.png");
				center.setIcon(icon);
				result.setText("결제금액: " + count * PRICE + "원");
				f.setTitle("짬뽕 :" + 짬뽕count + "개 " + "우동 : " + 우동count + "개 " + "짜장 : " + 짜장count + "개");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 22));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(121, 10, 97, 79);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				짜장count++;
				t1.setText(count + "개");
				ImageIcon icon = new ImageIcon("짜장.jpg");
				center.setIcon(icon);
				result.setText("결제금액: " + count * PRICE + "원");
				f.setTitle("짬뽕 :" + 짬뽕count + "개 " + "우동 : " + 우동count + "개 " + "짜장 : " + 짜장count + "개");
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 22));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(230, 10, 97, 79);
		f.getContentPane().add(btnNewButton_2);

		f.setVisible(true);

	}
}
