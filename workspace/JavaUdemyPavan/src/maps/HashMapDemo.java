package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap <Integer,String>hm=new HashMap<Integer,String>(); //declaration
		
		//adding pairs to HashMap. key should be unique, value can be duplicated
		hm.put(101, "John");
		hm.put(102, "David");
		hm.put(103, "Smith");
		hm.put(104, "Scott");
		hm.put(105, "Kim");
		
		System.out.println(hm);
		
		//remove a pair
		hm.remove(103);
		System.out.println(hm);
		
		//read pairs
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m);
			//System.out.println(m.getKey()+"    "+m.getValue());
		}
	}
}