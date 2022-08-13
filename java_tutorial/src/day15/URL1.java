package day15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class URL1 {
	public static void main(String[] args) {
		Crawling c = new Crawling();
		c.webReader("https://movie.naver.com/movie/sdb/rank/rmovie.naver");
	}
}

class Crawling{
	URL url = null;
	InputStream i = null;
	InputStreamReader in = null;
	BufferedReader b = null;
	private String str = null;
	ArrayList<String> parsearray = new ArrayList<>();
	
	public void webReader(String address) {
		try {
			url = new URL(address);
			i = url.openStream();
			in = new InputStreamReader(i, "UTF-8");
			b = new BufferedReader(in);
			
			while ((str = b.readLine()) != null) {
				if(str.contains("class=\"blind\"") && str.contains("<li class=\"ranking")) {
					String parse = "";
					parse = str.substring(str.indexOf("title=")+7, str.indexOf("><span")-1);
					parsearray.add(parse);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < parsearray.size(); i++) {
			System.out.println(parsearray.get(i));
		}
	}
}