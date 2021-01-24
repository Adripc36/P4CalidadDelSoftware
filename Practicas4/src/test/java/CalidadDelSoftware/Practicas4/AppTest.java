package CalidadDelSoftware.Practicas4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;


import java.io.IOException;
import java.time.Duration;



public class AppTest {
 
	
	NumerosSimples n1 = new NumerosSimples(1);
	NumerosSimples n2 = new NumerosSimples(2);
	double [] nums = {1,0};
	double [] nums2 = {1,2};
 
 
	
 
 @Ignore
 @Test
 public void PruebaIgnorame() {
 assertEquals(2f,n1.sumar(n1.getNum1(),n2.getNum1()),0);
 }

 @BeforeClass
	public static void antesDeTodo() {
		
		System.out.println("CONEXION CON LA BASE DE DATOS");

	}

	@AfterClass
	public static void DespuesDeTodo() throws IOException {
		
		System.out.println("Fin de todo");

		
	}

	@Before
	public void antesQue() throws InterruptedException{
		
		
		System.out.println("Realizando Test");
		
		Thread.sleep(1000);
		

	}

	@After
	public void despuesQue() {
		System.out.println("Test Finalizado...");
	}

	@Test
	public void Testbasuma() {

	//	System.out.println("\nValor1 + "+n1.getNum1()+" Valor2 "+n2.getNum1());			
		assertEquals(3,n1.sumar(n1.getNum1(),n2.getNum1()),0);		
	//	System.out.print("la suma da "+n1.sumar(n1.getNum1(), n2.getNum1()));
		
	}

	@Test
	public void Pruebaresta() {
		
		
		n1.setNum1(4);
		
		
		assertEquals(1,n1.restar(n1.getNum1(),n2.getNum1()),0);		
		
		
	}

	@Test
	public void multiplicacion() {

		assertEquals(3,n1.multiplicar(n1.getNum1(),n2.getNum1()),0);		
		
		
	}

	@Test
	public void division() {

		assertEquals(0.5,n1.dividir(n1.getNum1(),n2.getNum1()),0);		
		
		
	}

	@Test
	public void modulo() {

		assertEquals(5,n1.modulo(n1.getNum1(),n2.getNum1()),0);		
		
		
	}

	@Test
	public void raices() {

		assertEquals(1,n1.raices(n1.getNum1(),n2.getNum1()),0);		
		
	}

	@Test
	public void iguales(){
	//	System.out.println("\nNums antes de modificarse: "+nums[0]+"  "+nums[1]);
		n1.getOtroArray(nums);
		assertSame(nums, nums);
		//System.out.println("Nums despues de modificarse: "+nums[0]+"  "+nums[1]);
	}

	@Test
	public void Noiguales(){
		assertNotSame(n1,n2);
	}

	@Test
	public void Nulo() {
		assertNull(nums[0]);
	}
	
	@Test
	public void Nonulo()
	{
		assertNotNull(nums[0]);
	}
	
	@Test
	public void Verdad()
	{
	//	System.out.println("\nnumero1= " + n1.getNum1() + " numero2= "+ n2.getNum2()+"\n");
		assertTrue(n1.mayorQue(n1.getNum1(), n2.getNum1()));
	}
	
	@Test
	public void Falso()
	{
		
	//	System.out.println("\nnumero1= " + n1.getNum1() + " numero2= "+ n2.getNum2()+"\n");
		assertFalse(n1.mayorQue(n1.getNum1(), n2.getNum1()));
	}
	
	
	@Test
	public void MatricesIguales(){
		
		
	//	System.out.println("Array1: "+nums[0]+"  "+nums[1]);
	//	System.out.println("Array2: "+nums2[0]+"  "+nums2[1]);
		assertArrayEquals(nums,n1.getOtroArray2(nums2),0);
	//	System.out.println("\nArray1 despues de modificarse: "+nums[0]+"  "+nums[1]);
	//	System.out.println("Array2 despues de modificarse: "+nums[0]+"  "+nums[1]);
		
	}
	

}
