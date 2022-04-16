package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-------------------");
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("-------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("-------------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------");
		z = ++z;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-------------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
/* Ãâ·Â°ª
-------------------
x = 12
-------------------
y = 8
-------------------
z = 12
x = 13
-------------------
z = 13
x = 13
*/