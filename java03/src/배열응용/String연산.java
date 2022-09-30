package 배열응용;

public class String연산 {

	public static void main(String[] args) {
		//String sn = "931212-1035327";
		String s = "나는 프로그래머프야";
		String s2 = "진짜!";
		
		System.out.println(s +s2 ); //스트링 결합 
		System.out.println(s.concat(s2)); //스트링 결합 
		System.out.println(s.charAt(0)); //문자 1글자 추출 
		System.out.println(s.endsWith("야")); //특정한 문자로 끝나는 지 확인 
		System.out.println(s.substring(3)); //인덱스 3 이후 글자들 모두 추출 
		System.out.println(s.substring(3, 7)); //인덱스 3번째부터 6번째까지 추출
		System.out.println(s.contains(s2)); // s에 s2가 포함되어있는지 확인 
		System.out.println(s.lastIndexOf("프")); //s 프 글자 위치 
		System.out.println(s.toUpperCase()); // 대문자로 변경 
		System.out.println(s.toLowerCase()); //소문자로 변경 
		System.out.println(s.length()); //글자수 
		System.out.println(s.replace("나", "너"));
		

	}

}
