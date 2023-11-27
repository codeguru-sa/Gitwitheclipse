package Mode;

import java.util.List;
import java.util.function.Predicate;

public class FP01Structured {
	
	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(12,45,67,3,45,88,903,32));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		Predicate<? super Integer> predicateisEven = number -> number%2==0;
		
		Predicate<? super Integer> predicateisOdd = number -> number%2!=0;
		
		 numbers
		.stream()
		.filter(predicateisOdd)
		.forEach(System.out::println);
	}

}	
