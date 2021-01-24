package CalidadDelSoftware.Practicas4;

import static org.junit.Assert.assertEquals;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	
    NumerosSimples n1 = new NumerosSimples(1);
	NumerosSimples n2 = new NumerosSimples(2);
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
 
	public void testSuma() {
		assertEquals(2f,n1.sumar(n1.getNum1(),n2.getNum1()),3);
	}
        
    
    
    
}
