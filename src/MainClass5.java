
public class MainClass5
{
	private static final int NUMELEM = 10;
	
	public static void main(String[] args)
	{
		Point points[] = new Point[NUMELEM];
		for(int i = 0; i < NUMELEM; i++)
		{
			points[i] = new Point(i,i);
			System.out.print(points[i] + " ");
		}
		
		
		Rectangle recc[] = new Rectangle[NUMELEM];
		for(int i = 0; i < NUMELEM; i++)
		{
			recc[i] = new Rectangle(points[i], 1, 1);
			System.out.println(recc[i]);
		}
		
	}

}
