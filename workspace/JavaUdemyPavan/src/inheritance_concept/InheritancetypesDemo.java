package inheritance_concept;

//SINGLE INHERITANCE 


class A  //parent
{
	int  a ;
	void display() {
		System.out.println(a);
	}
}

class B extends A  // b is a child class
{
	int b ;
	void print () {
		System.out.println(b);
	}
}

class C extends B
{
	int c ;
	void show() {
		System.out.println(c);
	}
}
public class InheritancetypesDemo {

	public static void main(String[] args) {
		
		A aobj =  new A();
		aobj.a = 100 ;
		aobj.display();
		
		B bobj = new B();
		bobj.a = 10 ;
		bobj.b = 20;
		bobj.display();
		bobj.print();
		
		C cobj = new C() ;
		cobj.a =  15;
		cobj.b = 25;
		cobj.c = 10 ;
		cobj.display();
		cobj.print();
		cobj.show();
		

	}

}
