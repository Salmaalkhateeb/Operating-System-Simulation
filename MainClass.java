package threads;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new p1());
		Thread t2 = new Thread(new p2());
		Thread t3 = new Thread(new p3());
		Thread t4 = new Thread(new p4());
		Thread t5 = new Thread(new p5());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	


	}

}
