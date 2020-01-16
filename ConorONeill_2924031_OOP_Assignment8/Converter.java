/*
 * Assignment 08: Student.java
 *
 * Student name: Conor O'Neill
 * Student number: 2924031
 *
 */
class Converter {
	
	private static double centimetres;
	private static double inches;
	private static double miles;
	private static double kilometers;
	
	Converter(double c, double i, double m, double k){
		centimetres = c; inches = i; miles = m; kilometers = k;
	}
	
	public double centimtres(){return centimetres;}
	public double inches(){return inches;}
	public double miles(){return miles;}
	public double kilometers(){return kilometers;}
	
	public static double centimetresToInches(double c){
		double x;
		x = (c * 2.54);
		return x;
	}
	public static double inchesToCentimetres(double i){
		double y;
		y = (i / 2.54);
		return y;
	}
	public static double milesToKilometers(double m){
		double z;
		z = (1.609 * m);
		return z;
	}
	public static double kilometersToMiles(double k){
		double q;
		q = (k / 1.609);
		return q;
	}
}