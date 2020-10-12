package com.rohan.datastructuresgenerics;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addAtHead(INode newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void addAtTail(INode newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void insert(INode myNode, INode newNode) {
		newNode.setNext(myNode.getNext());
		myNode.setNext(newNode);
	}
}
