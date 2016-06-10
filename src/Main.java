import java.awt.Point;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Point> al = new ArrayList<Point>();
		al.add(new Point(1,2));
		al.add(new Point(3,4));
		al.add(new Point(5,6));
		Polygon p = new Polygon(al);			
		System.out.println("Area of Triangle: "+p.getArea(al));
		
		p.addPoint(new Point(7,8));
		p.setArea((ArrayList<Point> points) ->{
			
			double area;
			
			Point p1=points.get(0);
			double p1x = p1.getX();
			double p1y = p1.getY();
			
			Point p2=points.get(1);
			double p2x = p2.getX();
			double p2y = p2.getY();
			
			Point p3=points.get(2);
			double p3x = p3.getX();
			double p3y = p3.getY();
			
			Point p4=points.get(3);
			double p4x = p4.getX();
			double p4y = p4.getY();
			
			double length = Point.distance(p1x, p1y, p2x, p2y);
			
			double breadth = Point.distance(p1x, p1y, p4x, p4y);
			
			
			area = length*breadth;
			float area1 = (float) area;
			return area1;			
		});
		
		System.out.println("\nArea of Rectangle: "+p.getArea(al));
		
		
		
	}

}
