/**
 * 
 */
package straming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Dell
 *
 */
public class Squaring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(6);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(1);
		numbers.add(7);
		numbers.add(4);
		
		System.out.println("input--"+numbers);
		List<Integer> squares=numbers.stream().map(num->num*num).collect(Collectors.toList());
	System.out.println("output--"+squares);
	
	}

}
