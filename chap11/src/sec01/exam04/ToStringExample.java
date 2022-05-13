package sec01.exam04;
// 객체의 문자 정보(toString() 메소드)
import java.util.*;

public class ToStringExample {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		
		Date obj2 = new Date();
		
		System.out.println(obj1.toString());
		// 클래스이름 다은에 해쉬값 나옴.
		
		System.out.println(obj2.toString());
		
	}
}
/* 출력값
java.lang.Object@24d46ca6
Wed May 11 08:41:40 KST 2022
*/