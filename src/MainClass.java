
public class MainClass
{

	public static void main(String[] args)
	{
		Point p;
		p = new Point(); //creación en memoria de 1 pto
		
		System.out.println(p.toString());
		
		p.moveTo(1, 2);
		
		System.out.println(p); //java de por sí llama al método toString so, unnecessary
		
		Point p2 = new Point(5, 5); //creación de otro
		System.out.println(p2);
		
		Point p3 = p2; //NO se crea otro pto en memoria, simplemente apunta a la dirección del pto2
		System.out.println(p3);
		p3.moveTo(1, 1);
		System.out.println(p2); //modifica la dirección de donde apunta el p3, que YA apuntaba p2, así que p2 apuntará ahí ahora
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
