package 반복문;

public class exam01 {

	public static void main(String[] args) {
		int sum1 =0;
		int sum2 =0;
		int sum3 = 0;
		for (int i = 33; i <+ 222; i++) {
			sum1 += i;
			
		}
		System.out.println("33에서 222까지합 "+sum1);
		
		for (int i = 55; i <=4500; i+=2) {
			sum2 += i;
		}
		System.out.println("55부터 4500까지 2단위 합"+sum2);
		
		for (int i = 0; i <=6000; i+=5) {
			sum3+=i;
			
		}
		System.out.println("6000까지 5의배수 합"+sum3);
	}

}
