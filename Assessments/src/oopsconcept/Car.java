package oopsconcept;

public class Car extends Vehicle{

	int noofPassenger;
    public Car(String regno,String model,int totalPassenger)
    {
    	super(regno, model);
    	noofPassenger=totalPassenger;
    }
    void display()
    {
        System.out.println("Car");
        super.display();
        System.out.println("No. of passenger allowed : " +noofPassenger);
    }

}
