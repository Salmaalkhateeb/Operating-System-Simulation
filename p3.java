package threads;

public class p3 implements Runnable {

	public static void main(String[] args) {
		
	}

	@Override
	public void run() {
		System.out.println("In process 3");
		PrintSysCall ps = new PrintSysCall();
		for(int i = 0 ; i<301 ; i++) 
		{
			ps.SysCall(""+ i);
		}		
	}

}
