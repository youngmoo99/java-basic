package 연습;

public class Exam06 {

	public static void main(String[] args) {
		double yester = 80.5; 
		double today = 76.5;
		
		double diet = yester - today;
		
		if (diet > 2) {
			System.out.println("다이어트 성공!");
		} else {
			System.out.println("살 더빼세요");
		}

	}

}
