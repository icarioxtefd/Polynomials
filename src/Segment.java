
public class Segment
{
	private Point startPoint;
	private Point endPoint;
	
	public Segment()
	{
		startPoint = new Point();
		endPoint = new Point();
	}
	
	public Segment(Point startPoint, Point endPoint)
	{
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public double calcModule()
	{
		int x1 = startPoint.getX();
		int x2 = endPoint.getX();
		int y1 = startPoint.getY();
		int y2 = endPoint.getY();
		
		int c1 = x2 - x1;
		int c2 = y2 - y1;
		
		return Math.sqrt((c1*c1)+(c2*c2));
	}

	public String toString()
	{
		return (startPoint + " <---> " + endPoint);
	}
	
	public void setOffset(int offX, int offY)
	{
		int x1 = startPoint.getX() + offX;
		int x2 = endPoint.getX() + offX;
		int y1 = startPoint.getY() + offY;
		int y2 = endPoint.getY() + offY;
		
		startPoint.setX(x1);
		startPoint.setY(y1);
		endPoint.setX(x2);
		endPoint.setY(y2);
	}
	
	public void setStartPoint(int setX, int setY)
	{
		int x = startPoint.getX();
		int y = startPoint.getY();
		
		startPoint.setX(x);
		startPoint.setY(y);
	}
	
	public void setEndPoint(int setX, int setY)
	{
		int x = endPoint.getX();
		int y = endPoint.getY();
		
		endPoint.setX(x);
		endPoint.setY(y);
	}
	
	public Point getStartPoint()
	{
		int x = startPoint.getX();
		int y = startPoint.getY();
		
		Point p = new Point(x, y);
		return p;
	}
	
	public Point getEndPoint()
	{
		int x = endPoint.getX();
		int y = endPoint.getY();
		
		Point p = new Point(x, y);
		return p;
	}
	
}
