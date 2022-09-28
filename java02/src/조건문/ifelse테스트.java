package 조건문;

public class ifelse테스트 {

	public static void main(String[] args) {
		int jumsu = 88;
		String result ="";
		
		if (jumsu >=90) {
			result ="A학점";
		}else if(jumsu >=85) {
			result ="B+학점";
		}else if(jumsu >=80) {
			result ="B학점";
		}else if(jumsu >=70) {
			result ="C학점";
		}else {
			result ="D학점";
		}
		
		System.out.println("당신의 학점은 "+result);
	}
}
