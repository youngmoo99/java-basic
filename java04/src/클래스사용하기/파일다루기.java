package 클래스사용하기;

import java.io.FileFilter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class 파일다루기 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		
		//자바프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할때는 
		// 프로그램이 실행되지 못하는 위험한 상황으로 인식해서 
		// 반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야 한다.
		//try ~catch
		try {
			FileWriter file = new FileWriter(s1+".txt");
			file.write(s1 + "\n"); // \n이면 엔터를 넣어준다 
			file.write(s2 + "\n");
			file.write(s3 + "\n");
			//스트림이 닫힐때 데이터를다 보냈다고 인식함.
			file.close();
		} catch (Exception e) {
			System.out.println("파일 저장중 에러 발생함.");
		}
	}

}
