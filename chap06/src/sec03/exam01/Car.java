package sec03.exam01;
// 생성자 선언
public class Car {
	// 필드(Field)
	
	// 생성자(Constructor)
	Car(String color, int cc){
		System.out.println(color);		//아래 세줄. 강의내용 추가
		System.out.println(cc);
		System.out.println(color + "색의 "+cc+"cc 자동차가 생성됨");

	}
}
/* 출력값
검정
3000
검정색의3000cc 자동차가 생성됨
*/