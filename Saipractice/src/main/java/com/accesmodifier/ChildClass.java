package com.accesmodifier;

public class ChildClass extends ParentClass{
	public void accessProtectedMembers() {
		// Accessing protected variable and method from parent class
		System.out.println("Protected Variable: " + protectedVar);
		protectedMethod();
	}

}
