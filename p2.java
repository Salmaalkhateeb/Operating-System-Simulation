package threads;

import java.io.IOException;

public class p2 implements Runnable{

	public static void main(String[]args) throws IOException {
		
		
		
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("in process 2");
			ReadSysCall rs = new ReadSysCall();
			TakeInputSysCall ts = new TakeInputSysCall();
			System.out.println("Please enter the file to be written in");
			String file = ts.SysCall();
			System.out.println("Please enter the text to be written");
			String text = ts.SysCall();
			WriteSysCall ws = new WriteSysCall();
			try {
				ws.SysCall(file,text);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
