package sec03.exam01;
// 키보드로부터 라인 단위 문자열 얻기
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.print("입력하세요 : ");
			String lineStr = br.readLine();
				// 라인 단위로 문자열을 읽음
			if(lineStr.equals("q") || lineStr.equals("quit")) break;
				// q 또는 quit를 읽었을 때 while 반복문 종료
			System.out.println("입력한 내용 : " + lineStr);
			System.out.println();
		}
		br. close();
	}
}
/* 출력값
입력하세요 : System.in
입력한 내용 : System.in

입력하세요 : 12345 ,()_+=$# ㅇㄹ
입력한 내용 : 12345 ,()_+=$# ㅇㄹ

입력하세요 : q
*/