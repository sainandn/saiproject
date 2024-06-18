package com.accesmodifier;

import com.accessmodifier2.AnotherChildClass;

public class mainclass {
	public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.accessProtectedMembers();  // Access within the same package

        AnotherChildClass anotherChild = new AnotherChildClass();
        anotherChild.accessProtectedMembers();  // Access from a subclass in a different package
    }

}
  // Hello File as we change