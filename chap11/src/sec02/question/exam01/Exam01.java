package sec02.question.exam01;
// Date�� SimpleDataFormat Ŭ������ �̿��ؼ� ������ ��¥ ���
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam01 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		String str = sdf.format(now);
		System.out.println(str);
	}

}
/* ��°�
2022�� 05�� 13�� �ݿ��� 10�� 42��
*/