package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerA extends JFrame{
	DatagramSocket socket;
	JTextArea list; //채팅내용 리스트 
	JTextField input; //채팅내용입력
	
	public MessengerA() throws Exception {
		// 받는 소켓 
		socket = new DatagramSocket(7777);
		setTitle("메신저A");
		setSize(500,500);
		list = new JTextArea();
		input = new JTextField();
		
		add(list,BorderLayout.CENTER);
		add(input,BorderLayout.SOUTH);
		
		Font font = new Font("궁서",Font.BOLD,30);
		list.setFont(font);
		input.setFont(font);
		
		list.setBackground(Color.green);
		input.setBackground(Color.yellow);
		
		list.setForeground(Color.blue);
		input.setForeground(Color.red);
		
		// list 수정불가
		list.setEditable(false);
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// list append 
				list.append("나 >> "+input.getText()+"\n");
				
				// socket을 만들어서 패킷을 보냄 
				try {
					DatagramSocket socket = new DatagramSocket();
					
					// packet은 ip, port, data를 실어줘야함 
					//ip는 해당 부품으로 만들어주어야 함
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					
					//packet의 데이터는 byte배열로 만들어서 보내야 한다.
					String str = input.getText();
					byte[] data = str.getBytes();
					
					//UDP packet 필요 
					DatagramPacket packet = new DatagramPacket(data,data.length, ip,5555);
					//socket을 이용해서 packet을 보내자 
					socket.send(packet);
					socket.close();
					input.setText(""); // 엔터치고 공백
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		setVisible(true);
		
	}
	
	public void process() throws Exception {
		while (true) {
			
			// 받을때 byte 배열로받는다 
			byte[] data = new byte[256];
			// 미리 받아서 집어넣을 byte 배열을 만들어놓아야한다
			
			//받을 패킷을 만들어두자 
			DatagramPacket packet = new DatagramPacket(data,data.length);
			System.out.println("udp 받을준비중...");
			//패킷을 받자 
			socket.receive(packet);
			
			//받은 데이터를 스트링으로 변환해서 프린트 
			list.append("너 >> "+new String(data)+ "\n");
			
			//socket.close();
			
		}
	}
	public static void main(String[] args) throws Exception {
		MessengerA name = new MessengerA();
		name.process(); // 받는쪽 먼저 실행 

	}

}
