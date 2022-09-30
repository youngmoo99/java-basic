package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		String[] header = {"a","b","c"};
		String[][] contents = {
				{"1","2","3"},
				{"4","5","6"},
				{"7","8","9"}
		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		
		f.setVisible(true);

	}

}
