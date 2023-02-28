/**
 * 
 */
package straming;

import java.util.ArrayList;

/**
 * @author Dell
 *
 */
public class FindExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("kiran");
		list.add("reddy");
		list.add("nagrjuna");
		list.add("kinnara");
		list.add("kala");
		list.add("naveen");
		list.add("naresh");
		list.add("kala");

		String name = list.stream().filter(nam -> nam.startsWith("kala")).findFirst().get();

		System.out.println(name);
	}

}
