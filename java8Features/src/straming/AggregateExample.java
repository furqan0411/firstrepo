/**
 * 
 */
package straming;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;

/**
 * @author Dell
 *
 */
public class AggregateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(48);
		numbers.add(7);
		numbers.add(23);
		numbers.add(18);
		numbers.add(65);
		numbers.add(78);
		numbers.add(80);
		numbers.add(23);

		IntSummaryStatistics summaryStatistics = numbers.stream().mapToInt(number -> {
			return number;
		}).summaryStatistics();

		System.out.println("maximum number in the list  " + summaryStatistics.getMax());
		System.out.println("minimum number in the list  " + summaryStatistics.getMin());
		System.out.println("average ofthe list  " + summaryStatistics.getAverage());
		System.out.println("sum of the numbers in the list  " + summaryStatistics.getSum());
		System.out.println("count of the numbers in the list  " + summaryStatistics.getCount());

	}

}
