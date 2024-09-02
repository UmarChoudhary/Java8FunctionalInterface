package predicate;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {

		String s1 = new String("UMAR");
		
// 		Create a Predicate to check if the string length is greater than 5
		Predicate<String> p1 = s -> s.length() > 5;

// 		Use the Predicate to test the string
		boolean check = p1.test(s1);

    	System.out.println("String: " + s1);
		System.out.println("Length greater than 5: " + check);
	}
}