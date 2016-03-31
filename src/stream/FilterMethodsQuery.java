package stream;

import java.util.Arrays;

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

class Rectangle {
	private int x;
	private int y;
	private int height;
	private int width;
	
	public Rectangle(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public Rectangle scale(double percent) {
		double scaleFactor = 1.0d + percent;
		int newHeight = (int) (height * scaleFactor);
		int newWidth =  (int) (width * scaleFactor);
		return new Rectangle(x, y, newHeight, newWidth);
	}
	

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", height=" + height + ", width=" + width + "]";
	}

	public int getX() { return x; }
	public int getY() { return y; }
	public int area() { return width * height; }
	public int getHeight() { return height; }
	public int getWidth() { return width; }
}
