package java8FeaturesEg;

import java.util.function.Predicate;

public class EvenNo {

	public static void main(String[] args) {
		System.out.println("Even number test");
Predicate<Integer> p=i->i%2==0;
	System.out.println("7 is "+p.test(7));
	System.out.println("8 is a "+p.test(8));
	
	}

}
  