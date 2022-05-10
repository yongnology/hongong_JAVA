package sec01.exam05;
// ClasscastException
public class ClasscastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;	// ClasscastException 발생
	}
		/* 위의 정상 코드
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
		*/
	
}

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}