package sec03.exam03;
// File 클래스를 이요한 파일 및 폴더 정보 출력
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception{
		// File 객체 생성
		File dir = new File("C:/Temp/hongong/images");
		File file1 = new File("C:/Temp/hongong/file1.txt");
		File file2 = new File("C:/Temp/hongong/file2.txt");
		File file3 = new File("C:/Temp/hongong/file3.txt");
		
		// 파일 또는 폴더가 존재하지 않으면 생성
		// 폴더 생성
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		// 파일 생성
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		// C:/Temp 폴더의 내용 목록을 FIle 배열로 얻음
		File temp = new File("C:/Temp/hongong/");
		File[] contents = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("---------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}

}
/* 출력값
// 동작
Temp/hongong 폴더 안에
file1.txt 
file2.txt
file3.txt파일 생성
images 폴더생성

// 출력값
시간			형태		크기	이름
---------------------------------------------------------
2022-05-16 오후 22:24			382	board.db
2022-05-17 오전 00:27			0	file1.txt
2022-05-17 오전 00:27			0	file2.txt
2022-05-17 오전 00:27			0	file3.txt
2022-05-17 오전 00:27	<DIR>			images

*/