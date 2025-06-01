package multithreading;

class Start extends Thread {
	int x;

	public Start(int x) {
		this.x = x;
	}

	public void run() {
		for (int j = 0; j <= 59; j++) {
			for (int i = 0; i < x; i++) {
				try {
					System.out.println("0" + j + ":0" + i);
					
					
					
//					if (i <= 59) {
//						if (i <= 9) {
//							System.out.println("00:0" + i);
//						} else
//							System.out.println("00:" + i);
//					} else {
//						if (i <= 9) {
//						} else
//							System.out.println("0:" + j + ":" + i);
//					}
					Thread.sleep(1000);
				} catch (Exception e) {
					e.getCause();
				}
			}
		}
	}
}

public class Timer {

	public static void main(String[] args) {
		Start s = new Start(60);
		s.start();
	}

}
