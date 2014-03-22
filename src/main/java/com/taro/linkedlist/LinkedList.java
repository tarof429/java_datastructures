package com.taro.linkedlist;

/**
 * A basic linked list which supports the following operations:
 * 
 * - add - size - remove - removeAll - getFirst - getLast - get
 * 
 */
public class LinkedList {

	private int size;

	private Node first;

	/**
	 * Add a node. Nodes are added to the bottom of the linked list.
	 * 
	 * @param node
	 *            The node to add.
	 */
	public void add(Node node) {
		if (first == null) {
			first = node;
		} else {
			Node last = getLast();
			last.setNext(node);
		}

		// Whenever a node is added, we must remember to increase the size
		size++;
	}

	/**
	 * Size of the linked list.
	 * 
	 * @return
	 */
	public int size() {

		return size;
	}

	/**
	 * Remove a node
	 * 
	 * @return
	 */
	public Node remove() {

		if (first == null) {
			return first;
		}

		Node removedNode = first;

		first = first.getNext() != null ? first.getNext() : null;

		// Whenever a node is removed, we must remember to decrement the size
		size--;

		return removedNode;
	}

	/**
	 * Remove all nodes
	 */
	public void removeAll() {
		while (size > 0) {
			remove();
		}
	}

	/**
	 * Return the first node
	 * 
	 * @return
	 */
	public Node getFirst() {
		return first;
	}

	/**
	 * Return the last node
	 * 
	 * @return
	 */
	public Node getLast() {

		Node curr = first;

		while (curr != null && curr.getNext() != null) {
			curr = curr.getNext();
		}

		return curr;

	}

	/**
	 * Return a node indicated by the index.
	 * 
	 * @param index
	 * @return The node indicated by the index, or null if the index is invalid
	 */
	public Node get(int index) {

		int i = 0;

		if (index < 0 || index > size) {
			return null;
		}

		Node curr = first;

		while (curr != null && curr.getNext() != null) {
			curr = curr.getNext();
			i++;

			if (i == index) {
				break;
			}
		}

		return curr;
	}

	public Node find(Object o) {

		Node curr = first;

		if (curr.getValue().equals(o)) {
			return curr;
		}

		while (curr != null && curr.getNext() != null) {
			curr = curr.getNext();

			if (curr.getValue().equals(o)) {
				return curr;
			}
		}
		return null;
	}
}
