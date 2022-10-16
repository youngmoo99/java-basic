package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// UTP용 소켓 
		DatagramSocket socket = new DatagramSocket(7100);
		// 받을때 byte 배열로받는다 
		byte[] data = new byte[256];
		// 미리 받아서 집어넣을 byte 배열을 만들어놓아야한다
		
		//받을 패킷을 만들어두자 
		DatagramPacket packet = new DatagramPacket(data,data.length);
		System.out.println("udp 받을준비중...");
		//패킷을 받자 
		socket.receive(packet);
		
		//받은 데이터를 스트링으로 변환해서 프린트 
		System.out.println(new String(data));
		
		socket.close();
	}

}
