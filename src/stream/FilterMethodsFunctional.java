package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class FilterMethodsFunctional {
	public static void main(String[] args) {
		String[] animals = { "cats", "dogs", "ox", "bats", "horses", "mule" };
		Arrays.stream(animals)
			.filter(x -> !x.matches(".*s$"))
			.sorted()
			.forEach(System.out::println);
		
		int[] numbers = { 3, 6, 8, 8, 4, 6, 3, 3, 5, 6, 9, 4, 3, 6 };
		IntStream stream = Arrays.stream(numbers);
		IntSummaryStatistics stats = stream.skip(5).summaryStatistics();
		System.out.println(stats.toString());
		
		Arrays.stream(numbers).distinct().sorted().forEach(n -> System.out.print(n + " "));
	}
}
