package 반복문;

public class For문연습3 {

	public static void main(String[] args) {
		int sum = 0;
		int sum2 =0;
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			sum += i;
			
		}
		System.out.println(sum);
		
		System.out.println("-----------");
		
		//3부터 11까지 
		for (int i=3; i<12; i++) {
			sum2 +=i;
		}
		System.out.println(sum2);
	}

}
