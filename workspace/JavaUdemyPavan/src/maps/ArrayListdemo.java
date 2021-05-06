package maps;

import java.util.ArrayList;

public class ArrayListdemo {


//	how to delcare arrraylist
//	how to add elements/value
//	find the size of arraylist
//	how to remove elements/value
		
	
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add("welcome");
		list.add(10);
		list.add(10.5);
		list.add(true);
		list.add('A');
		
		list.add(2,20);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		
		list.remove(3);
		System.out.println(list);
		
		for(Object i:list)  //object is predefiend class in java to store multiple type of valuue
		{
			System.out.println(i);
			
		}

	}

}