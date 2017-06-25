package com.acadgild;

/**
 * 
 * FixedStack.java - This class will add items into stack but with a limit. If
 * more items are added than the limit then it will display "Stack Overflow"
 * message.
 *
 */
public class FixedStack implements Stack {
	int start = -1, stacksize;
	private int stack[];

	// Default Constructor
	FixedStack() {

	};

	// Constructor to set the size of the stack
	FixedStack(int maxstacksize) {
		this.stacksize = maxstacksize;
		this.stack = new int[this.stacksize];
	}

	// Push method to add items to the stack
	public void push(int l) {
		// Check if max size has reached
		if (this.start == this.stacksize - 1) {
			System.out.println("**** Stack Overflow (Fixed stack - size can't exceed 3)****");
			return;
		} else {
			// If max size not reached then add items to the stack.
			System.out.println("Adding " + l);
			stack[++this.start] = l;
		}

	}

	// Method to retrieve the elements from the stack.
	public int pop() {
		// TODO Auto-generated method stub
		return this.stack[this.start--];
	}

}
