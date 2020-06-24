package threads;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteSysCall extends SystemCall {

	public static void main(String[] args) throws IOException {
	

	}
	
	public  void SysCall(String filename , String str) throws IOException  {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/HP-PC/Desktop/" + filename + ".txt" , true));
			writer.append(' ');
			writer.append(str);
			writer.close();
	}
	
	public void SysCallNew(String filename ,String str) throws IOException {
	
		BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/HP-PC/Desktop/" + filename ));
		writer.write(str);
		writer.close();
		
	}

}
