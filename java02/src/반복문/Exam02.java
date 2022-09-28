package 반복문;

public class Exam02 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 1000; i+=3) {
			if (i %5 !=0) {
				sum += i;
				if(sum >100) {
					break;
				}
			}
	
		}
		System.out.println(sum);

	}

}
