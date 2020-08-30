package javaPackage;

public class Invoice {
	
//	instance variable
	
	String number = null;
	String description = null;
	int quantity = 0;
	double pricePerItem = 0.0;
	
//	constructor that initializes the four instance variables
	public Invoice(String number, String description, int quantity, double pricePerItem)
	{
		setNumber(number);
		setDescription(description);
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}
	
//	set and a get method for each instance variable
	
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public String getNumber()
	{
		return number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = (quantity < 0) ? 0 : quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = (pricePerItem < 0.0) ? 0.0 : pricePerItem;
	}

	public static void main(String[] args) {
		Invoice obj = new Invoice ("101", "LionDates", 4 , 25.0);
		Invoice obj2 = new Invoice ("102", "Milk", 3 , 30.0);
		Invoice obj3 = new Invoice ("103", "Honey", 1 , 60.0);
		System.out.print("Part Number:"+obj.getNumber()+"\t Description:"+obj.getDescription()+"\tQuantity:"+obj.getQuantity()+"\tPricePerItem:"+obj.getPricePerItem());
		System.out.println("\tTotal Amount:"+obj.getInvoiceAmount());
		System.out.print("Part Number:"+obj2.getNumber()+"\t Description:"+obj2.getDescription()+"\tQuantity:"+obj2.getQuantity()+"\tPricePerItem:"+obj2.getPricePerItem());
		System.out.println("\tTotal Amount:"+obj2.getInvoiceAmount());
		System.out.print("Part Number:"+obj3.getNumber()+"\t Description:"+obj3.getDescription()+"\tQuantity:"+obj3.getQuantity()+"\tPricePerItem:"+obj3.getPricePerItem());
		System.out.println("\tTotal Amount:"+obj3.getInvoiceAmount());
		

	}
	
	public double getInvoiceAmount ()
	{
		return getQuantity() * getPricePerItem();
	}

}
