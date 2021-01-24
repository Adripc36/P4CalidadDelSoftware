package CalidadDelSoftware.Practicas4;

public class NumerosSimples {
	
	
	private float num1;
	
		
	public NumerosSimples()
	{
		
	}
	
	public NumerosSimples(float num1)
	{
		this.num1 = num1;
	}
	
	
	public float sumar(float num1, float num2)
	{
		return(num1 + num2);

	}
	
	
	public float restar(float num1, float num2)
	{
		return (num1 - num2);
	}
	
	
	public float multiplicar(float num1, float num2)
	{
		return(num1 * num2);
	}
	
	public float dividir(float num1, float num2)
	{
		if(num2 == 0)
		{
			System.out.print("No se puede dividir por 0");
			
			return (Float) null;
		}
		else
		{
			return (num1/num2);
		}
	}
	
	public float modulo (float num1, float num2)
	{
		return (num1%num2);
		
		
	}
	
	public float raices (float num1, float num2)
	{
		
		
		return (float) (Math.pow(num1, 1/num2));
	}
	
	//Solo creado para mostrar como funciona el test del tiempo
	public int time () throws InterruptedException{
		Thread.sleep(3555);
		return 1;
	}
	
	
	 public double [] getOtroArray (double [] array){
		array[0] ++;
		return array;
	}
	
	
	public boolean mayorQue(float num1, float num2)
	{
		if(num1 > num2)
		{
			return true;
		}
		else
		{
			return false;		
		}

	}
	
	
	public double [] getOtroArray2 (double [] array){
		array[1] --;
		return array;
	}
	

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}


}
