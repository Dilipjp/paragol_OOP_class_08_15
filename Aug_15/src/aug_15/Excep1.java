package aug_15;

import java.util.Scanner;

public class Excep1 {
	
	public static double div1(double x, double y) {
	 double result = x/y;
	 System.out.println("comming from divi");
	 System.out.println("result is" + result);
	return result;	
	}
	
	public static double div2(double x, double y) {
		 double result;
		 if(y != 0) {
			 result = x/y;
			 System.out.println("comming from div2");
				return result;	 
		 }else {
			 System.out.println("wrong num");
				return 0;	 
		 }
		
		}
	
	public static double div3(double x, double y) {
		 System.out.println("comming from div3");
		 double result;
		try {
			if(y==0) {
				throw new Exception("You put wrong denumiator cant devide by zero");
			}else {
				result = x/y;
				return result;
			}
		} catch (Exception e) {
			String s = e.getMessage();
			System.out.println(s);
			return 0;
			
		}
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb  = new Scanner(System.in);
		double d1,d2;
		System.out.println("Please enter two value to perform");
		
		d1= kb.nextDouble();
		d2= kb.nextDouble();
		
		div1(d1, d2);
		div2(d1, d2);
		div3(d1, d2);
		
		


	}

}
