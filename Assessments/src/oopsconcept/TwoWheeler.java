package oopsconcept;

public class TwoWheeler extends Vehicle {

	int noofwheel;
    public TwoWheeler(String regno,String model,int totalWheels)
    {
    	super(regno, model);
        noofwheel=totalWheels;
    }
    void display()
    {
        System.out.println("Pulser");
        super.display();
        System.out.println("No. of wheel : " +noofwheel);
    }
}
