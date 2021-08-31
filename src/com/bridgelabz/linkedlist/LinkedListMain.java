package com.bridgelabz.linkedlist;

public class LinkedListMain<K> {
	public static INodeIF<Integer> head;
	public static INodeIF<Integer> tail;

	public LinkedListMain() {
		head = null;
		tail = null;
	}

	
	
public static void main(String[] args) {
	MyNodeImpl<Integer> myFirstNode = new MyNodeImpl<Integer>(70);
	MyNodeImpl<Integer> mySecondNode= new MyNodeImpl<Integer>(30);
	MyNodeImpl<Integer> myThirdNode = new MyNodeImpl<Integer>(56);
	
	MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
	myLinkedList.addNode(myFirstNode);
	myLinkedList.addNode(mySecondNode);
	myLinkedList.addNode(myThirdNode);
	myLinkedList.printNodes();
}
}
