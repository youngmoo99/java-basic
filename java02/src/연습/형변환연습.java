package 연습;

public class 형변환연습 {

	public static void main(String[] args) {
		int a= 100;
		byte b  =50;
		
		a=b; //큰공간 <--- 작은공간데이터(자동형변환)
		
		int c=200;
		b = (byte)c; // 작은공간 <---- 큰공간데이터(강제형변환) 

	}

}
