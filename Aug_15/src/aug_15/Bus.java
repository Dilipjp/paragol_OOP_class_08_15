package aug_15;

public class Bus extends Vehicle {
	
	private int passengerCapacity;
	
	public Bus() {
		System.out.println("Creating a bus object with default");
		passengerCapacity = 10;
	}
	public Bus(int pc) {
		System.out.println("Creating a bus object with padameterd cosntruct ");
		passengerCapacity = pc;
	}
	public Bus(int nd, double pr, int pc) {
		this(pc);
		System.out.println("Creating a bus object with padameterd ");
		setNumOdDoors(nd);
		setPrice(pr);
		passengerCapacity = pc;
	}
	
	public Bus(Bus b) {
		System.out.println("Creating a bus object with copy");
		setNumOdDoors(b.getNumOdDoors());
		setPrice(b.getPrice());
		passengerCapacity = b.passengerCapacity;
	}
	
	public double getPrice() {
		String s = "Bus";
		System.out.println("get price is come from "+ s);
		return price;
	}
	public void setPrice(double pr) {
		if(pr < getPrice()) {
			System.out.println("The pice of this bus will be reduced from " + getPrice() + "$ to " + pr + "$");
		}else if(pr < getPrice()) {
			System.out.println("The pice of this bus will be increcesed from " + getPrice() + "$ to " + pr + "$");
		}
		super.setPrice(pr);
		// this pr is totally illigal
	}

}
