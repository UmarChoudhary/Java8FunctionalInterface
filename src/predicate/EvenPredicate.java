package predicate;

import java.util.function.Predicate;

public class EvenPredicate {
	public static void main(String[] args) {
		
		int[] i = {2,4,5,7,9};
		
		Predicate<Integer> p1 = e -> e%2==0;
				
		System.out.println("All numbers: "+ i);
		for (int num : i) {
			System.out.println(num+"");
		}
		
		System.out.println("Even numbers only:");
		for (int num:i) {
			if(p1.test(num)) {
			System.out.println(num+"");
		}
	}
}
}
