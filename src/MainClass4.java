
public class MainClass4
{

	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle();
		
		System.out.println(rec);
		
		
		rec.setX(4);
		rec.setY(7);
		
		System.out.println(rec);
		
		
		Point point1 = new Point(1,1);
		Rectangle rec2 = new Rectangle(point1, 6, 8);
		
		System.out.println(rec2);
		
		
		Point p1 = new Point(2,2);
		Point p2 = new Point(5,8);
		Rectangle rec3 = new Rectangle(p1, p2);
		
		System.out.println(rec3);
		
		
		System.out.println("Its area is: " + rec3.getArea() + "u²");
		
		
		System.out.println();
		
		Segment s = new Segment(new Point(), rec3.getBottomLeftPoint());

		System.out.println("From 0,0 to initial point :" +s);
		
		
		System.out.println();
		
		System.out.print("Top left's point is: " + rec3.getTopLeftPoint() +" ");
		System.out.print("Top right's point is: " + rec3.getTopRightPoint()+" ");
		System.out.print("Bottom left's point is: " + rec3.getBottomLeftPoint()+" ");
		System.out.print("Bottom right's point is: " + rec3.getBottomRightPoint());
		
		//Ej40 me daba pereza crear otro rectángulo; ahí está ya todo de uno^
	}

}
