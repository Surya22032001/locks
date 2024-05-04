package thread.doubts;

public class Count {
	int count;
	public synchronized void add(int i) {
		count+=i;
	}
}
