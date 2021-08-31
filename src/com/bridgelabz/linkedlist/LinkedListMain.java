package com.bridgelabz.linkedlist;

public class LinkedListMain<K> {
	public static INodeIF<Integer> head;
	public static INodeIF<Integer> tail;

	public LinkedListMain() {
		head = null;
		tail = null;
	}

	public static void addElements() {
		System.out.println("\nLinked list created by adding elements:");
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(70);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(56);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addNode(firstNode);
		myLinkedList.addNode(secondNode);
		myLinkedList.addNode(thirdNode);
		myLinkedList.printNodes();
	}
	public static void appendElements() {
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		
		System.out.println("\nLinked list created by appending elements:");
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.appendNode(firstNode);
		myLinkedList.appendNode(secondNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.printNodes();
	}
	public static void insertElement() {
		System.out.println("\nLinked list created by inserting an element:");
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertNode(firstNode, secondNode);
		myLinkedList.printNodes();
	}
	public static void deleteFront() {
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertNode(firstNode, secondNode);
		System.out.print("\nCreated Linked List: ");

		myLinkedList.printNodes();
		myLinkedList.pop();
		System.out.print("Popped first element: ");

		myLinkedList.printNodes();
	}
	public static void deleteRear() {
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertNode(firstNode, secondNode);
		System.out.print("\nCreated Linked List: ");
		myLinkedList.printNodes();
		myLinkedList.popLast();
		System.out.print("Popped last element: ");
		myLinkedList.printNodes();
	}
	public static void searchKey() {
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertNode(firstNode, secondNode);
		
		Integer key=30;
		System.out.println("\nSearching node with given key value: "+key);
		if(myLinkedList.search(key)!=null)
		System.out.println("Element found: "+myLinkedList.search(key).getKey());
		else
			System.out.println("Key not found in linked list");
	}
	
	public static void searchAndInsert() {
		MyNodeImpl<Integer> firstNode = new MyNodeImpl<Integer>(56);
		MyNodeImpl<Integer> secondNode= new MyNodeImpl<Integer>(30);
		MyNodeImpl<Integer> thirdNode = new MyNodeImpl<Integer>(70);
		
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		myLinkedList.addNode(firstNode);
		myLinkedList.appendNode(thirdNode);
		myLinkedList.insertNode(firstNode, secondNode);
		System.out.print("\nBefore inserting: ");
		myLinkedList.printNodes();
		Integer key=30;

		System.out.println("Searching for key in linked list: key = "+key);
		MyNodeImpl<Integer> newNode = new MyNodeImpl<Integer>(40);
		if(myLinkedList.insertGivenKey(key,newNode)) {
		System.out.print("After inserting: ");

		myLinkedList.printNodes();
		}
		else
			System.out.println("Key not found in linked list");
		
		
		
	}
	
public static void main(String[] args) {
	
	addElements();
	appendElements();
	insertElement();
	deleteFront();
	deleteRear();
	searchKey();
	searchAndInsert();
}
}
