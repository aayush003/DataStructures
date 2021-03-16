package com.datastructures;

public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.insert(2);
		list.insertAtStart(3);
		list.insertAtStart(5);
		list.insertAt(2, 7);
		list.insert(11);
		list.show();
		list.middle();
		list.swap(2,3);
		list.show();
		list.reverse();
		list.show();
		
		list.show();
		//System.out.println();
		//list.removeAt(9);
		//list.show();

	}

}
