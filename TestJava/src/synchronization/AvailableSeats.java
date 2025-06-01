package synchronization;

public class AvailableSeats {

	int seats = 100;

	synchronized void bookSeats(int num) {
		if (num > seats) {
			System.out.println("Entered seats are greater than available seats");
			System.out.println(seats + " seats are left");
		} else {
			seats -= num;
			System.out.println(num + " seats booked.");
			System.out.println(seats + " seats are left.");
		}
	}

}
