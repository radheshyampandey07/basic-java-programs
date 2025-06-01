package java8;

import java.util.Objects;

class Laptop {
	String model;
	int price;

	public Laptop(String x, int y) {
		model = x;
		price = y;
	}

//	public String toString() {
//		return "Model: " + model + " & Price: " + price;
//	}
	
	
	
	

//	public boolean equals(Laptop that) {
//		if (this.model.equals(that.model) && this.price == that.price)
//			return true;
//		else
//			return false;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
}

public class EqualsToStringHashcode {

	public static void main(String[] args) {

		Laptop laptop = new Laptop("Dell", 21000);
		Laptop laptop2 = new Laptop("Dell", 21000);
		Laptop laptop1 = new Laptop("HP", 31000);
		System.out.println(laptop.toString());
		System.out.println(laptop1.toString());

		System.out.println(laptop2.equals(laptop));

	}

}
