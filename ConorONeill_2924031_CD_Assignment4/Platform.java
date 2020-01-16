/*
 * Name: Conor O'Neill
 * Student No: 2924031
 * Assignment no. 4
 * Question 1
 * 
 */

// i decided to use the ports example from the condition variable
// powerpoint, i just adapted it to fit the question asked. i hope
// that this is effective
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Platform {
	boolean spaces[] = new boolean[100];
	int available = 100;
	Lock lock = new ReentrantLock();
	Condition space = lock.newCondition();
	public Platform() {
		for(int j = 0; j < 100; j++)
			spaces[j] = true;
	}

public int getSpace() {
	lock.lock();
	try {
		while(available == 0) {
			try {
				space.await();
			} catch(InterruptedException e) {}
		}
		int k = 0;
		while(!spaces[k]) k++;
		spaces[k] = false; available--;
		return k;
	} finally { 
		lock.unlock(); 
	}
}

public void freeSpace(int k) {
	lock.lock();
	try {
		spaces[k] = true;
		available++;
		space.signal();
	} finally {
		lock.unlock();
	}
}
}