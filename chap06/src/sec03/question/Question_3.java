package sec03.question;

public class Question_3 {

	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Question_3(String title, String content) {
		this(title, content, "�α����� ȸ�����̵�", "���� ��ǻ�� ��¥", 0);
	}
	Question_3(String title, String content, String writer){
		this(title, content, writer, "���� ��ǻ�� ��¥", 0);
	}
	Question_3(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}
	Question_3(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

}
