
public class Rectangle extends Point
{
	private int height;
	private int width;
	
	private int area;
	
	public Rectangle()
	{
		super();
		height = 0;
		width = 0;
	}
	
	public String toString()
	{
		return super.toString() + " " + "height: " + height + " width: " + width;
	}
	
	public Rectangle(Point p, int newHeight, int newWidth)
	{
		super(p.getX(), p.getY());
		height = newHeight;
		width = newWidth;
	}
	
	public Rectangle(Point p1, Point p2)
	{
		super(p1.getX(), p1.getY());
		height = p2.getX();
		width = p2.getY();
	}
	
	
	
	public int getArea()
	{
		area = height * width;
		
		return area;
	}
	
	
	
	public Point getBottomLeftPoint()
	{
		Point p = new Point(getX(), getY());
		
		return p;
	}
	
	public Point getTopLeftPoint()
	{
		Point p = new Point(getX(), getY()+height);
		
		return p;
	}
	
	public Point getTopRightPoint()
	{
		Point p = new Point(getX()+width, getY()+height);
		
		return p;
	}
	
	public Point getBottomRightPoint()
	{
		Point p = new Point(getX()+width, getY());
		
		return p;
	}
	
	
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	
	public void setWidth(int newWidth)
	{
		width = newWidth;
	}
	
	public void setHeight(int newHeight)
	{
		height = newHeight;
	}
	
	
	
	
	
	
	
	
	
	
}
