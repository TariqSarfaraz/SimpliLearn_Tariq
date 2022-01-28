package lesson1;

import accessmodifiers.*;

public class AccessModifiers extends ProtectedAccessModifier {

	public static void main(String[] args) {

		PrivateAccessMofidier priAccessModifier = new PrivateAccessMofidier();

		// Cannot access private data members from another class
		// priAccessModifier.privateMethod();

		DefaultAccessModifier defAccessModifier = new DefaultAccessModifier();

		// Displaying Default data members from another class within the same package
		defAccessModifier.defaultMethod();

		AccessModifiers proAccessModifier = new AccessModifiers();

		// Displaying Protected data members from another class within different package
		proAccessModifier.protectedMethod();

		PublicAccessModifier pubAccessModifier = new PublicAccessModifier();

		// Displaying Public data members from another class within different package
		pubAccessModifier.publicMethod();

	}
}

// Using private access modifiers

class PrivateAccessMofidier {

	private void privateMethod() {
		System.out.println("Displaying Private Method");
	}
}

// Using Default access modifiers

class DefaultAccessModifier {

	void defaultMethod() {
		System.out.println("Displaying Default Method");
	}
}
