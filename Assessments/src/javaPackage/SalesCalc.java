package javaPackage;

import java.util.Scanner;

public class SalesCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			
		System.out.println("Product 1, $2.98");
		System.out.println("product 2, $4.50");
		System.out.println("product 3, $9.98");
		System.out.println("product 4, $4.49");
		System.out.println("product 5, $6.87");
		System.out.println("Enter 6 to Exist");
		
		System.out.println("Enter the product number");
		int productNumber = sc.nextInt();
		
		if (productNumber == 6)
		{
			break;
		}
		
		
		System.out.println("Enter the quantity sold");
		int quantitySold = sc.nextInt();
		
		double retailPrice = 0;
		switch(productNumber){
		case 1:
		retailPrice+=2.98*quantitySold;
		break;
		case 2:
		retailPrice+=4.50*quantitySold;
		break;
		case 3:
		retailPrice+=9.98*quantitySold;
		break;
		case 4:
		retailPrice+=4.49*quantitySold;
		break;
		case 5:
		retailPrice+=6.87*quantitySold;
		break;
		}
		//display resut
		System.out.println("\nThe total retail value of all products sold: $"+retailPrice);

	}
	}

}
