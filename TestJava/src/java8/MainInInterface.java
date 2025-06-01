package java8;

// we can write main method inside interface since java1.8
public interface MainInInterface {
	public static void main(String[] args) {
		System.out.println("main in interface");
		CT ct = new CT();
		ct.print();
		
	}
}

class CT implements MainInInterface {
	
	public void print() {
		System.out.println("hello there from class");
	}
	
}