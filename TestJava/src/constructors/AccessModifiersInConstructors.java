package constructors;

class XYZ {
	int x;

	public XYZ() {
		System.out.println("parent class public constructor");
	}

	// A protected constructor is accessible within the same package and by
	// subclasses in any package.
	protected XYZ(int x) {
		System.out.println("parent class protected constructor");
	}

	XYZ(String s) {
		System.out.println("parent class default constructor");
	}

	private XYZ(int x, int y) {
		System.out.println("private constructors are used to create only single object of a class.");
	}
}

class ABC extends XYZ {

	public ABC() {
		super();
	}

	protected ABC(int c) {
		super(c);
	}

}

public class AccessModifiersInConstructors {

	public static void main(String[] args) {

		XYZ xyz = new XYZ();
		XYZ xyz1 = new XYZ(10);
		XYZ xyz2 = new XYZ("xyz");

	}

}
