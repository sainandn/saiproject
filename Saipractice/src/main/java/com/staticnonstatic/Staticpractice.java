package com.staticnonstatic;

public class Staticpractice {

	// Static method
	public static void staticMethod() {
		System.out.println("This is a static method.");
	}

	// Non-static method
	public void nonStaticMethod() {
		System.out.println("This is a non-static method.");
	}

	// Main method to test the methods
	public static void main(String[] args) {
		// Calling static method without creating an instance
		Staticpractice.staticMethod();

		// Creating an instance of MyClass
		Staticpractice myObject = new Staticpractice();

		// Calling non-static method using the instance
		myObject.nonStaticMethod();
	}

}
