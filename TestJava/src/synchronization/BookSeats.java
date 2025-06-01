package synchronization;

public class BookSeats extends Thread {

	static AvailableSeats s;
	int bookSeats;

	public void run() {
		s.bookSeats(bookSeats);
	}

	public static void main(String[] args) {
		s = new AvailableSeats();
		BookSeats seats = new BookSeats();
		BookSeats seats1 = new BookSeats();
		seats.bookSeats = 70;
		seats1.bookSeats = 40;
		seats.start();
		seats1.start();
	}

}
