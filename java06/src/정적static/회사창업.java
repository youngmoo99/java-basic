package 정적static;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동",25,'여');
		직원 work2 = new 직원("김길동",24,'여');
		직원 work3 = new 직원("송길동",26,'남');
		
		//우리 회사 직원수
		System.out.println("회사 직원 수 : "+직원.person);
		
		//직원 정보 
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		
		//직원들 평균 나이 
		System.out.println("직원들 평균나이 "+직원.getAvg());
		

	}

}
