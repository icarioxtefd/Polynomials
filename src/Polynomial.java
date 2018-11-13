import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Polynomial
{
	private double coefs[];
	
	public Polynomial(double... coefs)
	{
		this.coefs = coefs;
	}
	
	public double[] getCoeffs()
	{
		return coefs;
	}
	
	public int getDegree()
	{
		return coefs.length-1;
	}
	
	public Polynomial(String filename) {
		Scanner in = null;
		try {
		in = new Scanner(new File(filename)); // open file
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		int degree = in.nextInt();
		// read the degree
		coefs = new double[degree+1]; // allocate the array
		for (int i=0; i<coefs.length; ++i) {
		coefs[i] = in.nextDouble();
		}
		}
	
	public String toString()
	{
		String s = "";
		
		int i = coefs.length-1;
		
		while(i > 0)
		{
			if(i==1)
			{
				s+= coefs[i] + "x" + " + ";
				i--;
			}
			else
			{
				s += coefs[i] + "x^" + i + " + ";
				i--;
			}
		}
		s += coefs[0];
		return s;
	}
	
	public double evaluate(double x)
	{
		double res = 0d;
		
		for(int i = 0; i < coefs.length; i++)
		{
			res += coefs[i]*Math.pow(x, i);
		}
		return res;
	}
	
	public Polynomial add(Polynomial newPol)
	{
		int newDegree = Math.max(getDegree(), newPol.getDegree());
		double[] coeffsResult = new double[newDegree + 1];
		double[] coeffsBiggest;
		double[] coeffsSmallest;
		
		if(getDegree() > newPol.getDegree())
		{
			coeffsBiggest = coefs;
			coeffsSmallest = newPol.getCoeffs();
		}
		else
		{
			coeffsBiggest = newPol.getCoeffs();
			coeffsSmallest = coefs;
		}
		
		for(int i = 0; i < coeffsBiggest.length; i++)
		{
			coeffsResult[i] = coeffsBiggest[i];
		}
		
		for(int i = 0; i < coeffsSmallest.length; i++)
		{
			coeffsResult[i] = coeffsResult[i] + coeffsSmallest[i];
		}
		return new Polynomial(coeffsResult);
	}
		
	public Polynomial multiply(Polynomial newPol)
	{
		Polynomial mult = new Polynomial(coefs);
		
		double arrayMult[] = new double[(mult.getDegree() + newPol.getDegree())+1]; //instanciación
		for(int i = 0; i < arrayMult.length; i++)									//inicialización
		{
			arrayMult[i] = 0;
		}
		
		for(int i = 0; i < mult.coefs.length; i++)
		{
			for(int j = 0; j < newPol.coefs.length; j++)
			{
				arrayMult[i+j] += (mult.coefs[i] * newPol.coefs[j]);
			}
			System.out.println(new Polynomial(arrayMult));
		}
		Polynomial idk = new Polynomial(arrayMult);
		return idk;
	}

}
