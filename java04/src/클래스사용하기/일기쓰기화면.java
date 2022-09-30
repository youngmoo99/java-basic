package 클래스사용하기;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextArea t3;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.BOLD, 12));
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				//자바프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할때는 
				// 프로그램이 실행되지 못하는 위험한 상황으로 인식해서 
				// 반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야 한다.
				//try ~catch
				try {
					FileWriter file = new FileWriter(s2+".txt");
					file.write(s1 + "\n"); // \n이면 엔터를 넣어준다 
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					//스트림이 닫힐때 데이터를다 보냈다고 인식함.
					file.close();
				} catch (Exception e1) {
					System.out.println("파일 저장중 에러 발생함.");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\coding\\multicam\\java-workspace\\java04\\zeros.png"));
		btnNewButton.setBounds(72, 293, 331, 117);
		f.getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(208, 30, 195, 31);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(208, 95, 195, 31);
		f.getContentPane().add(t2);
		
		t3 = new JTextArea();
		t3.setColumns(10);
		t3.setBounds(208, 173, 195, 103);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel = new JLabel("오늘날짜:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(55, 38, 112, 23);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘제목:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(55, 103, 112, 23);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘 내용:");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(55, 173, 112, 23);
		f.getContentPane().add(lblNewLabel_2);
		
		
		f.setVisible(true);

	}

}
