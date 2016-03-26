package functional.higher.order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionsAsMethodParameters {
	public static void main(String[] args) {
		List<String> stringNumbers = Arrays.asList(new String[] {"34", "67", "96", "37"});
		List<Integer> intNumbers = new ArrayList<Integer>();
		List<Integer> doubleOfNumbers = new ArrayList<Integer>();
		
		Function<List<String>,List<Integer>> convertToInteger =
			s -> {
				s.stream().forEach(t -> intNumbers.add(Integer.parseInt(t)));
				return intNumbers;
			};
			
		Function<List<String>, List<Integer>> doubleTheInteger = 
			s -> {
				s.stream().forEach(t -> doubleOfNumbers.add(Integer.parseInt(t)*2));
				return doubleOfNumbers;
			};
			
		System.out.println(convertToInteger.apply(stringNumbers));
		System.out.println(doubleTheInteger.apply(stringNumbers));
	}
}
