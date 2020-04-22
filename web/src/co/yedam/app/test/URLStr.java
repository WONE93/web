package co.yedam.app.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLStr {
	
	public static void main(String[] args) throws IOException {
		String urlStr = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=430156241533f1d058c603178cc3ca0e&targetDt=20200421";
		URL url = new URL(urlStr);  //XHR 생성
		BufferedReader bf;
		String line = "";
		String result = "";
		
		//영화박스 오피스 정보를 받아옵니다.
		bf = new BufferedReader(new InputStreamReader(url.openStream())); //open
		
		//버퍼에 있는 정보를 하나의 문자열로 변환.
		while((line=bf.readLine())!=null) {
			result=result.concat(line);
		}
		System.out.println(result);
	}
}
