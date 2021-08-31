package com.bridgelabz.linkedlist;

public class LinkedListMain<K> {
	public static INodeIF<Integer> head;
	public static INodeIF<Integer> tail;

	public LinkedListMain() {
		head = null;
		tail = null;
	}

	
	
public static void main(String[] args) {
	INodeIF<Integer> myFirstNode = new MyNodeImpl<Integer>(56);
	INodeIF<Integer> mySecondNode = new MyNodeImpl<Integer>(30);
	INodeIF<Integer> myThirdNode = new MyNodeImpl<Integer>(70);
	myFirstNode.setNext(mySecondNode);
	mySecondNode.setNext(myThirdNode);
	boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
	System.out.println(result);
}
}
