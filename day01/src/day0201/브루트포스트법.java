package day0201;

public class 브루트포스트법 {
	public static void main(String[] args) {
		String s1 = "ABC이지스DEF";
		String s2 = "이지스";
		int idx = bfMatch(s1, s2);
		if (idx == 1) {
			System.out.println("텍스트에 패턴이 없습니다");
		} else {
			// 일치하는 문자 바로 앞까지의 문자 개수를 반각 문자로 환산하여 구함
			int len = 0;
			for (int i = 0; i < idx; i++) {
				len += s1.substring(i, i + 1).getBytes().length;
			}
			len += s2.length();

			System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
			System.out.println("텍스트 : " + s1);
			System.out.printf(String.format("패   턴: %%%ds\n", len), s2);
		}
	}

	private static int bfMatch(String txt, String pat) {
		int pt = 0;
		int pp = 0;
		System.out.println(txt.length() + " " + pat.length());
		while (pt != txt.length() && pp != pat.length()) {
			if (txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if (pp == pat.length())
			return pt - pp;
		return -1;
	}
}
