package com.taro.linkedlist;

import junit.framework.Assert;

import org.junit.Test;

public class LinkedListTest {

	/**
	 * Test basic CRUD operations: add, remove, get
	 */
	@Test
	public void testBasicOperations() {
		LinkedList list = new LinkedList();

		Assert.assertEquals(0, list.size());

		Node n = new Node();
		n.setValue("a");
		list.add(n);
		Assert.assertEquals(1, list.size());
		Node last = list.getLast();
		Object v1 = n.getValue();
		Object v2 = last.getValue();
		Assert.assertEquals(v1, v2);

		Node n2 = new Node();
		n2.setValue("b");
		list.add(n2);
		Assert.assertEquals(2, list.size());
		last = list.getLast();
		Object v3 = n2.getValue();
		Assert.assertEquals(v3, n2.getValue());

		Node removedNode = list.remove();
		Assert.assertTrue(removedNode.getValue().equals(n.getValue()));
		Assert.assertEquals(1, list.size());

		Node n3 = list.get(1);

		Assert.assertEquals(n2.getValue(), n3.getValue());

		Node n4 = list.get(7);
		Assert.assertNull(n4);

		Node n5 = list.get(-1);
		Assert.assertNull(n5);

		Node removedNode2 = list.remove();
		Assert.assertTrue(removedNode2.getValue().equals(n2.getValue()));
		Assert.assertEquals(0, list.size());
	}

	/**
	 * See what happens when we call remove() many times but no nodes are in the
	 * LinkedList
	 */
	@Test
	public void testRemoveManyTimes() {
		LinkedList list = new LinkedList();
		list.remove();
		list.remove();
		list.remove();
		Assert.assertEquals(0, list.size());
	}

	/**
	 * Remove all nodes and make sure everything has been removed
	 */
	@Test
	public void testRemoveAll() {
		LinkedList list = new LinkedList();

		list.add(new Node("a1"));
		list.add(new Node("a2"));
		list.add(new Node("a3"));
		Assert.assertEquals(3, list.size());
		list.removeAll();
		Assert.assertEquals(0, list.size());
		Assert.assertNull(list.get(0));
		Assert.assertNull(list.getFirst());
		Assert.assertNull(list.getLast());
		Assert.assertNull(list.get(1));

	}

	@Test
	public void testFind() {

		LinkedList list = new LinkedList();

		list.add(new Node("a1"));
		list.add(new Node("a2"));
		list.add(new Node("a3"));

		Node found = list.find("a1");

		Assert.assertTrue(found.getValue().equals("a1"));

		found = list.find("a3");
		Assert.assertTrue(found.getValue().equals("a3"));

		found = list.find("xyz");
		Assert.assertNull(found);
	}
}
