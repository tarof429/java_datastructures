package com.taro;

import junit.framework.Assert;

import org.junit.Test;

import com.taro.queue.Queue;

public class QueueTest {

	@Test
	public void testQueue() {
		Queue queue = new Queue();

		Node node1 = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");

		queue.enqueue(node1);
		queue.enqueue(node2);
		queue.enqueue(node3);

		Node node = queue.dequeue();
		Assert.assertEquals(node.getValue(), ("a"));

		node = queue.dequeue();
		Assert.assertEquals(node.getValue(), ("b"));

		node = queue.dequeue();
		Assert.assertEquals(node.getValue(), ("c"));

		node = queue.dequeue();
		Assert.assertTrue(node == null);
	}
}
