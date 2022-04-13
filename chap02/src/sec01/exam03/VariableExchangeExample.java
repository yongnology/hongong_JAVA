package sec01.exam03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:"+x+", y:"+y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:"+x+", y:"+y);
	}

}
// x:3, y:5
// x:5, y:3