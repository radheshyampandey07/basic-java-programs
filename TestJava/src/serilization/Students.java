package serilization;

import java.io.Serializable;

class Students implements Serializable {
	/**
	 * serial version UID is used at the time of deserialization.  If the serial
	 * version that were present at the time of serialization then it should be also
	 * present at deserialization
	 */
	private static final long serialVersionUID = -5923442240027681361L;

	int id;
	String name;
	transient int age;

	public Students(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
