package sec01.exam09;

public class ResourcePathExample {
	
	public static void main(String[] args) {
	
		Class clazz = ResourcePathExample.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
/* Ãâ·Â°ª
/C:/github/hongong_JAVA/chap11/bin/sec01/exam09/photo1.jpg
/C:/github/hongong_JAVA/chap11/bin/sec01/exam09/images/photo2.jpg
*/