package test;

public class CalculatorTest {
	
	public void addTest()
	{
		int a = 5;
		int b = 6;
		int sum = a+b;
		System.out.println("Addition = "+sum);
	}

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add();
		System.out.println("Multiplication :"+c1.multiply(2, 6));
	}

}
