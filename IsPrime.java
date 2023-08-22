package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int count = 0;
		int n = 3;
		if (n == 0 || n == 1) {
			System.out.println(n + " - The number is neither prime nor composite");
		} else {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;

				}
			}
			if (count == 2)
				System.out.println("prime number ");
			else
				System.out.println("Not a prime number ");
		}

	}

}