package week4.day1.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name="shabana";
		char[] n=name.toCharArray();
		Set<Character> dn=new LinkedHashSet<>();
		for (Character character : n) {
			dn.add(character);
		}
		System.out.println(dn);
	}
	

}
  