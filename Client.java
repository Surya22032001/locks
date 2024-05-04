package thread.doubts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
	public static int var=0;
	public static void main(String []args) throws InterruptedException {
		Count c=new Count();
		
		Lock l=new ReentrantLock(); 
		
		Adder a=new Adder(c,l);
		Subractor s=new Subractor(c);
		
		Thread t=new Thread(a);
		Thread th=new Thread(s);
		
		t.start();
		th.start();
		
		t.join();
		th.join();

		
		System.out.println(c.count);
	}
}
