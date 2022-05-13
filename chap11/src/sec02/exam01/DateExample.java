package sec02.exam01;
// 현재 날짜를 출력하기
import java.text.*;
import java.util.*;

// 현재 날짜를 출력하기
public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();	// import java.util.Date;
		String strNow1 = now.toString();
		System.out.println(strNow1);
		// System.out.println(now); toString을 안써도 된다.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// 원하는 날짜 형식 설정
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	} 
}
/* 출력값
Fri May 13 22:30:35 KST 2022
2022년 05월 13일 10시 30분 35초
*/