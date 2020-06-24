package threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class p1 implements Runnable {

	
	
	 
public static void main(String[]args) throws IOException {

	
}

@Override
public void run() {

System.out.println("In process 1");
System.out.println("Please enter the file to be read");
ReadSysCall rs = new ReadSysCall();
TakeInputSysCall ts = new TakeInputSysCall();
String k = "";
k = ts.SysCall();
try {
	rs.SysCall(k);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
}



}