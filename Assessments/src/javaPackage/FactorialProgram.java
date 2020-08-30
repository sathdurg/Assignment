package javaPackage;


public class FactorialProgram { 
	
	static long factVariable =1;
	
	public static void main (String args[])
	{
		factorial(20);
	}

	private static void factorial(long a) { 
		
		for (long i =1 ; i<= a ; i++)
		{ 
			factVariable = factVariable * i;
			
		}
		
		System.out.println("---------------------");			
		System.out.print("Factorial Value");
		System.out.println();
		System.out.println("---------------------");
		
		System.out.println(factVariable);
		System.out.println("---------------------");
       		
	}

}
