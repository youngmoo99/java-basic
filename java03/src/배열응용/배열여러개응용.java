package 배열응용;

public class 배열여러개응용 {

	public static void main(String[] args) {
		// 배열 여러개를 응용해서 다양한 타입의 데이터 넣어보자
		String[] 식구 = {"아버지","어머니","나"};
		int[] 나이 = {50,55,20};
		double[] 키 = {177.7,132.2,155.3};
		
		for (int i = 0; i < 키.length; i++) {
			System.out.println(식구[i]+ " "+나이[i]+ " "+ 키[i]);
		}
		
	}
	


}
