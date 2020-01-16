/* 
* Assignment 08: Student.java
 *
 * Student name: Conor O'Neill
 * Student number: 2924031
 *
 */
import java.lang.reflect.Array;
import java.util.*;
public class Assignment8_2018 {
	public static void main(String[] args) {
		//Q1 Test =====================================
		Converter new1 = new Converter(10.00, 15.00, 20.00, 30.00);
		double x = Converter.inchesToCentimetres(15.00);
		System.out.println(x);
		double y = Converter.centimetresToInches(10.00);
		System.out.print(y);
		double w = Converter.milesToKilometers(20.00);
		System.out.println(w);
		double z = Converter.kilometersToMiles(30.00);
		System.out.println(z);
		// Q1 end ======================================

		// Q2 Test ======================================
		//Test array
		Student[] mlst = {
			new Student("A12345","Murphy","Donal"),
			new Student("A12346","Estefan","Faheem"),
			new Student("A12347","Boland","Barry"),
			new Student("A12348","Tynan","Ruairi"),
			new Student("A12349","Power","Paddy"),
			new Student("A12350","Tierney","Eoin"),
			new Student("A12351","Mullins","Tony"),
			new Student("A12352","Power","Paddy"),
			new Student("A11111","Boland","Veronica")
		};
		Arrays.sort(mlst);
		System.out.printf("This is sorting by natural selection:", Arrays.toString(mlst));
		for (int i = 0; i < mlst.length; i++) {
			Student.surnameCompare(mlst[i]);
		}
		System.out.printf("This is sorting by comparaator", Arrays.toString(mlst));
		// Q2 end =======================================
		
		// Q3 Test ======================================
		
	}
}
