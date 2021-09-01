package com.bridgelabz.linkedlist;

public class SortedLinkedList<K extends Comparable<K>> {
	private INodeIF<K> head;
	private INodeIF<K> tail;
	public SortedLinkedList() {

		this.head=null;
		this.tail=null;
	
	}
	
	public void add(INodeIF<K> newNode)
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
			INodeIF<K> tempNode=head;
			INodeIF<K> prevNode=head;

			while(tempNode.getKey().compareTo(newNode.getKey())<0 && tempNode.getNext()!=null)
			{
				prevNode=tempNode;
				tempNode=tempNode.getNext();
			}

			if(tempNode==this.tail && tempNode.getKey().compareTo(newNode.getKey())<0)
			{

					tempNode.setNext(newNode);
					this.tail=newNode;


			}
			else if(tempNode==this.head && tempNode.getKey().compareTo(newNode.getKey())>0)
			{
				newNode.setNext(head);
				this.head=newNode;

			}
			else
			{
				prevNode.setNext(newNode);
				newNode.setNext(tempNode);
			}


		}
		}
	public int size()
	{
		int listSize=0;
		INodeIF<K> tempNode=head;
		if(tempNode!=null)
		while(tempNode!=tail)
		{
			listSize++;
			tempNode=tempNode.getNext();
			
		}
		listSize++;
		
		return listSize;
	}
	public INodeIF<K> pop()
	{
		
		INodeIF<K> tempNode=head;
		this.head=head.getNext();
		
		return tempNode;
		
	}
	public INodeIF<K> popLast()
	{
		INodeIF<K> tempNode= head;
		while(tempNode.getNext()!=tail)
		{
			
			tempNode=tempNode.getNext();
			
		}
		this.tail=tempNode;
		this.tail.setNext(null);
		tempNode=tempNode.getNext();
		return tempNode;
		
	}
	
	public INodeIF<K> search(K key)
	{
		INodeIF<K> tempNode = head;
		INodeIF<K> requiredNode=null;
		while(tempNode.getNext()!=null && tempNode.getKey()!=key)
		{
			
			
			tempNode=tempNode.getNext();
		}
		if(tempNode.getKey()==key)
		{
			requiredNode=tempNode;
		}
		
		
		return requiredNode;
		
		
	}
	public INodeIF<K> deleteGivenKeyNode(K key)
	{
		INodeIF<K> tempNode=search(key);
		
		if(tempNode==head)
		{
			tempNode=pop();
		}
		else if(tempNode==tail)
		{
			tempNode=popLast();
		}
		else
		{
			INodeIF<K> previousNode=head;
			while(previousNode.getNext()!=tempNode)
			{
				tempNode=tempNode.getNext();
			}
			
			previousNode.setNext(tempNode.getNext());
			
		}
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
