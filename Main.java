package editor;
import java.io.*;

public class Main
{ 
	static OptionFile of = new OptionFile();
	
	public static void main(String [] args)
	{
		System.out.println("Put PES5 OF in same folder with this app, name it KONAMI-WIN32PES5OPT and press enter!");
		String input = System.console().readLine();
		of.readXPS(new File("KONAMI-WIN32PES5OPT"));
		dumpDecoded("dump.bin");
		System.out.println("Decoded and dumped to dump.bin!");
		
	}

	
	public static void dumpDecoded(String fName)
	{
		try (FileOutputStream fos = new FileOutputStream(fName)) 
		{
   			fos.write(of.data);
   			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
