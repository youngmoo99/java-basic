package Test;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 입력화면만들기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JButton plus = new JButton("더하기");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//plus버튼을 눌렀을때 처리하고 싶은 내용을 넣는다 
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				JOptionPane.showMessageDialog(f, num11+num22);
				f.setTitle("더한결과"+(num11+num22));
			}
		});
		plus.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		plus.setBounds(62, 274, 136, 57);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("빼기");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				JOptionPane.showMessageDialog(f, num11-num22);
			}
		});
		minus.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		minus.setBounds(276, 274, 136, 57);
		f.getContentPane().add(minus);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 23));
		lblNewLabel.setBounds(71, 75, 115, 57);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("숫자2");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(71, 182, 115, 57);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(175, 86, 165, 42);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(175, 193, 165, 42);
		f.getContentPane().add(t2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\coding\\multicam\\java-workspace\\java01\\gimochi.jpg"));
		btnNewButton_2.setBounds(118, 10, 253, 55);
		f.getContentPane().add(btnNewButton_2);
		
		JButton mul = new JButton("곱하기");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "곱하기 버튼을 누르셨군요.");
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				JOptionPane.showMessageDialog(f, num11*num22);
			}
		});
		mul.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		mul.setBounds(62, 367, 136, 57);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("나누기");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나누기 버튼을 누르셨군요.");
				String num1 = t1.getText();
				String num2 = t2.getText();
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				JOptionPane.showMessageDialog(f, num11/num22);
			}
		});
		div.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		div.setBounds(276, 367, 136, 57);
		f.getContentPane().add(div);
		f.setVisible(true);

	}

}
