package super_java;

public class Animal {
	
	 String color = "white" ;
	
	void eating() {
		System.out.println("Eating ");
	}

}

class Dog extends Animal 
{
	String color = "black" ;
	
	void eating () {
		System.out.println("eating bread ");
		super.eating();
	}
	
	
	void display () {
		System.out.println(color);
		System.out.println(super.color);
	}
}


