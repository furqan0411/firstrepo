/**
 * 
 */
package straming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell
 *
 */
public class SortExample {

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
		list.add("kinnara");
		
list.stream().filter(name->name.startsWith("k")).map(name->name.toUpperCase()).sorted().forEach(System.out::println);
		

	}

}
