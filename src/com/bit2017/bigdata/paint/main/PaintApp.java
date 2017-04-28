package com.bit2017.bigdata.paint.main;

import com.bit2017.bigdata.paint.i.Drawable;
import com.bit2017.bigdata.paint.point.ColorPoint;
import com.bit2017.bigdata.paint.point.Point;
import com.bit2017.bigdata.paint.shape.Circle;
import com.bit2017.bigdata.paint.shape.Rect;
import com.bit2017.bigdata.paint.shape.Triangle;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(100);
		
		Point point2 = new Point(100, 200);
		
//		drawPoint(point1);
		draw(point1);
//		drawPoint(point2);
		draw(point2);
		
		point1.show(false);
		point1.show(true);
		
		Point point3 = new ColorPoint(200, 100, "red");
//		drawPoint(point3);
		draw(point3);
		
//		drawShape(new Rect());
//		drawShape(new Circle());
		draw(new Rect());
		draw(new Circle());
		draw(new Triangle());
	}
	
//	public static void drawPoint(Point pt) {
//		pt.show();
//	}
//	
//	public static void drawShape(Shape s) {
//		s.draw();
//	}
	
	public static void draw(Drawable d) {
		d.draw();
	}

}
