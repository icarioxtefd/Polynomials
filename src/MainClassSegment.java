public class MainClassSegment 
{
	
	public static void main(String[] args) 
	{
		Point p1 = new Point(4, 5);
		Point p2 = new Point(6, 8);
		
		Segment segm1 = new Segment(p1, p2);
		
		System.out.print("Module: " + segm1.calcModule());
		System.out.println();
		
		System.out.print(segm1.toString());
		System.out.println();
		
		segm1.setOffset(4, 4);
		System.out.print(segm1);
		System.out.println();
		
		System.out.print("Start point: " + segm1.getStartPoint());
		System.out.println();
		System.out.print("End point: "+ segm1.getEndPoint());
		
		Point points[] = {new Point(2,2), new Point(2,4), new Point(4,4), new Point(4,2)};
		System.out.println();
		
		Polygon polyg = new Polygon(points);
		
		System.out.println();
		polyg.setOffSet(2, 4);
		
		System.out.println();
		System.out.println(polyg.toString());
		
		System.out.println();
		System.out.println("Perimeter: " + polyg.calcLength());
	}
}
