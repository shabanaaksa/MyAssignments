package week3.day2.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] codd =test.toCharArray();
		for (int i = 0; i < codd.length; i++) {
			if (i%2!=0) {
				
				codd[i]= Character.toUpperCase(codd[i]);
				
				System.out.println(codd[i]);
			} else {
				System.out.println(codd[i]);
			}
		}
	}

}
