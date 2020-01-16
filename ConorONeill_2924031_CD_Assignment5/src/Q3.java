
interface Arithmetic {
	int operation(int a, int b);
}

public class Q3 {
	
		private static int first = 10;
		private static int second = 4;
	
		public static void main(String[] args) throws InterruptedException {
			
			Thread t1 = new Thread(new Addition());
			Thread t2 = new Thread(new Subtraction());
			Thread t3 = new Thread(new Multiplication());
			t1.start();
			t2.start();
			t3.start();
			t1.join();
			t2.join();
			t3.join();
		}
		
		static class Addition implements Runnable {
			public void run() {
				// addition using Lambda expression
				Arithmetic addition = (int a, int b) -> (a + b);
				System.out.println("Addition = " + addition.operation(first,  second));
			}
			
		}
		
		static class Subtraction implements Runnable {
			public void run() {
				// subtraction using Lambda expression
				Arithmetic subtraction = (int a, int b) -> (a - b);
				System.out.println("Subtraction = " + subtraction.operation(first, second));
			}
		}
		
		static class Multiplication implements Runnable {
			public void run() {
				// multiplication using Lambda expression
				Arithmetic multiplication = (int a, int b) -> (a * b);
				System.out.println("Multiplication = " + multiplication.operation(first,  second));
			}
		}
}
