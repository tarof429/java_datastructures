package com.taro.stack;

import com.taro.Node;

public class Stack {

	private Node first;

	/**
	 * Create a new node and point it's next to the old first;
	 * 
	 * @param node
	 */
	public void push(Node node) {

		Node oldFirst = first;
		first = new Node();
		first.setValue(node.getValue());
		first.setNext(oldFirst);
	}

	/**
	 * Create a copy of the first node. Set the first to the next. Return the
	 * copy.
	 * 
	 * @return
	 */
	public Node pop() {

		if (first == null) {
			return first;
		}
		Node node = new Node();
		node.setValue(first.getValue());
		first = first.getNext();
		return node;
	}
}
