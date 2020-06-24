package threads;

public class p4 implements Runnable{

	public static void main(String[] args) {
		
	}

	@Override
	public void run() {
		System.out.println("In process 4");
		PrintSysCall ps = new PrintSysCall();
		for(int i = 500 ; i<1001 ; i++) 
		{
			ps.SysCall(""+ i);
		}		
	}

}
