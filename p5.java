package threads;

import java.io.IOException;

public class p5 implements Runnable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


}

	@Override
	public void run() {
		boolean x = false;
		int temp;
			
		TakeInputSysCall ts = new TakeInputSysCall();
		System.out.println("Enter value 1 (p5)");
		int value1 = Integer.parseInt(ts.SysCall());
		System.out.println("Enter value 2 (p5)");
		int value2 = Integer.parseInt(ts.SysCall());
		int counter = 0;
		//System.out.println("got here");
		
		if(value1 > value2) {
			
			while(value1>value2) {
				counter++;
				value2++;
			}
			
		}
		else {
			while(value2>value1) {
				counter++;
				value1++;
		}
			
		
			
		
		
	}
		WriteSysCall ws = new WriteSysCall();
		System.out.println("Please Enter the new file name");
		String filename = ts.SysCall();
		String str = counter +"";
		System.out.println(counter);
		try {
			ws.SysCallNew(filename, str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
