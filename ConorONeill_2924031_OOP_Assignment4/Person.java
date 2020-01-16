
public class Person {
	private static String name;
	private static String phone;
	private static String gender;
	
	public Person(String n, String p, String g) {
		this.name = n;
		this.phone = p;
		this.gender = g;
	}
	
	public static String getName() {
		return Person.name;
	}
	
	public static String getPhone() {
		return Person.phone;
	}
	
	public static String getGender() {
		return Person.gender;
	}
	
	public String toString() {
		return String.format("Name: " + name + ".%n " + "Phone Number: " + phone + ".%n" + "Gender: " + gender);
	}
}

class personTest {
	Person p1 = new Person("Conor", "000000000", "Male");
	String name = p1.getName();
	String phone = p1.getPhone();
	String gender = p1.getGender();
	// Person.toString(p1); 
}