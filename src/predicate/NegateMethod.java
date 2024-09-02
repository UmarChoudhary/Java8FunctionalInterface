package predicate;

import java.util.function.Predicate;

public class NegateMethod {
	public static void main(String[] args) {
		//NOT: Negates check the opposite of the given condition
		
        Predicate<Integer> isPositive = n -> n > 0;
        
		Predicate<Integer> isNotPositive = isPositive.negate();

		System.out.println(isNotPositive.test(-5));
		System.out.println(isNotPositive.test(5));

	}

}
