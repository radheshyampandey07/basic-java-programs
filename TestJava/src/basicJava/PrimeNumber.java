package basicJava;
public class PrimeNumber {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        System.out.println("First 100 prime numbers:");

        while (count < 100) {
            if (isPrime(number)) {
            	++count;
                System.out.println(number + " "+ count);
            }
            number++;
        }
    }
}
