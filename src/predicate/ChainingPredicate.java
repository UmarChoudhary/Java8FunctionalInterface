package predicate;

import java.util.function.Predicate;

public class ChainingPredicate {
	public static void main(String[] args) {
		
		//and Method for Checks if both conditions are true:
		
		Predicate<Integer> isPositive = n -> n > 0;
		
		Predicate<Integer> isLessThanTen = n -> n < 10;
		
		Predicate<Integer> isPositiveAndLessThanTen = isPositive.and(isLessThanTen);

		System.out.println(isPositiveAndLessThanTen.test(5));
		System.out.println(isPositiveAndLessThanTen.test(15));

	}
}
