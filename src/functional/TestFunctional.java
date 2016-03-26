package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunctional {
	public static void main(String[] args) {
		Integer[] arr = {1, -2, 3, -4, 5};	
		List<Integer> list = Arrays.asList(arr);
		list.forEach(x -> System.out.println(x));
		
		Function<Integer, Integer> absThenNegate = ((Function<Integer,Integer>)Math::negateExact).compose(Math::abs);
		list.forEach(x -> System.out.println(absThenNegate.apply(x)));
	
		Function<Integer, Integer> negateThenAbs = ((Function<Integer, Integer>)Math::negateExact).andThen(Math::abs);
		list.forEach(x -> System.out.println(negateThenAbs.apply(x)));
	}
}
