package firstcode;

public class StringMethods {

	public static void main(String[] args) {
		
		        String s = "Welcome" ;
		        String s1 = " to selenium";
		        
		        //Length
		        System.out.println(s.length());
		        
		        //concat - we can join multiple strings 
		        System.out.println(s+" "+s1);
		        System.out.println(s.concat(s1));
		        
		        //trim
		        System.out.println(s1.trim());
		        
		        //CharAt
		        
		        System.out.println(s1.charAt(7));
		        
		        //contains 
	            System.out.println(s.contains("come"));
	            
	            //equals() & equalsIgnoreCase()
	            
	            s="Welcome";
	            System.out.println(s.equals("Welcome"));
	            System.out.println(s.equals("welcome "));
	            
	            //replace 
	            s="welcome to java welcome to selenium ";
	            
	           System.out.println(s.replace('e', 'a'));
	           System.out.println(s.replace("welcome", "hate")); 
	           
	           //substring
	           System.out.println(s.substring(1,3));
	           System.out.println(s.substring(1,7));
	
	}

}
