package com.datastructures;

public class LinkedList {

	Node head;
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
		}
		
	}
	
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
		
	}
	public void insertAt(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index == 0)
		{
			node.next = head;
			head = node;
		}
		else
		{
			Node n = head;
			for(int i = 0; i < index -1; i++)
			{
				if(n !=  null)
				{
					n = n.next;
				}
				else
				{
					System.out.println("Index Out of Bound");
					return;
				}
				
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void removeAt(int index)
	{
		if(index == 0)
		{
			Node n = head;
			head = head.next;
			n = null;
		}
		else
		{
			Node temp = null;
			Node n = head;
			for(int i = 0; i < index -1; i++)
				if(n != null)
				{
					n = n.next;
				}
				else
				{
					System.out.println("Index Out of bound");
					return;
				}
			temp = n.next;
			n.next = temp.next;
			temp = null;
		}
		
	}
	public void middle()
	{
		int i = 0;
		Node n = head;
		while(n != null)
		{
			i++;
			n = n.next;
		}
		n = head;
		for(int j = 0; j< i/2; j++)
		{
			n = n.next;
		}
		System.out.println("middle element is: "+n.data);
	}
	
	public void reverse()
	{
		Node n = head;
		while(n.next != null)
		{
			n = n.next;
		}
		while(head != n)
		{
			Node temp;
			temp = head;
			head = head.next;
			temp.next = null;
			temp.next = n.next;
			n.next = temp;
		}
	}
	public void swap(int x, int y)
	{
		//if value is same then no need to swap
		if(x == y)
		{
			return;
		}
		Node current_x = head;
		Node prev_x = null;
		while(current_x != null && current_x.data != x)
		{
			prev_x = current_x;
			current_x = current_x.next;
		}
		Node current_y = head;
		Node prev_y = null;
		while(current_y != null && current_y.data != y)
		{
			prev_y = current_y;
			current_y = current_y.next;
		}
		if(current_x == null || current_y == null)
		{
			return;
		}
		if(prev_x !=null)
		{
			prev_x.next = current_y;
		}
		else
		{
			head = current_y;
		}
		if(prev_y != null)
		{
			prev_y.next = current_x;
		}
		else
		{
			head = current_x;
		}
		Node temp = current_x.next;
		current_x.next = current_y.next;
		current_y.next = temp;
	}
		
//		Node n = head;
//		for(int i = 0; i < index -1; i++)
//		{
//			n = n.next;
//		}
//		Node temp = n.next;
//		n.next = temp.next;
//		temp.next = null;
//		n =head;
//		for(int i = 0; i < index-2; i++)
//		{
//			n = n.next;
//		}
//		temp.next = n.next;
//		n.next = temp;

	
	public void show()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data+ " --> ");
			n = n.next;
		}
		System.out.println();
	}
	
	
}
