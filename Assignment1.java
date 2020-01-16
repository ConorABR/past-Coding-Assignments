
import java.util.Arrays;
import java.util.Scanner;

/* Assignment 1
 *
 * @author: Conor O'Neill
 * @Student Number: 2924031
 */
public class Assignment1{
    public static void main(String[] args) {
    	 //==================================================
       //Test code for Question 1
    	Thread p = new CoinTosser();
    	p.start();
    	try {
    		p.join();
    	} catch(InterruptedException e){}
       //==================================================
       //Test code for Question2
    	Scanner in = new Scanner(System.in);
    	in.nextLine();
    	System.out.println("Press enter to stop the printer");
    	Thread t = new MsgPrinter("Hello World", 10);
    	t.start();
    	try {
    		t.join();
    	} catch(InterruptedException e){}
    	System.out.println("All messages are printed");
    	((MsgPrinter) t).terminate();
       //==================================================
       //Test code for Question3
    	Thread q = new DiThrower();
    	Thread q1 = new DiThrower();
    	q.start(); q1.start();
    	try {
    		q.join(); q1.join();
    	} catch(InterruptedException e){}
    	
    }
}
//=========================================================
// Code for thread classes here

class CoinTosser extends Thread {
  //code Question 1 here
	
	private int Heads = 0; 
	private int Tails = 1;
	private int headCounter = 0;
	private int tailsCounter = 0;
	private int range = Tails - Heads + 1; // this defines the range for math.random()
	CoinTosser(){}
	
	
	public void run() {
		int k = 0;
		while (k < 1000) {
			int rand = (int)(Math.random() * range) + Tails; 
			if (rand == Heads) {
				headCounter = headCounter + 1;
			} else {
				tailsCounter = tailsCounter + 1;
			}
			k++;
		}
		System.out.print("the results are: Heads - " + headCounter + ", Tails - " + tailsCounter);
	}
}


class MsgPrinter extends Thread {
	//code for Question 2 here
	private String message;
	private int n;
	private volatile boolean go = true;
	MsgPrinter(String m, int p) {
		message = m; n = p;
	}
	
	public void run() {
		int k = 0; 
		while (k < n) {
			System.out.println(message);
			try {
				Thread.sleep(100);
			} catch(InterruptedException e){}
			k++;
		}
			
	}
	
	public void terminate(){go = false;}
}


class DiThrower extends Thread{
	//Code for Question 3 here
	private int die;
	private int sum;
	DiThrower(){}
	
	public void run() {
		int k = 0;
		while (k <= 100) {
			die = (int)(Math.random()*6) + 1;
			int thrownList[] = new int[200];
			for( int j = 0; j < thrownList.length; j++) {
				thrownList[j] = die;
			}
			sum = sum + die;
			k++;
		}
	}
	
	public void countFreq(int arr[], int n) {
		boolean visited[] = new boolean[n];
		Arrays.fill(visited, false);
		// now we will traverse through the array to calculate the frequencies
		for (int i = 0; i < n; i++) {
			
			// this skips the element if its already processed
			if (visited[i] == true) {
				continue;
			}
			
			// count frequency
			int count = 1;
			for (int j = i + 1; j <= n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}
}


