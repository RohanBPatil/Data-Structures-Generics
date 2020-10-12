package com.rohan.datastructuresgenerics;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		this.head = newNode;
		this.tail = newNode;
	}
}
