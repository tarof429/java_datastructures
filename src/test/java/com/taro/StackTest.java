package com.taro;

import junit.framework.Assert;

import org.junit.Test;

import com.taro.stack.Stack;

public class StackTest {

	@Test
	public void testStack() {

		Stack stack = new Stack();

		Node n1 = new Node("a1");
		Node n2 = new Node("a2");
		Node n3 = new Node("a3");

		stack.push(n1);
		stack.push(n2);
		stack.push(n3);

		Node node = stack.pop();
		Assert.assertEquals("a3", node.getValue());

		node = stack.pop();
		Assert.assertEquals("a2", node.getValue());

		node = stack.pop();
		Assert.assertEquals("a1", node.getValue());

		node = stack.pop();
		Assert.assertNull(node);
	}
}
