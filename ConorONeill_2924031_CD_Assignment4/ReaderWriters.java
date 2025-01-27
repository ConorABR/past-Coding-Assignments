import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class TestThread {
	private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
	private static String message = "a";
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new WriterA());
		t1.setName("Writer A");
		
		Thread t2 = new Thread(new WriterB());
		t2.setName("Writer B");
		
		Thread t3 = new Thread(new Reader());
		t3.setName("Reader");
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
	}
	
	static class Reader implements Runnable {
		
		public void run() {
			if(lock.isWriteLocked()) {
				System.out.println("Write Lock Present.");
			}
			lock.readLock().lock();
			
			try {
				Long duration = (long) (Math.random() * 10000);
				System.out.println(Thread.currentThread().getName() + " Time Taken " + (duration/1000) + " seconds.");
				Thread.sleep(duration);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println(Thread.currentThread().getName() + ": " + message);
				lock.readLock().unlock();
			}
   		}
	}
	
	static class WriterA implements Runnable {
		
		public void run() {
			lock.writeLock().lock();
			
			try {
				Long duration = (long) (Math.random() * 10000);
				System.out.println(Thread.currentThread().getName() + " Time Taken " + (duration/1000) + "seconds.");
				Thread.sleep(duration);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				message = message.concat("a");
				lock.writeLock().unlock();
			}
		}
	}
	
static class WriterB implements Runnable {
		
		public void run() {
			lock.writeLock().lock();
			
			try {
				Long duration = (long) (Math.random() * 10000);
				System.out.println(Thread.currentThread().getName() + " Time Taken " + (duration/1000) + "seconds.");
				Thread.sleep(duration);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				message = message.concat("b");
				lock.writeLock().unlock();
			}
		}
	}
}