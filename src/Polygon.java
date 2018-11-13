
public class Polygon 
{
	private Point points[];
	
	//Constructor with no parameters
	public Polygon()
	{
		points = null;
	}
	
	//Constructor that receives k points
	public Polygon(Point points[])
	{
		this.points = points;
	}
	
	//toString
	public String toString()
	{
		String string = "";
		for (int i = 0; i < points.length-1; i++)
		{
			string += points[i].toString() + " - ";
		}
		return string + points[points.length-1];
	}
	
	//éso
	public double calcLength()
	{
		double perimeter = 0d;
		
		for(int i = 0; i < points.length-1; i++)
		{
			Segment s = new Segment(points[i], points[i+1]);
			
			perimeter += s.calcModule();
		}
		Segment s = new Segment(points[0], points[points.length-1]);
		perimeter += s.calcModule();
		return perimeter;
	}
	
	//setOffSet
	public void setOffSet(int offX, int offY)
	{
		for(int i = 0; i < points.length; i++)
		{
			points[i].offSet(offX, offY);
		}
	}

}
