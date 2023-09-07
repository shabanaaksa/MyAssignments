package week3.day2.assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("Second largest number is :"+data[data.length-2]);

	}

}
