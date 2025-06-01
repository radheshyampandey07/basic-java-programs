package basicJava;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Person) {
			Person person = (Person) obj;
			return this.name.equals(person.name);
		}
		return false;
	}
}

public class EqualsmethodAndOperator {

	public static void main(String[] args) {

		String str = new String("Hello");
		String str2 = new String(str);
		;
		System.out.println("str == str2 :  " + str == str2);
		System.out.println("str.equals(str2) : " + str.equals(str2));

		Person person = new Person("John"); // for any reference variable there will be 8 bytes of memory will be
											// allocated
		// default value of any reference variable is null;
		int x = 9;
		System.out.println(++x);
		System.out.println(x++);

		Person p2 = person;

		p2.name = "DOE";

		System.out.println(person == p2);

		System.out.println(person.equals(p2));

	}

}
