package aug_15;

public class Vehicle {

	
	protected int numOdDoors;
	protected double price;
	
	public Vehicle(){
		System.out.println("Creating a vehicle object with default construct");
		numOdDoors = 4;
		price = 1000;
	}
	
	public Vehicle(int nd, double  pr){
		System.out.println("Creating a vehicle object with parameterd construct");
		numOdDoors = nd;
		price = pr;
	}
	public Vehicle(Vehicle vec){
		System.out.println("Creating a vehicle object with copy construct");
		numOdDoors = vec.numOdDoors;
		price = vec.price;
	}
	
	public int getNumOdDoors() {
		return numOdDoors;
	}

	public void setNumOdDoors(int nd) {
		numOdDoors = nd;
	}

	public double getPrice() {
		String s = this.getClass().toString();
		System.out.println("get price is come from " + s);
		return price;
	}

	public void setPrice(double pr) {
		price = pr;
	}

	@Override
//	public String toString() {
//		return "This vehicle has " + numOdDoors + " doors, price=" + price + " ";
//	}
//	
	public String toString() {
		return "This vehicle has " + numOdDoors + " doors, price=" + price + " ";
	}
	
	
	
	public boolean isCheaper(Vehicle v) {
		String s1 = this.getClass().toString();
		String s2 = v.getClass().toString();
		if(getPrice() <  v.getPrice()) {
			System.out.println("The price of this " + s1 + "is cheaper than " + s2 + "object");
			return true;
		}else {
			System.out.println("The price of this " + s1 + "is NOT  cheaper than " + s2 + "object");
			return false;
		}
		
	}

	
}
