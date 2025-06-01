package basicJava;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				continue;
			if (i == 8)
				break;
			System.out.println(n * i);
		}
	}
}
