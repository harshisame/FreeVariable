import java.awt.Point;
import java.util.ArrayList;
import java.util.Objects;


public class Polygon implements AreaCalculator{

	ArrayList<Point> polygon = new ArrayList<Point>();
	
	private AreaCalculator areaCalc;
	private ArrayList<Point> points;
	
	public void PolygonDefault(ArrayList<Point> points, AreaCalculator areaCalc)
	
	{
		this.points = Objects.requireNonNull(points);
		this.areaCalc = Objects.requireNonNull(areaCalc); 
	}

		
	public Polygon(ArrayList<Point> points)
	{
		if(points.size() == 3){
			PolygonDefault(points, ( p)->{
				
			double area;
			double s;
			double c;
			double b;
			double a;
			
			Point a1 = points.get(0);
			double ax = a1.getX();
			double ay = a1.getY();
			
			Point b1 = points.get(0);
			double bx = b1.getX();
			double by = b1.getY();
			
			Point c1 = points.get(0);
			double cx = c1.getX();
			double cy = c1.getY();
			
			a = Point.distance(ax, bx, ay, by);
			b = Point.distance(bx, cx, by, cy);
			c = Point.distance(cx, ax, cy, ay);
			
			s= (a+b+c)/2;
			
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			float area1 = (float) area;
			return area1;
			
		});
			
		}
		
	}
	
	public ArrayList<Point> addPoint(Point point)
	
	{
			points.add(point);
			return points;
		
	}
	
	
	public void setArea(AreaCalculator calc){
		this.areaCalc = Objects.requireNonNull(calc); 
	}

	@Override
	public float getArea(ArrayList<Point> points) {
		float area =  areaCalc.getArea(points);
		return area;
	}
	
}
