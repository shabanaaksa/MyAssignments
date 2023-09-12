package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7,8};
		Set<Integer> large=new TreeSet<>();
		for (int i = 0; i < data.length; i++) {
			large.add(data[i]);
		}
		System.out.println(large);
		List<Integer> lNumber=new ArrayList<>(large);
		int size = lNumber.get(lNumber.size()-2);
		System.out.println(size);
	}

}
