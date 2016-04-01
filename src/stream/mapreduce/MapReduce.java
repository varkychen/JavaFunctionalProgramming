package stream.mapreduce;

import java.util.Arrays;

import value.objects.Rectangle;

public class MapReduce {
	public static void main(String[] args) {
		Rectangle[] rectangles = {
			new Rectangle(10, 10, 50, 75),
			new Rectangle(30, 40, 30, 45),
			new Rectangle(110, 70, 70, 15),
			new Rectangle(50, 10, 45, 35)
		};
		
		Arrays.stream(rectangles)
			.map(r -> r.scale(0.25))
			.forEach(
				r -> System.out.printf("%d * %d = %d%n", r.getHeight(), r.getWidth(), r.area()));
		
		int total = Arrays.stream(rectangles)
						.map(r -> r.scale(0.25))
						.mapToInt(Rectangle::area)
						.sum();
		System.out.println(total);
		
		int mapReduceTotal = Arrays.stream(rectangles)
								.map(r -> r.scale(0.25))
								.mapToInt(Rectangle::area)
								.reduce(0, (r, s) -> {
									System.out.println(r + " + " + s);
									return r + s;
								});
		System.out.println(mapReduceTotal);
	}
}
