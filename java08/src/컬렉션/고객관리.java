package 컬렉션;

import java.util.HashMap;

public class 고객관리 {

	public static void main(String[] args) {

		HashMap customer = new HashMap();
		customer.put(100, "김데이");
		customer.put(200, "김사전");
		customer.put(300, "김구조");
		customer.put(400, "김자료");

		customer.remove(200); // 200번 고객 탈퇴
		customer.put(300, "김충성"); // 300번 고객 개명

		System.out.println(customer);

	}

}
