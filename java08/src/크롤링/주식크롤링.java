package 크롤링;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주식크롤링 {
	private static JTextField t2;
	// 버튼을 누를 때마다 textarea 부분에 결과를 넣어줘야함
	// 아무곳에서 접근이 가능해야함 --> 전역변수로 선언
	static JTextArea t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 주식 크롤링");
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.getContentPane().setLayout(null);

		JLabel t1 = new JLabel("CODE:");
		t1.setForeground(Color.RED);
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(116, 174, 146, 41);
		f.getContentPane().add(t1);

		t2 = new JTextField();
		t2.setBackground(Color.GREEN);
		t2.setBounds(83, 225, 199, 48);
		f.getContentPane().add(t2);
		t2.setColumns(10);

		t3 = new JTextArea();
		t3.setBounds(83, 365, 199, 167);
		f.getContentPane().add(t3);
		f.setSize(400, 700);

		JButton btnNewButton = new JButton("크롤링 시작");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 입력한 코드를 가지고와라
				// textField에 입력한거
				String code = t2.getText();
				크롤링6 크롤링 = new 크롤링6();
				String result = 크롤링.naver(code);
				t3.setText(result);

			}
		});
		btnNewButton.setBounds(116, 293, 131, 41);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("멀티캠퍼스");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링6 크롤링 = new 크롤링6();
				String result = 크롤링.naver("067280");
				t3.setText(result);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(83, 10, 199, 41);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("삼성전자");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링6 크롤링 = new 크롤링6();
				String result = 크롤링.naver("005930");
				t3.setText(result);

			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.setBounds(83, 61, 199, 41);
		f.getContentPane().add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("넥슨게임즈");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링6 크롤링 = new 크롤링6();
				String result = 크롤링.naver("225570");
				t3.setText(result);

			}
		});
		btnNewButton_1_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1_2.setBackground(Color.ORANGE);
		btnNewButton_1_2.setBounds(83, 112, 199, 41);
		f.getContentPane().add(btnNewButton_1_2);

		f.setVisible(true);

	}
}
