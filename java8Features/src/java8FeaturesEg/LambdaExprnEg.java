package java8FeaturesEg;

import java.util.function.Function;

public class LambdaExprnEg {

	public static void main(String[] args) {
		Function <Integer,Integer> f=i->i*i;
		System.out.println("square of 4---->"+f.apply(4));
System.out.println("square of 4---->"+f.apply(5));
	}

}
