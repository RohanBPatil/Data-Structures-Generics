package com.rohan.datastructuresgenerics;

public class MyLinkedList<k extends Comparable<k>> {
	public INode<k> head;
	public INode<k> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * UC 2 adding node at front
	 * 
	 * @param newNode
	 */
	public void addAtHead(INode<k> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	/**
	 * UC 3 adding node at back
	 * 
	 * @param newNode
	 */
	public void addAtTail(INode<k> newNode) {
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
	public void insert(INode<k> myNode, INode<k> newNode) {
		newNode.setNext(myNode.getNext());
		myNode.setNext(newNode);
	}

	/**
	 * UC 5 deleting first node
	 * 
	 * @return
	 */
	public INode<k> pop() {
		INode<k> poppedNode = head;
		head = head.getNext();
		return poppedNode;
	}

	/**
	 * UC 6 deleting last node
	 * 
	 * @return
	 */
	public INode<k> popLast() {
		INode<k> tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}

		tail = tempNode;
		tempNode = tempNode.getNext();
		tail.setNext(null);
		return tempNode;
	}

	/**
	 * UC 7 searching for element, returns node if present
	 * 
	 * @param integer
	 * @return
	 */
	public boolean search(Integer integer) {
		INode<k> tempNode = head;
		while (!tempNode.getNext().equals(null)) {
			if (tempNode.getKey().equals(integer))
				return true;
			tempNode = tempNode.getNext();
		}
		return false;
	}

	/**
	 * UC 8 inserting after element
	 * 
	 * @param integer
	 * @param newNode
	 */
	public void addAfterElement(Integer integer, INode<k> newNode) {
		INode<k> tempNode = head;
		while (!tempNode.getNext().equals(null)) {
			if (tempNode.getKey().equals(integer))
				break;
			tempNode = tempNode.getNext();
		}
		newNode.setNext(tempNode.getNext());
		tempNode.setNext(newNode);

	}

	/**
	 * UC 9 deleting any element
	 * 
	 * @param integer
	 */
	public int delete(Integer integer) {
		INode<k> temp = head;
		INode<k> prev = head;
		if (head.getKey().equals(integer))
			head = head.getNext();
		else if (tail.getKey().equals(integer)) {
			popLast();
		} else {
			while (temp.getNext() != null) {
				if (temp.getKey().equals(integer))
					break;
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(temp.getNext());
		}
		return size();
	}

	/**
	 * UC 9 showing size of linked list
	 * 
	 * @return
	 */
	public int size() {
		INode<k> temp = head;
		int size = 0;
		while (temp.getNext() != null) {
			size++;
			temp = temp.getNext();
		}
		return size + 1;
	}

	public void print() {
		INode<k> temp = head;
		while (temp.getNext() != null) {
			System.out.print(temp.getKey() + "->");
			temp = temp.getNext();
		}
		System.out.print(temp.getKey());
		System.out.println();
	}

	/**
	 * UC 10 adding node in ascending order in linked list
	 * 
	 * @param newNode
	 * @return
	 */
	public boolean addInOrder(INode<k> newNode) {
		INode<k> temp = head;
		if (head == null) { // if linked list is empty then setting new node as head and tail
			head = newNode;
			tail = newNode;
		} else if (head.getKey().compareTo(newNode.getKey()) > 0) { // if new node is less than head then setting new
																	// node head
			newNode.setNext(temp);
			head = newNode;
		} else if (tail.getKey().compareTo(newNode.getKey()) < 0) { // if new node is more than tail then setting new
																	// node tail
			tail.setNext(newNode);
			tail = newNode;
		} else {
			INode<k> prev = head;
			while (temp.getNext() != null && temp.getKey().compareTo(newNode.getKey()) < 0) {
				prev = temp;
				temp = temp.getNext();
			}
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
		}
		return true;
	}
}
