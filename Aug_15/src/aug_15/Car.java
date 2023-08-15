package aug_15;

public class Car extends Vehicle{
	private int numOfSeats;
	
	public Car() {
		System.out.println("Creating a car object with default");
		numOfSeats = 10;
	}
	public Car(int nd, double pc, int ns) {
		super(nd, pc);
		System.out.println("Creating a car object with padameterd of parents ");
		
		numOfSeats = ns;
	}
	
	public Car(Car c) {
		System.out.println("Creating a car object with copy construct ");
		setNumOdDoors(c.getNumOdDoors());
		setPrice(c.getPrice());
		numOfSeats = c.numOfSeats;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int ns) {
		numOfSeats = ns;
	}
	@Override
	public String toString() {
		return "This car has" + getNumOdDoors() + "doors and price is" + getPrice()+ "the number of seats is" + numOfSeats;
	}
	
	public double getPrice() {
		String s ="Car";
		System.out.println("get price is come from "+ s);
		return price;
	}
	

	
	


}
