/* 
* Conor O'Neill
* 2924031
*/
import java.util.*;
import java.util.LinkedList;
public class myStack {
	
	static class LinkedList<T> {
		
		private class Node<T> {
			private final T data;
			private Node<T> next;
			
			public Node(T data) {
				this.data = data;
			}
			
			@Override
			public String toString() {
				return data.toString();
			}

			public int compareTo(T x) {
				// TODO Auto-generated method stub
				return 0;
			}
		}
		
		private Node<T> first = null;
		public LinkedList<T> Next;
		
		public void addFirst(T data) {
			Node<T> newFirst = new Node<T>(data);
			newFirst.next = first;
			first = newFirst;
		}
		
		public T removeFirst() {
			Node<T> oldFirst = first;
			first = first.next;
			return oldFirst.data;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			Node current = first;
			while (current != null) {
				builder.append(current).append(" ");
				current = current.next;
			}
			return builder.toString();
		}
		
		public boolean isEmpty() {
			return first == null;
		}
		
		public boolean isFull() {
			return first != null;
		}

		public static int size() {
			return LinkedList.size();
		}
		
		public Node<T> returnFirst() {
			return first;
		}
		
	}
	
	class LinkListStack<T> {
		private final LinkedList<T> linkedList = new LinkedList<>();
		
		public void push(T data) {
			linkedList.addFirst(data);
		}
		
		public T pop() {
			return linkedList.removeFirst();
		}
		
		public boolean isEmpty() {
			return linkedList.isEmpty();
		}
		
		public boolean isFull() {
			return linkedList.isFull();
		}
		
		public int size() {
			return LinkedList.size();
		}
		
		public LinkedList<T>.Node<T> getFirst() {
			return linkedList.returnFirst();
		}
		
		public LinkedList<T> search(T x) {
			boolean found = false;
			LinkedList<T> tempList = linkedList;
			while(tempList != null) {
				if(tempList.returnFirst().compareTo(x)==0) {
					found = true;
					break;
				}
				tempList = tempList.Next;
			}
			return tempList;
		}
		
		public int freq(T x) {
			int counter = 0;
			LinkedList<T> tempList = linkedList;
			while(tempList != null) {
				if(tempList.returnFirst().compareTo(x)==0) {
					counter = counter+1;
				}
				tempList = tempList.Next;
				if (tempList.isEmpty()) {
					break;
				}
			}
			return counter;
		}
		
		
		@Override
		public String toString() {
			return linkedList.toString();
		}
	}
}
