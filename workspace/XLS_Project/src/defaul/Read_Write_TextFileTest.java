package defaul;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_TextFileTest {

	public static void main(String[] args) throws IOException {
		
		//creating
		File f = new File("C:\\Users\\AZIZ\\Documents\\testing\\temp.txt");
		f.createNewFile();
	
		//writing into test file
		FileWriter w = new FileWriter("C:\\Users\\AZIZ\\Documents\\testing\\temp.txt");
		BufferedWriter out = new BufferedWriter(w);
		out.write("hello we are writing in a afile");
		out.newLine();
		out.write("This is a new line 1");
		out.newLine();
		out.write("This is a new line 2");
		out.newLine();
		out.write("This is a new line 3");
		out.newLine();
		out.write("This is a new line 4");
		out.flush();
		out.close();
	
		//read text file
		FileReader r = new FileReader("C:\\Users\\AZIZ\\Documents\\testing\\temp.txt");
		BufferedReader rd = new BufferedReader(r);
	
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		rd.close();*/
		
		int i=0;
		String a ;
		while((a=rd.readLine()) != null) {
			System.out.println(a);
			i++;
		}
		System.out.println(i);
	
	}

}