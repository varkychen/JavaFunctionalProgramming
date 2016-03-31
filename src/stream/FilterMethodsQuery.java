package stream;

import java.util.Arrays;

import value.objects.Rectangle;

public class FilterMethodsQuery {
	public static void main(String[] args) {
		Rectangle[] rectangles = {
			new Rectangle(10, 10, 50, 75),
			new Rectangle(30, 40, 30, 45),
			new Rectangle(110, 70, 70, 15),
			new Rectangle(50, 10, 45, 35)
		};
		
		Arrays
			.stream(rectangles)
			.filter(x -> x.getX() > 10)
			.forEach(System.out::println);
	}
}
