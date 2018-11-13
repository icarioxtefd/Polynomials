
public class Triangle
{
	private Point v1;
	private Point v2;
	private Point v3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		v1 = new Point(x1,y1);
		v2 = new Point(x2,y2);
		v3 = new Point(x3,y3);
	}
	
	public Triangle(Point p1, Point p2, Point p3)
	{
		v1 = p1;
		v2 = p2;
		v3 = p3;
	}
	
	
	@Override
	public String toString()
	{
		return "Triangle @ " + v1 + "," + v2 + "," + v3;
	}
	
	public double getPerimeter()
	{
		double dist1 = Point.distance(v1, v2);
		double dist2 = Point.distance(v2, v3);
		double dist3 = Point.distance(v3, v1);
		
		return dist1+dist2+dist3;
	}
	
	public String printType()
	{
		double dist1 = Point.distance(v1, v2);
		double dist2 = Point.distance(v2, v3);
		double dist3 = Point.distance(v3, v1);
		
		if (dist1 == dist2 && dist2 == dist3 && dist3 == dist1)
		{
			return "The triangle is equilater";
		}
		
		if (dist1 == dist2 || dist1 == dist3 || dist2 == dist3)
		{
			return "The triangle is isosceles";
		}
		else
		{
			return "The triangle is scalene";
		}
	}
	
	
	
	
	
	
	
}
