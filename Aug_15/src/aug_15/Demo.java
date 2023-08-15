package aug_15;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle(), v2 = new Vehicle(4, 5000);
		v1.setPrice(22000);;
		v2.setPrice(16000);
		System.out.println("===================================================");
		Bus b1 = new Bus(2, 55000,30),b2= new Bus(3, 62000,55), b3 = new Bus(b1);
		
		System.out.println("===================================================");
		Car c1 = new Car(4, 1200,5),c2= new Car(2, 26000,2);
		
		SportCar sc1 = new SportCar(4, 1200,5,3),sc2= new SportCar(2, 18500,4,4);
		System.out.println("===================================================");
		System.out.println("===================================================");
		System.out.println("===================================================");
		System.out.println("===================================================");
		v1.isCheaper(v2);
		
		System.out.println("===================================================");
		System.out.println("===================================================");
		b3.isCheaper(c1);
		

	}

}
