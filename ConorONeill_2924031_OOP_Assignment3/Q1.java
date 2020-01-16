
import java.util.*;
public class Q1 {
	class Employee {
		private String ppsNum;
		private String name;
		private double salary;
		
		public Employee(String p, String n, double s) {
			ppsNum = p;
			name = n;
			salary = s;
		}
		
		public String getPPS() {
			return ppsNum;
		}
		
		public String getName() {
			return name;
		}
		
		public double getSalary() {
			return salary;
		}
		
		public void editPPS(String p) {
			ppsNum = p;
		}
		
		public void editName(String n) {
			name = n;
		}
		
		public void editSalary(double s) {
			salary = s;
		}
		
		public String toString() {
			return String.format("Employee Information" + ".%n " + name + ".%n " + ppsNum + ".%n " + salary);
		}
	}
	
	class Department {
		private String deptName;
		private Employee manager;
		private int officeNum;
		
		public Department(String d, Employee m, int o) {
			deptName = d;
			manager = m;
			officeNum = o;
		}
		
		@SuppressWarnings("null")
		public Department(String d, Employee m) {
			deptName = d;
			manager = m;
			officeNum = (Integer) null;
		}
		
		public void editDeptName(String d) {
			deptName = d;
		}
		
		public void editManager(Employee m) {
			manager = m;
		}
		
		public void editOfficeNum(int o) {
			officeNum = o;
		}
		
		public String toString() {
			return String.format("Department Information" + ".%n" + deptName + ".%n" + manager.toString() + ".%n" + officeNum);
		}
	}
	
	class Test {
		Employee new1 = new Employee("0000000","Conor",100.00);
		Department new2 = new Department("Tesco",new1,25);
		new1.editPPS("0000001");
		String employee1 = String.valueOf(new1);
		String dept1 = String.valueOf(new2);
		String dept2 = String.valueOf(new2);
		String employee2 = String.valueOf(new1);
	}
}
