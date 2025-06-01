package arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] num = { 1, 3, 7, 9, 10, 11, 14 };
		int missig = num[0];
		for (int i = 0; i < num[num.length];) {
			if (missig == num[i]) {
				missig++;
				i++;
			} else {
				System.out.println(missig);
				missig++;
			}
		}
	}
}
