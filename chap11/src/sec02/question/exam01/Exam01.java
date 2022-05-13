package sec02.question.exam01;
// Date와 SimpleDataFormat 클래스를 이용해서 오늘의 날짜 출력
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam01 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String str = sdf.format(now);
		System.out.println(str);
	}

}
/* 출력값
2022년 05월 13일 금요일 10시 42분
*/