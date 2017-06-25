package com.acadgild;

/**
 * Interface having two methods push & pop. This interface will be extended by
 * FixedStack.java and DynamicStack.java
 */
public interface Stack {
	void push(int l);

	int pop();
}
