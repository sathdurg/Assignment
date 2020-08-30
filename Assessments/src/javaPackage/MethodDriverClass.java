package javaPackage;

import java.util.Scanner;

public class MethodDriverClass {

	public static void main(String[] args) {
		
		double temp=0.0;
		double converts =0.0;
		
		Scanner userInput = new Scanner(System.in);
        MethodManipulation refVariable = new MethodManipulation();
        
        System.out.println("Enter Student average <= 100)");
        System.out.println(refVariable.qualityPoints(userInput.nextInt()));
        
        
        System.out.println( "Enter 1 for Fahrenheit to Celsius equivalent " );
        System.out.println( "Enter 2 for Celsius to Fahrenheit equivalent" );
        System.out.println( "3 to Exit\n " );
        
        int switchVariable;
        
        switchVariable = userInput.nextInt();
        
        
       switch(switchVariable)
       {
           case 1:
    	   System.out.println("Enter fahrenheit temperature: " );
    	   temp = userInput.nextInt();
    	   converts = refVariable.celsius( temp );
    	   System.out.println("Templature"+temp +"Converted celsius value"+converts );
    	   break;

    	   case 2:
    	   System.out.println("Enter celsius temperature: " );
    	   temp = userInput.nextInt();
    	   converts = refVariable.fahrenheit( temp );
    	   System.out.println("Temprature"+temp+"Converted Fahhrenheit value"+converts );
    	   break;

    	   case 3:
    	   break;

    	   default:
    	   System.out.println( "Invalid selection" ); 
       }
       
       
       
       
       
       
       
       
        
        
	}

}
