package functional;

import java.time.LocalDate;
import java.util.Random;

public class FluentInterfaces {
	public static void main(String[] args) {
		LocalDate futureDate = LocalDate.now()
							.plusYears(2)
							.minusMonths(1)
							.plusDays(3);
		System.out.println(futureDate);
		System.out.println(LocalDate.now());
		
		Random random = new Random();
		random.ints().limit(5).sorted().forEach(x -> System.out.println(x));
	}
}
