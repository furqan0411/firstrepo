/**
 * 
 */
package straming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dell
 *
 */
public class JoiningNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> nlist = new ArrayList<>();

		nlist.add("furqan");
		nlist.add("fazu");
		nlist.add("affu");
		nlist.add("zakriya");
		nlist.add("amina");
		
		
		String joined= nlist.stream().map(name->name.toUpperCase()).collect(Collectors.joining("--"));
	System.out.println(joined);
	}

}
