package CalidadDelSoftware.Practicas4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

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
	double [] nums = {1,0};
	double [] nums2 = {1,2};
	
	
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
    
    
    @BeforeClass
	public static void testantesDeTodo() {
		
		System.out.println("CONEXION CON LA BASE DE DATOS");

	}
	
	@AfterClass
	public static void testDespuesDeTodo() throws IOException {
		
		System.out.println("Fin de todo");

		
	}
	
	@Before
	public void testantesQue() throws InterruptedException{
		
		
		System.out.println("Realizando Test");
		
		Thread.sleep(1000);
		

	}
	
	@After
	public void testdespuesQue() {
		System.out.println("Test Finalizado...");
	}
    
    
	public void testResta() {
		assertEquals(2f,n1.sumar(n1.getNum1(),n2.getNum1()),-5);
	}
	
	@Ignore
	public void testMultiplicacion() {

		assertEquals(3,n1.multiplicar(n1.getNum1(),n2.getNum1()),0);		
		
		
	}
	

	public void testDivision() {

		assertEquals(0.5,n1.dividir(n1.getNum1(),n2.getNum1()),0);		
		
		
	}
	

	public void testModulo() {

		assertEquals(5,n1.modulo(n1.getNum1(),n2.getNum1()),0);		
		
		
	}

	public void testRaices() {

		assertEquals(1,n1.raices(n1.getNum1(),n2.getNum1()),0);		
		
		
	}
	
	

	public void testIguales(){
		n1.getOtroArray(nums);
		assertSame(nums, nums);
		//System.out.println("Nums despues de modificarse: "+nums[0]+"  "+nums[1]);
	}
	

	public void testNoiguales(){
		assertNotSame(n1,n2);
	}
	

	public void testNulo() {
		assertNull(nums[0]);
	}

	public void testNonulo()
	{
		assertNotNull(nums[0]);
	}
	
	public void testVerdad()
	{
	//	System.out.println("\nnumero1= " + n1.getNum1() + " numero2= "+ n2.getNum2()+"\n");
		assertTrue(n1.mayorQue(n1.getNum1(), n2.getNum1()));
	}
	
	public void testFalso()
	{
		
	//	System.out.println("\nnumero1= " + n1.getNum1() + " numero2= "+ n2.getNum2()+"\n");
		assertFalse(n1.mayorQue(n1.getNum1(), n2.getNum1()));
	}
	
	
	public void testMatricesIguales(){
		
		
	//	System.out.println("Array1: "+nums[0]+"  "+nums[1]);
	//	System.out.println("Array2: "+nums2[0]+"  "+nums2[1]);
		assertArrayEquals(nums,n1.getOtroArray2(nums2),0);
	//	System.out.println("\nArray1 despues de modificarse: "+nums[0]+"  "+nums[1]);
	//	System.out.println("Array2 despues de modificarse: "+nums[0]+"  "+nums[1]);
		
	}
	
	
    
 

        
    
    
    
}
