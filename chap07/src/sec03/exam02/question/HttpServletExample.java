package sec03.exam02.question;
//367p 문제3번
public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());	// 로그인 합니다.
		method(new FileDownloadServlet());	// 파일 다운로드 합니다.
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
/* 출력값
로그인 합니다.
파일 다운로드 합니다.
*/