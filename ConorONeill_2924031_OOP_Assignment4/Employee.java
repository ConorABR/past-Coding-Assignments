public class Employee extends Person {
	private int EmployeeID;
	private String Department;
	
	public Employee(String n, String p, String g, int e, String d) {
		super(n, p, g);
		this.EmployeeID = e;
		this.Department = d;
	}
	
	public String getAName(Employee x) {
		return Person.getName();
	}
	
	public String getAPhone(Employee x) {
		return Person.getPhone();
	}
	
	public static String getDepartment(Employee x) {
		return x.Department;
	}
	
	public static String getAGender(Employee x) {
		return Person.getGender();
 	}
	
	public String toString() {
		return String.format("Name: " + Person.getName() + ".%n " + "Phone Number: " + Person.getPhone() + ".%n" + "Gender: " + Person.getGender() + ".%n" + "Employee ID: " + EmployeeID + ".%n" + "Department" + Department);
	}
}

class Employees {
	Employee[] eList = new Employee[100];
	
	public void addEmployee(Employee x) {
		for (int i = 0; i < eList.length; i++) {
			if (eList[i] != null) {
				eList[i] = x;
			} else {
				return; // this happens if eList[i] is null
			}
		}
	}
	
	public Employee[] returnEmployeeByGender(String x) {
		Employee[] genderList = new Employee[100];
		for (int i = 0; i < eList.length; i++) {
			if (Employee.getAGender(eList[i]) == x) {
				for (int j = 0; j < genderList.length; j++) {
					if (genderList[j] != null) {
						genderList[j] = eList[i];
					}
				}
			}
		}
		return genderList;
	}
	
	public Employee[] returnEmployeeByDepartment(String x) {
		Employee[] dList = new Employee[100];
		for (int i = 0; i < eList.length; i++) {
			if (Employee.getDepartment(eList[i]) == x) {
				for (int j = 0; j < dList.length; j++) {
					if (dList[j] != null) {
						dList[j] = eList[i];
					}
				}
			}
		}
		return dList;
	}
	
	public Employee getEmployee(String x) {
		for (int i = 0; i < eList.length; i++) {
			 if(x == Employee.getAGender(eList[i])) {
				 Employee x1 = eList[i];
				 return x1;
			 }
		}
		return null;
	}
}

