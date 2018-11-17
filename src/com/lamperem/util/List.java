package com.lamperem.util;

/**
 * Class to define the operation that a list would to be have
 * @author gustavo
 *
 */
public class List {
	
	private Node baseNode;
	private int sizeList;
	
	// constructor
	public List() {
		this.baseNode = null;
		this.sizeList = 0;
	}
	// Verify is the list is empty
	public boolean isEmpty() {
		return baseNode == null;
	}
	
	// return the list (number of element) in list
	public int getSize() {
		return sizeList;
	}
	
	// add new node to list
	public void addToEnd(int value) {
		
		// create a new node
		Node newNode = new Node();
		newNode.setValue(value);
		
		// Verify is the list is empty
		if (isEmpty()) {
			// add first element
			baseNode = newNode;			
		}else { // add the new value to end of list
			
			// copy list
			Node aux = baseNode;
			
			while(aux.getFollow() != null) {
				aux = aux.getFollow();
			}
			
			// add new value to end list
			aux.setFollow(newNode);
			
			baseNode = aux;
		}
		
		sizeList++;
	}
}
