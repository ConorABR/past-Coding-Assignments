import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class VowelThread implements Callable<String>{
	
	public static void main(String[] args) {
		String str = "My brother knows Karl Marx, He met him eating mushrooms in the public park He said: 'What do you think of my manifesto?'- 'I like your manifesto, put it to the testo' Took me down to meet the anarchist party Met a groovy guy, he was arty farty Said: 'I know a little Latin, a kissen an a kai' Said: 'I dunno what it means', I said: 'Neither do I' Eat natural food baked twice daily Fill your nostrils up with gravy Don't drink tea and don't drink coffee Cover your chin in Yorkshire toffee.";
		// every example online is reading from a file in order to get the string
		// the whole thing fell apart when i tried to input the string differently
		// now we create the list to contain all the tasks
		List<Future<Integer>> futures= new ArrayList<>();
		// i have no idea what this is not accpeted list
		// every example i find online uses this format
		for (String str : args) {
			// creates a task for the current String
			FutureTask<Integer> future = new FutureTask<>(new CountVowel(str));
			// add the task to the list of tasks
			futures.add(future);
			// provide the task to the new Thread and start it
			new Thread(future).start();
		}
		int total = 0;
		// iterate over all the tasks
		for (FutureTask<Integer> task : futures) {
			// wait for the result to be found
			total += task.get();
		}
		// print the total number of vowels found
		System.out.printf("Number of vowels: %d%n", total);
	}
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}



public class CountVowel implements Callable<Integer> {
	private final String input;
	
	public CountVowel(String input) {
		this.input = input;		
	}
	
	public Integer call() {
		int vowels =  0;
		// now we cycle through the input strings to count the vowels
		for (int j = 0; j < input.length(); j++) {
			// now we make the string lower case to make things easier
			char ch = Character.toLowerCase(input.charAt(j));
			// now we use a switch statement
			switch (ch) {
				case 'a':
				case 'e':
				case 'o':
				case 'i':
				case 'u':
					vowels++;
					break;
			}
		}
		// returns total of vowels
		return vowels;
	}
}
}
