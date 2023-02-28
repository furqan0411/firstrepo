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
public class EmptyStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("");
		list.add("furqan");
		list.add("fazu");
		list.add("affu");
		list.add("zakriya");
		list.add("amina");
		list.add("");
		list.add("kasshu");
		list.add("");
		list.add("");
	 long emptynames=0;
	  long nonemptynames=0;
	  
	 emptynames=list.stream().filter(name->name.isEmpty()).count(); 
	 nonemptynames=list.stream().filter(name->!name.isEmpty()).count();
	 
		System.out.println("count of empty names  "+emptynames);
		System.out.println("count of empty names  "+nonemptynames);
	}

}
