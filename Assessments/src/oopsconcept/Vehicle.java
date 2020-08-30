package oopsconcept;

public class Vehicle {
	
	String regNumber;
    String vehicleModel;
    Vehicle(String regno, String model)
    {
        regNumber=regno;
        vehicleModel=model;
    }
    void display()
    {
        System.out.println("Registration no: "+regNumber);
        System.out.println("Model no: "+vehicleModel);
    }
    
    public static void main (String args[])
    {
    	Car ford = new Car("Tn 20 BM 6454", "Ford", 5);

    	TwoWheeler pulser = new TwoWheeler("Tn 25 BM 4343", "Pulser", 2);
    	
    	ford.display();
    	
    	System.out.println("-----------------------------");
    	pulser.display();
    }

}
