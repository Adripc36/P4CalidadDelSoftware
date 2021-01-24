package CalidadDelSoftware.Practicas4;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
          
    
    
    NumerosSimples n1;
	NumerosSimples n2;
	double [] nums = {1,0};
	double [] nums2 = {1,1};

	
	
	n1 = new NumerosSimples((float) 1.0);
	n2 = new NumerosSimples((float) 2.0);
	
	
	System.out.print(n1.sumar(n1.getNum1(), n2.getNum1()));
	
	
    }
    
}
