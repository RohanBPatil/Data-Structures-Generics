package com.rohan.datastructuresgenerics;

public class MyNode<k extends Comparable<k>> implements INode<k> {
	private k key;
	private INode<k> next;

	public MyNode(k key) {
		this.key = key;
		next = null;
	}

	@Override
	public k getKey() {
		return key;
	}

	@Override
	public void setKey(k key) {
		this.key = key;
	}

	@Override
	public INode<k> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<k> next) {
		this.next = next;
	}

}
