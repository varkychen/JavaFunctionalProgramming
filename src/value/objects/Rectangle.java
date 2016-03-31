package value.objects;

public class Rectangle {

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