package aug_15;

public class SportCar extends Car {
	private double gasConsumption;
	
	public SportCar() {
		System.out.println("Creating a SportCar object with default");
		gasConsumption = 4;
	}

	public SportCar(int nd, double pr, int ns, double gc) {
		super(nd, pr, ns);
		System.out.println("Creating a SportCar object with parameter");
		gasConsumption = gc;
	}
	
	public SportCar(SportCar sc) {
		System.out.println("Creating a car object with copy construct ");
		setNumOdDoors(sc.getNumOdDoors());
		setPrice(sc.getPrice());
		setNumOfSeats(sc.getNumOfSeats());
		gasConsumption = sc.gasConsumption;
	}

	public double getGasConsumption() {
		return gasConsumption;
	}

	public void setGasConsumption(double gc) {
		gasConsumption = gc;
	}

	@Override
	public String toString() {
		return "This sportcar has" + getNumOdDoors() + " doors and price is" +  getPrice() +
		"$ the nu of seats of this sport car is " + getNumOfSeats() +
		"and its gas consumption is " + gasConsumption + "gallon/100 mile";
		
	}
	
	public double getPrice() {
		String s = "SportCar";
		System.out.println("get price is come from " + s);
		return price;
	}
	
	

}
