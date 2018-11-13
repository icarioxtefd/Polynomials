
public class Point
{
	private int x, y; //private "encapsula el att de manera que en otra clase NO es utilizable
	
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	
	public Point(int x, int y)
	{
		this.x = x; //this -> objeto en esta instancia (dentro del método, no en su llamada)
		this.y = y;
	}
	
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
	
	
	public void moveTo(int newX, int newY)
	{
		x = newX;
		y = newY;
	}
	
	//getters
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	//setters
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	
	//sumar otro pto
	public void offSet(int offX, int offY)
	{
		x += offX;
		y += offY;
	}
	
	//distancia 
	public static double distance(Point p1, Point p2)
	{
		Segment s1 = new Segment(p1, p2);
		
		return s1.calcModule();
	}
	
}
