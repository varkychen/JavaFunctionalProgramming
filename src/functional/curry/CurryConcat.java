package functional.curry;

import java.util.function.BiFunction;
import java.util.function.Function;

public class CurryConcat {
	public static void main(String[] args) {
		BiFunction<String, String, String> biFunctionConcat = (a, b) -> a + b;
		System.out.println(biFunctionConcat.apply("Cat","Dog"));
		
		Function<String, Function<String, String>> curryConcat = (a) -> (b) -> biFunctionConcat.apply(a,b);
		Function<String, String> intermediateFunction = curryConcat.apply("Cat");
		System.out.println(intermediateFunction);
		System.out.println(intermediateFunction.apply("Dog"));
	}
}
