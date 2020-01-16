
public class Q2 {
	/*
	 * Class: Ticket
	 *
	 * DO NOT EDIT!
	 */

	class Ticket {
		private final int a,b;

		Ticket(int a1, int b1){
			a = a1; b = b1;
		}

		public int a(){
			return a;
		}

		public int b(){
			return b;
		}

		public String toString(){
			return "["+a+","+b+"]";
		}
	}

	class TicketManager {
		private Ticket[] tickets;
		private int sold = 0;
		private int maxTickets = 500;

		TicketManager(Ticket[] t1, int s, int mT) {
			tickets = t1;
			sold = s;
			maxTickets = mT;
		}

		public boolean buy(Ticket t){
			// Add the ticket to the next available slot in the list
			for (int i = 0; i <= tickets.length; i++) {
				if (tickets[i] == null) {
					tickets[i] = t;
				} else {
					return false;
				}
			}
			return true;
		}

		public boolean buy(){
			// Generate and add the ticket to the next available slot in the list
			Ticket t1 = new Ticket(5,1);
			for (int i = 0; i <= tickets.length; i++) {
				if (tickets[i] == null) {
					tickets[i] = t1;
				} else {
					return false;
				}
			}
			return true;
		}

		public int freqWinner(Ticket t){
			// Count how many tickets match the winning ticket drawn
			int counter = 0;
			for (int i = 0; i <= tickets.length; i++) {
				if (tickets[i] == t) {
					counter = counter + 1;
				}
			}
			return counter; 
		}

		public Ticket[] getWinners(Ticket t){
			// Return a list of all tickets that match the winning ticket drawn
			// Do not break encapsulation!
			Ticket[] winners = new Ticket[100];
			for (int i = 0; i <= tickets.length; i++) {
				if (tickets[i] == t) {
					for (int j = 0; j <= winners.length; j++) {
						winners[j] = t;
					}
				}
			}
			return winners;
		}

		public boolean search(Ticket t){
			// return true if a matching ticket is in the list
			for (int i = 0; i <= tickets.length; i++) {
				if (tickets[i] == t){
					return true;
				}
			}
			return false;
		}

		public int sold(){
			// The number of tickets sold
			int counter = 0;
			for (int i = 0; i <= tickets.length; i++) {
				while (tickets[i] != null) {
					counter = counter + 1;
				}
			}
			return counter;
		}

		public boolean allsold(){
			// Return true if all tickets have been sold
			for (int i = 0; i <= tickets.length; i++) {
				if (tickets[i] == null) {
					return true;
				}
			}
			return false;
		}

		public String toString(){
			if(sold == 0)
				return "[]";

			String s = "[";
			for(int j = 0; j < sold - 1; j++) {
				s = s + tickets[j] + ",";
			}
			return s+tickets[sold-1]+"]";
		}
	}
}
