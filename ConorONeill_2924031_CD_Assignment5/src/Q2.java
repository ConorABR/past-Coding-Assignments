import java.util.concurrent.atomic.AtomicIntegerArray;

public class Q2 {
	
		private static AtomicIntegerArray at = new AtomicIntegerArray(50);
		
		public static void main(String[] args) throws InterruptedException {
			for (int i=0; i<at.length(); i++) {
				at.set(i, 1);
			}
			
			Thread t1 = new Thread(new Increment());
			Thread t2 = new Thread(new Compare());
			Thread t3 = new Thread(new Sleep());
			t1.start();
			t2.start();
			t3.start();
			t1.join();
			t2.join();
			t3.join();
			System.out.println("all threads are finished. AtomicIntger array's values are : ");
			for (int i=0; i<at.length(); i++) {
				System.out.println(i + "-" + at.get(i));
			}
		}
		
		static class Increment implements Runnable {
			
			public void run() {
				for(int i=0; i<at.length(); i++) {
					int add = at.incrementAndGet(i);
				}
			}
		}
	
		static class Compare implements Runnable {
		
			public void run() {
				for(int i=0; i<at.length(); i++) {
					int idx = i; // index where operation is performed
					int expect = 5; // value operation is looking for
					int update = -1; // new value is expect is true
					at.compareAndSet(idx, expect, update);
				}
			}
		}
			
		static class Sleep implements Runnable {
		
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}

