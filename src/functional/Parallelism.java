package functional;

import java.util.stream.Stream;

public class Parallelism {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(12, 52, 32, 74, 25);
		stream.parallel().map(x->x*2).forEach(System.out::println);
	}
}
