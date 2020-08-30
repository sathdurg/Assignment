package javaPackage;

import java.util.Scanner;

public class CustomerLimit {

	int accountNumber, startBalance, totalItemCharges, totalCredits, creditLimit = 0;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		 this.accountNumber = accountNumber;
	}

	public int getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(int startBalance) {
		this.startBalance = startBalance;
	}

	public int getTotalItemCharges() {
		return totalItemCharges;
	}

	public void setTotalItemCharges(int totalItemCharges) {
		this.totalItemCharges = totalItemCharges;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

//	new balance (= beginning balance + charges – credits)
	
	public int getNewBalance() {
		return getStartBalance() + getTotalItemCharges() - getTotalCredits();
	}

	public boolean creditExceeded() {
		return (getNewBalance() > getCreditLimit()) ? false : true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CustomerLimit purchase = new CustomerLimit();


	    char count = 'y';

		while (count != 'n') {

			System.out.print("Enter customer account number: ");
			purchase.setAccountNumber(sc.nextInt());
			System.out.println("Enter StartBalance:");
			purchase.setStartBalance(sc.nextInt());
			System.out.println("Enter charges total:"); 
			purchase.setTotalItemCharges(sc.nextInt());
			System.out.println("Enter Credit Total:");
			purchase.setTotalCredits(sc.nextInt());
			System.out.println("Enter CreditLimit:");
			purchase.setCreditLimit(sc.nextInt());
			
			
			System.out.println("Account Number: \t"+ purchase.getAccountNumber());
			System.out.println("Balance at the beginning of the month  \t"+purchase.getStartBalance());
			System.out.println("Total of all items charged by the customer this month \t"+purchase.getTotalItemCharges());
			System.out.println("All Credit \t"+purchase.getTotalCredits());
			System.out.println("Allowed Credit limit \t"+purchase.getCreditLimit());
			System.out.println("New Balance \t"+purchase.getNewBalance());
			
						
			if(purchase.creditExceeded())
                System.out.println("Credit limit exceeded.");
			
			 System.out.print("Calculate credit for another account? (y/n): ");
	            count = sc.next().charAt(0);
		}

	}

}
