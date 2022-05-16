package sec02.exam02;
// 파일 복사 성능 테스트
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
// 미리 sec02/exam02 폴더 안에 originalFile1.jpg 와 originalFile2.jpg가 있어야 한다.

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception{
		// 기본 스트림 생성
		String originalFilePath1 = 
		NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		// 버퍼 보조 스트림 연결
		String originalFilePath2 = 
		NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t"+ nonBufferTime + "ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때 :\t\t"+ bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();	// 시작 시간 저장
		
		// [파일 복사] 원본 파일에서 읽은 1byte를 타깃 파일로 바로 출력
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();	
		long end = System.nanoTime();	// 끝 시간 저장
		return (end-start);				// 복사에 걸린시간
	}

}
/* 출력값
// 동작
Temp 폴더에
targetFile1.jpg 와 targetFile2.jpg 가 생성
// 출력값
버퍼를 사용하지 않았을 때:	2942130300ns
버퍼를 사용했을 때 :		5772700ns
*/