package com.taro.queue;

import com.taro.Node;

public class Queue {

	private Node first;
	private Node last;

	public void enqueue(Node node) {
		if (first == null) {
			first = node;
			last = first;
		} else {
			last.setNext(node);
			last = node;
		}
	}

	public Node dequeue() {
		if (first == null) {
			return first;
		}

		Node previous = first;
		first = first.getNext();
		return previous;

	}

}