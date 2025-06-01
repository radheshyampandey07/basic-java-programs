package oops;

class Data {
	private int age;
	private String name;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		Data d = new Data();
		d.setAge(20);
		d.setName("Rdx");
		System.out.println(d.getAge());
		System.out.println(d.getName());
	}

}
