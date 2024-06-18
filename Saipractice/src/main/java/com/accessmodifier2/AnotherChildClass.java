package com.accessmodifier2;

import com.accesmodifier.ParentClass;

public class AnotherChildClass extends ParentClass  {
	public void accessProtectedMembers() {
		// Accessing protected variable and method from parent class
		System.out.println("Protected Variable: " + protectedVar);
		protectedMethod();
	}

}
   