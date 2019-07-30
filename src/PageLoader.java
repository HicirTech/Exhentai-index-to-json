import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jsoup.*;

public class PageLoader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File input = new File("./index/exhentai_page_1.html");
		Document doc = Jsoup.parse(input, "UTF-8");
	    Elements eles = doc.getElementsByClass("gl4e glname");
	    
	    for (Element ele : eles) {
	    	System.out.println("--------------------------------");
	       // System.out.println(ele.getElementsByClass("glink"));
	    	System.out.println(ele);
    }

	}

}
