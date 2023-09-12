package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] companies= {"Google","Microsoft","TestLeaf","Maverick","Wipro","HCL","CTS","Aspire Systems"};
		int size = companies.length;
		System.out.println("Length of the array is :" +size);
		List<String> clength=new ArrayList<>();
		for (int i = 0; i < companies.length; i++) {
			clength.add(companies[i]);
		}
		Collections.sort(clength);
		System.out.println(clength);
		Collections.reverse(clength);
		System.out.println("Reverse sort of given Company names: " +clength);
	}

}
