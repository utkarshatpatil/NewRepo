package test;

public class Calculator {
	
	private int a,b,sum;

	public void add()
	{
		sum =a+b;
		System.out.println("Addition :"+sum);
	}
	
	public int multiply(int a,int b)
	{
		return a*b;
	}
	
	public int division(int a,int b)
	{
		return a/b;
	}
}
