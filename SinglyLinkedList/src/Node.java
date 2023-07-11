/**
 * Description: Defines a class that represents objects of type Node with
 *              two data members, data and next 
 *
 * Programmer: Ali Almadhagi
 * Course:     COSC 211, W '23
 * Project:    9
 * Date:       4-6-23
 */



public class Node {
	private int data;
	private Node next;
	
	// constructors
	public Node (int item) {
		this (item, null);
	}
	
	public Node (int item, Node link) {
		data = item;
		next = link;
	}
	
	// getters and setter
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setData(int item) {
		data = item;
	}
	
	public void setNext (Node link) {
		next = link;
	}
	
	// return a string representation of the node
	public String toString() {
		return "" + data;
	}
}

