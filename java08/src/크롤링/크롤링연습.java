package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서, html문서를 다 가져오자
		try {
			Document doc = Jsoup.connect("https://news.naver.com/?viewType=pc").get();
	//		System.out.println(doc);
			Elements list = doc.select(".Nitem_link_menu"); // class가 code인 태그
			System.out.println(list.size());

//				System.out.println(list.get(i));
//			for (int i = 0; i < list.size(); i++) {
//				Element tag = list.get(i); //태그 빼기 
//				System.out.println(i+": "+tag.text()); 
//			}
//			Element tag = list.get(); //태그 빼기 
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i); // 태그 빼기
				System.out.println(i + ": " + tag.text());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
