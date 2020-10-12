package com.rohan.datastructuresgenerics;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * UC 2 adding node at front
	 * 
	 * @param newNode
	 */
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

	/**
	 * UC 3 adding node at back
	 * 
	 * @param newNode
	 */
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

	/**
	 * UC 4 inserting in between
	 * 
	 * @param myNode
	 * @param newNode
	 */
	public void insert(INode myNode, INode newNode) {
		newNode.setNext(myNode.getNext());
		myNode.setNext(newNode);
	}

	/**
	 * UC 5 deleting first node
	 * 
	 * @return
	 */
	public INode pop() {
		INode poppedNode = head;
		head = head.getNext();
		return poppedNode;
	}

	/**
	 * UC 6 deleting last node
	 * 
	 * @return
	 */
	public INode popLast() {
		INode traverseNode = head;
		while (!traverseNode.getNext().equals(tail)) {
			traverseNode = traverseNode.getNext();
		}

		tail = traverseNode;
		traverseNode = traverseNode.getNext();
		return traverseNode;
	}

	/**
	 * UC 7 searching for element, returns node if present
	 * 
	 * @param integer
	 * @return
	 */
	public INode search(Integer integer) {
		INode temp = head;
		while (!temp.getNext().equals(null)) {
			if (temp.getKey().equals(integer))
				break;
			temp = temp.getNext();
		}
		return temp;
	}

	/**
	 * UC 8 inserting after element
	 * 
	 * @param integer
	 * @param newNode
	 */
	public void addAfterElement(Integer integer, INode newNode) {
		INode tempNode = search(integer);
		newNode.setNext(tempNode.getNext());
		tempNode.setNext(newNode);
	}
}
