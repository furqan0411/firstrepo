/**
 * 
 */
package straming;

import java.util.ArrayList;

/**
 * @author Dell
 *
 */
public class MatchingExample {

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
		
boolean record = list.stream().anyMatch(name -> name.equalsIgnoreCase("Kala"));
System.out.println("record is available : " + record);
System.out.println("record is available -contains : " +list.contains("kala"));



	}

}
