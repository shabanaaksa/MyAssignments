package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {4, 2, 1, 6, 3, 5, 10, 8, 9 };
		Set<Integer> mn=new TreeSet<>();
		for (Integer integer : arr) {
			mn.add(integer);
		}
		System.out.println(mn);
		List<Integer> missN=new ArrayList<>(mn);
		for (int i = 0; i < missN.size(); i++) {
			if (missN.get(i)!=++i) {
				System.out.println("Missin Number is : "+i);
				break;
			}
		}
	}

}
