package com.rohan.datastructuresgenerics;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if(tail == null)
			tail = newNode;
		if(head == null)
			head = newNode;
		else {
			newNode.setNext(this.head);
			head = newNode;
		}
	}
}
