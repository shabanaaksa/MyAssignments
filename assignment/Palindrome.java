package week3.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {

		String str="madam";
		String rev="";
		
		char[] chararray=str.toCharArray();
		for (int i =chararray.length-1; i>=0; i--) {
			rev=rev+chararray[i];
		}
			if (str.equalsIgnoreCase(rev)) {
				
				System.out.println("Given string is a Palindrome");
			} else {

				System.out.println("Given string is not a Palindrome");
			}
		
	}

}
