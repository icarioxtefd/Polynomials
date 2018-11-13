
public class MainPolynomial
{
	
	public static void main(String[] args)
	{
		Polynomial pol = new Polynomial(2,1,2,3);
		
		//System.out.println(pol);
		
		//System.out.println(pol.evaluate(2));
		
		//System.out.println(pol.add(new Polynomial(1.0,2.0,3.0,4.0)));
		System.out.println(pol.multiply(new Polynomial(1,2,3)));
		
		//9x^5+12x^4+10x^3+10x^2+5x+2
	}

}
