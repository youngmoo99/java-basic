package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {
		//1. 사이트에 연결해서,  html문서를 다 가져오자 
		try {
			Document doc = Jsoup.connect("http://www.naver.com").get();
//			System.out.println(doc);
			Elements list = doc.select(".nav"); // class가 nav인 태그 
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
				Element tag = list.get(i);
				System.out.println(i+ ": "+tag.text()); //<a> 메일 중에서 메일만 추출
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
