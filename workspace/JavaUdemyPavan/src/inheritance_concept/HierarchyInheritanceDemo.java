package inheritance_concept;

class Parent {
	//int a ;
	void display(int a )
	{
		System.out.println(a);
		}
	}

class Child1 extends Parent 
{
	//int  x ;
	void show(int x) {
		System.out.println(x);
	}
}

class Child2 extends Parent
{
	//int y ;
	void show(int y) {
		System.out.println(y);
	}
}

public class HierarchyInheritanceDemo {

	public static void main(String[] args) {
          Child1 c1 = new Child1() ;
         // c1.a = 100 ;
          c1.display(100);
          c1.show(200);
          
          Child2 c2 = new Child2();
         // c2.a = 200;
          //c2.y = 300 ;
          c2.display(10);
          c2.show(15);
	}

}
