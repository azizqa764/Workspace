package defaul;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_write_PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Read Properties file
		FileInputStream fs = new FileInputStream("C:\\Users\\AZIZ\\Documents\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		String s = prop.getProperty("browser");
		System.out.println(s);
		
		System.out.println(prop.getProperty("url"));
		//System.out.println(prop.getProperty("environment"));
	
		prop.setProperty("name", "raj");
		System.out.println(prop.getProperty("name"));
	
		prop.setProperty("tool", "selenium");
		System.out.println(prop.getProperty("tool"));
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\AZIZ\\Documents\\testing\\prop.properties");
		prop.store(fo, "Adding to file");
	
	}

}