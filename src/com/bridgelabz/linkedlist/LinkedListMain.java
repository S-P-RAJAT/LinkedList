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
	
	MyLinkedList<Integer> myLinkedListUsingAdd = new MyLinkedList<Integer>();
	myLinkedListUsingAdd.addNode(myFirstNode);
	myLinkedListUsingAdd.addNode(mySecondNode);
	myLinkedListUsingAdd.addNode(myThirdNode);
	myLinkedListUsingAdd.printNodes();
	
	MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
	MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
	MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
	
	System.out.println("Linked list created by appending");
	MyLinkedList<Integer> myLinkedListUsingAppend = new MyLinkedList<Integer>();
	myLinkedListUsingAppend.appendNode(firstNode);
	myLinkedListUsingAppend.appendNode(secondNode);
	myLinkedListUsingAppend.appendNode(thirdNode);
	myLinkedListUsingAppend.printNodes();
}
}
