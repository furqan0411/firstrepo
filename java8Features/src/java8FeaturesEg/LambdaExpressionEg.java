package java8FeaturesEg;

import java.util.ArrayList;

public class LambdaExpressionEg {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("fazila");
		arrayList.add("afifa");
		arrayList.add("kasshu");

		LambdaExpressionEg lambdaExpressionEg = new LambdaExpressionEg();

		lambdaExpressionEg.displayDetails(arrayList);
	}

	public void displayDetails(ArrayList<String> arrayList) {

		for (String name : arrayList) {

			System.out.println(name);
		}

		arrayList.forEach((String name) -> {
			System.out.println("lamda name : " + name);
		});

		arrayList.forEach(name -> System.out.println("lamda single line name : " + name));

	}

}
