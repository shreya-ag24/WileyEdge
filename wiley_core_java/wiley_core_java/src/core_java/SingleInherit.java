package core_java;

class Animal{
	public void eat() {
		System.out.println("Eat");
	}
	
	public void sleep() {
		System.out.println("Sleep");
	}
	
}
class Lion extends Animal {
	public void roar()
	{
		System.out.println("Lion is roaring");
	}
}
public class SingleInherit {

	public static void main(String[] args) {
		Lion l= new Lion();
		l.eat();
		l.sleep();
		l.roar();
	}

}
