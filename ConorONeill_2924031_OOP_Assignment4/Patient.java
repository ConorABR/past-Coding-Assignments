

public class Patient extends Person {
	private int PatientID;
	private String BloodType;
		
	public Patient(String n, String p, String g, int pa, String b) {
		super(n, p, g);
		this.PatientID = pa;
		this.BloodType = b;
	}
	
	public static String getTheName(Patient x) {
		return Person.getName();
	}
	
	public static String getThePhone(Patient x) {
		return Person.getPhone();
	}
	
	public static String getTheGender(Patient x) {
		return Person.getGender();
	}
	
	public String toString() {
		return String.format("Name: " + Person.getName() + ".%n " + "Phone Number: " + Person.getPhone() + ".%n" + "Gender: " + Person.getGender() + ".%n" + "Patient ID: " + PatientID + ".%n" + "Blood Type" + BloodType);
	}
}

class PatientTest {
	Patient pa1 = new Patient("Conor", "000000000", "Male",001,"AB");
	getTheName(pa1);
	getThePhone(pa1);
	getTheGender(pa1);
}
}