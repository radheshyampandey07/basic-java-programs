package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResources {

	public static void main(String[] args) {

		// In a try-with-resources statement, catch or finally block executes after
		// closing of the  declared resources.
		try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
			System.out.println("creating file.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("inside finally block...");
		}
	}

}
