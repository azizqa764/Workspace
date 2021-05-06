package settersgetters;

public class ClassDemo {

	public static void main(String[] args) {
         
		Car bmw = new Car();
		
		bmw.setMake("BMW");
		System.out.println(bmw.getMake());
		
		Car benz = new Car();
		
		benz.setYear(1800);
		System.out.println(benz.getYear());
	}

}
