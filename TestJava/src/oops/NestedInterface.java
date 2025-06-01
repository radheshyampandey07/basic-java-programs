package oops;

interface Showable {
	interface Message {
		void printMessage();
	}
}

class MessagePrinter implements  Showable.Message {
	public void printMessage() {
		System.out.println("deliver my message.");
	}
	
}

public class NestedInterface {

	public static void main(String[] args) {

		Showable.Message message = new MessagePrinter();
		message.printMessage();
	}

}
