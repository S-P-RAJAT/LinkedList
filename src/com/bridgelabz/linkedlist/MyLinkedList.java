package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {

	private INodeIF<K> head;
	private INodeIF<K> tail;
	
	public MyLinkedList() 
	
	{
		this.head=null;
		this.tail=null;
		
	}
	
	public void  addNode(INodeIF<K> newNode)
	{
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		if(this.head==null)
		{
			this.head=newNode;
		}
		else
		{
			INodeIF<K> tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
		
	}
	public void appendNode(INodeIF<K> newNode)
	{
		if(this.head==null)
		{
			this.head=newNode;
		}
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		else
		{
			
			
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
		
		
	}
	
	public void insertNode(INodeIF<K> myNode,INodeIF<K> newNode)
	{
		INodeIF<K> tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
		
	}
	
	public INodeIF<K> pop()
	{
		
		INodeIF<K> tempNode=head;
		this.head=head.getNext();
		
		return tempNode;
		
	}
	public void  printNodes()
	{
		
		StringBuffer myNodes = new StringBuffer("My nodes are: ");
		INodeIF<K> tempNode= head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append(" -> ");
			tempNode=tempNode.getNext();
			
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
}
	
