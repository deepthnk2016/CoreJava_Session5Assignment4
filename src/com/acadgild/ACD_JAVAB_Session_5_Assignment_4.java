package com.acadgild;

/**
 * 
 * Main class to call FixedStack and DynamicStack classes
 *
 */
public class ACD_JAVAB_Session_5_Assignment_4 extends FixedStack {

	public static void main(String args[]) {
		System.out.println("===========Fixed Stack============");
		// Setting the size of fixed stack to 3
		FixedStack fs1 = new FixedStack(3);

		// Adding 3 elements to Fixed Stack
		// No Stack Overflow in this case
		for (int i = 0; i < 3; i++) {
			fs1.push(i);
		}
		// Display the contents of Fixed Stack
		System.out.println("Displaying Contents of Fixed Stack - ");
		for (int i = 0; i < 3; i++) {
			System.out.println(fs1.pop());
		}

		// Add more than 3 elements to Fixed Stack
		// Should throw Stack Overflow error message
		for (int i = 0; i < 4; i++) {
			fs1.push(i);
		}
		System.out.println("");
		System.out.println("===========Dynamic Stack============");
		// Set the size of dynamic stack to 3
		DynamicStack ds = new DynamicStack(3);

		// Adding 6 elements to the dynamic stack, so after adding 3 elements
		// it should display stack overflow message, but again it should add
		// next three elements.
		for (int i = 1; i < 6; i++) {
			// System.out.println(i + " sent to add");
			ds.push(i);
		}
		System.out.println("Displaying Contents of Dynamic stack");
		for (int i = 1; i < 4; i++) {
			System.out.println(ds.pop());
		}
	}

}
