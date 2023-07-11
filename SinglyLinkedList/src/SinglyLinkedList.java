/**
 * Description: Define a class that represents a list of integers
 *
* Programmer: Ali Almadhagi
* Course:     COSC 211, W '23
* Project:    9
* Date:       4-6-23
*/



public class SinglyLinkedList {
	// data members
	private Node head;
	
	// constructor
	public SinglyLinkedList() {
		head = null;
	}
	
	// add a node at the beginning of the list
	public void addFirst (int value) {
		head = new Node (value,head);
	}
	

	// remove the first node from the list 
	// this method assumes the node class is not an inner class
	public boolean removeFirst () {
		// is list empty?
		if (head == null)
			return false;
		head = head.getNext();
		return true;
		
	}		
		
	// add to the end of list
	public void addLast (int value) {
		
		// is list empty
		if (head == null)
			addFirst(value);
		else {
			Node current = head;
			while (current.getNext() != null) 
				current = current.getNext();
			current.setNext( new Node(value));
		}
		
	}	
	
	// output the list
	public void print () {
		Node current = head;
		while (current != null) {
			// grab the value and print it
			System.out.print(current.getData() + "  ");
			
			// advance to the next node
			current = current.getNext();
		}
		System.out.println();
	}
		

	// search the list for a target value. Return true
	// if target is in the list, and false otherwise
	public boolean find (int target) {
		Node current = head;
		while (current != null) {
			if (current.getData() == target)
				return true;
			current = current.getNext();
		}
		return false;
	}
	
	// a method that returns the number of elements in the list
	public int size() {
		Node current = head;
		int size = 0;
	    if (current != null) {
	    	size = 1;
	    	while (current.getNext() != null) {
				size++;
				current = current.getNext();
			}
	    }
		return size ;
	}
	
	// returns a String containing the elements of the list within a pair
	// of square brackets and separated with a comma from each other.
	public String toString() {
		Node current = head;
		String string = "[";
		if (current != null) {
			string = string + head.toString();
	    	while (current.getNext() != null) {
				string = string + ", " + current.getNext().toString();
	    		current = current .getNext();
			}
	    }
		string = string + "]\n";
		
		return string;
	}
	
	// removes the last element from the list and returns true. If
	// the list is empty, it returns false.
	public boolean removeLast() {
		if(head == null)
			return false;
		else if(head.getNext() == null) {
			head = null;
			return true;
		}
		else {
			Node current = head;
			while((current.getNext()).getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(null);
			return true;
		}
		
	}
	
	// increments each element of the list by the value of n,
	// where the value of n is read from the keyboard before the method is invoked.
	public void increment(int n) {
		Node current = head;
		int num;
			
    	while (current != null) {
			num = current.getData() + n;
    		current.setData(num);
    		current = current.getNext();
		}
	    	
	    
	}
	
	
	// prints the list elements starting from the last element
	// down to the first element.
	public void printBackward() {
	    if (head == null) {
	        return;
	    }
	    printBackward(head);
	}

	private void printBackward(Node start) {
	    if (start == null) {
	        return;
	    }
	    printBackward(start.getNext());
	    System.out.print(start.getData() + " ");
	}
	
		
}
