package sec02.exam01;
// ���� ��¥�� ����ϱ�
import java.text.*;
import java.util.*;

// ���� ��¥�� ����ϱ�
public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();	// import java.util.Date;
		String strNow1 = now.toString();
		System.out.println(strNow1);
		// System.out.println(now); toString�� �Ƚᵵ �ȴ�.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		// ���ϴ� ��¥ ���� ����
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	} 
}
/* ��°�
Fri May 13 22:30:35 KST 2022
2022�� 05�� 13�� 10�� 30�� 35��
*/