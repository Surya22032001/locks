package thread.doubts;

public class Subractor implements Runnable {
	Count count;
	public Subractor(Count count) {
		this.count=count;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100000;i++) {
			count.add(-i);
		}
	}

}
