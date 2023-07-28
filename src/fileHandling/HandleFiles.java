package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class HandleFiles 
{
	
	public static void readprop() throws Exception
	{
	
		//File f = new File("./TestData/config.properties");
		
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);  //file will be loaded into memory 
		System.out.println(prop.get("name"));
		System.out.println(prop.get("url"));
		
	}

	public static void readfile() throws Exception
	{
		File f = new File("./TestData/abc.txt");  //file connection
		
		FileReader fr = new FileReader(f);
		
		//System.out.println(fr.read());
		
		int r = fr.read();  //84
		
		while(r!=-1)
		{
		
		System.out.print((char)r);
		r = fr.read();	
		}
		
	}
	
	public static void writefile() throws Exception
	{
		File f = new File("./TestData/xyz.txt");  //file connection
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("this is welcome message from Java");
		fw.flush();//save/commit
		fw.close();
		
		
	}
	
	public static void main(String[] args) throws Exception {
	//	HandleFiles.readfile();
		//HandleFiles.writefile();
		HandleFiles.readprop();
		
	}
	
}
