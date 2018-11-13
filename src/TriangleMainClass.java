
public class TriangleMainClass
{
	
	public static void main(String[] args)
	{
		Triangle tri = new Triangle(0, 0, 1, 1, 2, 0);
		
		System.out.println(tri);
		
		System.out.println();
		System.out.println("The perimeter of the triangle is :" + tri.getPerimeter() + " u");
		
		System.out.println();
		System.out.println(tri.printType());
		
		
		
	}

}
