package com.acadgild;

/**
 * 
 * DynamicStack.java This class will add items into stack, but without any
 * limit. If more items are added than the limit then stack will automatically
 * increase its size and will add the elements.
 *
 */
public class DynamicStack implements Stack {
	int start, stacksize;
	private int stack[];
	int start1;

	// Default Constructor
	DynamicStack() {

	};

	// Set the size of the stack.
	DynamicStack(int maxstacksize) {
		// this.maxstacksize = maxstacksize;
		this.stacksize = maxstacksize;
		this.stack = new int[this.stacksize];
		this.start = -1;
	}

	// Push method to add elements to the stack.
	public void push(int l) {

		// If stack has reached its max size then display Stack Overflow message
		// and copy the contents of existing stack into another stack.

		if (this.start == this.stacksize - 1) {
			System.out.println("Stack Overflow - Increasing Stack Length");
			int[] newStack = new int[this.stacksize * 2];
			for (int i = 0; i < this.stacksize; i++) {
				newStack[i] = this.stack[i];
			}
			this.stack = newStack;
			// Set the stacksize to hold another set of elements.
			this.stacksize = this.stacksize * 2;
		}
		System.out.println("Adding " + l);
		stack[++this.start] = l;
	}

	// Pop method to return the elements of stack.
	public int pop() {
		this.start1 = this.start;
		// System.out.println("start1 = " + start1);
		return this.stack[this.start--];

	}

}
