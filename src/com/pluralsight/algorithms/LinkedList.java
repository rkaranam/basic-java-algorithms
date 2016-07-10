package com.pluralsight.algorithms;

public class LinkedList {

	public static void main(String[] args) {
		
		Node first = new Node(10);
		Node middle = new Node(20);
		Node last = new Node(30);
		
		first.setNext(middle);
		middle.setNext(last);
		
		System.out.println(first);
		System.out.println(middle);
		System.out.println(last);
	}

}
