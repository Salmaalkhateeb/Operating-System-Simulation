package threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadSysCall extends SystemCall {
	
	



	public  void SysCall(String l) throws IOException {
		
		
		String filename = "/Users/HP-PC/Desktop/" + l + ".txt";
		File file = new File(filename);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
	}
	}
