package sec02.exam05;
// 라인 단위로 출력하기
import java.io.FileOutputStream;
import java.io.PrintStream;
//import java.util.Scanner;	// 임의로 추가

public class PrintStreamExample {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/printStream.txt");
		PrintStream ps = new PrintStream(fos);
		
		//Scanner sc = new Scanner(System.in);	// 임의로 추가
		//String a = sc.nextLine();				// 임의로 추가
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린트가 출력하는 것처럼");
		ps.println("데이터를 출력합니다.");
		//ps.println(a);	// 임의로 추가
		
		ps.flush();
		ps.close();
		
	}

}
/* 출력값
// 동작
Temp 폴더에 printStream.txt 파일이 생성됨
// 내용
[프린터 보조 스트림]
마치 프린트가 출력하는 것처럼
데이터를 출력합니다.
*/