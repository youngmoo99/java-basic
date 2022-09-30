package 배열응용;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(200,200);
		
		String[] header = {"컴퓨터","영어","수학","체육"};
		String[][] contents = {
				{"60","87","79","78"},
				{"90","83","89","79"},
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"},
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"},
				{"100","88","99","77"}
		};
		contents[5][3] = "66";
		
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		//맨 끝에 넣어야함.
		f.setVisible(true);

		//이중 for문 
		System.out.println("컴퓨터 영어 수학 체육");
		for (int i = 0; i < contents.length; i++) {
			for(int j=0; j<contents[i].length; j++) { //열의 개수
				System.out.print(contents[i][j]+ " ");
			}
			System.out.println();
			
		}
	}

}
