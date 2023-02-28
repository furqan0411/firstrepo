/**
 * 
 */
package straming;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Dell
 *
 */
public class RemoveEmptyStringsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("");
		list1.add("furqan");
		list1.add("fazu");
		list1.add("affu");
		list1.add("zakriya");
		list1.add("amina");
		list1.add("");
		list1.add("kasshu");
		list1.add("");
		list1.add("");

		List<String> namelist;
		namelist = list1.stream().filter(name -> !name.isEmpty()).collect(Collectors.toList());
		System.out.println("name list--"+namelist);

		Set<String> nameset;
		nameset = list1.stream().filter(name -> !name.isEmpty()).collect(Collectors.toSet());
		System.out.println("name set--"+nameset);
		
		
	}

}
