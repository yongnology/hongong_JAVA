package sec03.exam02.question;
//367p ����3��
public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());	// �α��� �մϴ�.
		method(new FileDownloadServlet());	// ���� �ٿ�ε� �մϴ�.
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
/* ��°�
�α��� �մϴ�.
���� �ٿ�ε� �մϴ�.
*/