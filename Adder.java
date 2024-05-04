package thread.doubts;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
	Count count;
	Lock l;
	public Adder(Count count,Lock l) {
		this.count=count;
		this.l=l;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100000;i++) {
			l.lock();
			count.count+=i;
			l.unlock();
		}
	}


}
