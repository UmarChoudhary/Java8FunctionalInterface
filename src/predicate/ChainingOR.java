package predicate;

import java.util.function.Predicate;

public class ChainingOR {
	public static void main(String[] args) {
		
		//OR: Checks if at least one condition is true:
		
		
		Predicate<Integer> isNegative = n -> n < 0;
		Predicate<Integer> isZero = n -> n == 0;
		Predicate<Integer> isNegativeOrZero = isNegative.or(isZero);

		System.out.println(isNegativeOrZero.test(-3));
		System.out.println(isNegativeOrZero.test(3));

	}

}
