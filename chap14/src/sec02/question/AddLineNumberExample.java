package sec02.question;
// 라인 번호를 입력
import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception{
		String filePath ="src/sec02/question/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while( (rowData = br.readLine()) != null) {
			System.out.println(++rowNumber + " : " + rowData);
		}
	}

}
/* 출력값
1 : package sec02.question;
2 : // 라인 번호를 입력
3 : import java.io.BufferedReader;
4 : import java.io.FileReader;
5 : 
6 : public class AddLineNumberExample {
7 : 
8 : 	public static void main(String[] args) throws Exception{
9 : 		String filePath ="src/sec02/question/AddLineNumberExample.java";
10 : 		
11 : 		FileReader fr = new FileReader(filePath);
12 : 		BufferedReader br = new BufferedReader(fr);
13 : 		
14 : 		int rowNumber = 0;
15 : 		String rowData;
16 : 		while( (rowData = br.readLine()) != null) {
17 : 			System.out.println(++rowNumber + " : " + rowData);
18 : 		}
19 : 	}
20 : 
21 : }
*/