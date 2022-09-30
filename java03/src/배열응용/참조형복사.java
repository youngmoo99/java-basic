package 배열응용;

public class 참조형복사 {

	public static void main(String[] args) {
		//참조형복사(주소가 복사,얕은복사)
		int[] n1 = {100,200,300};
		int[] n2 = n1;
		
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		//주소가 같아서 n1만 바꿔도 n2도 바뀜
		
		int[] n3 = n1.clone();
		System.out.println("n1: "+n1);
		System.out.println("n3:  "+n3);
		System.out.println("값 변경하기전 ===========");
		for (int x : n1) {
			System.out.print(x+" ");
		}
		for (int x : n3) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("값 변경후 ===============");
		
		n3[0]=999;
		for (int x : n1) {
			System.out.print(x+" ");
		}
		for (int x : n3) {
			System.out.print(x+" ");
		}
	}

}
