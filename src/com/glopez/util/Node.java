package com.glopez.util;

/**
 * Class to define structure node
 * @author gustavo
 *
 */
public class Node {

	private int nodeValue;
	private Node follow;
	
	public Node() {
		this.nodeValue = 0;
		this.follow = null;
	}
	
	public void setValue(int value) {
		this.nodeValue = value;
	}
	
	public int  getValue() {
		return nodeValue;
	}
	
	public void setFollow(Node follow) {
		this.follow = follow;
	}
	
	public Node getFollow() {
		return follow;
	}	
	
}
