package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(100);
		
		Point point2 = new Point(100, 200);
		
		drawPoint(point1);
		drawPoint(point2);
		
		point1.show(false);
		point1.show(true);
	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}

}
