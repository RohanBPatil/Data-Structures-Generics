package com.rohan.datastructuresgenerics;

public interface INode<k extends Comparable<k>> {
	public k getKey();

	public void setKey(k key);

	public INode<k> getNext();

	public void setNext(INode<k> next);
}
