
public class Q2 {
	class Email {
		private String home;
		private String work;
		public Email(String h, String w) {
			home = h;
			work = w;
		}
		public String home(){
			return home;
		}
		public String work(){
			return work;
		}
		public String getEmails(){
			return "Home: " + home + ", and Work: " + work + ".";
		}
		public void editBoth(String h, String w){
			home = h;
			work = w;
		}
	}
	
	class Employee {
		private String surname;
		private String name;
		private Email emails;
		public Employee(String s, String n, Email e){
			surname = s;
			name = n;
			emails = e;
		}
		public String fullName(){
			return "Their full name is " + name + " " + surname + ".";
		}
		public Email getEmails(String h, String w){
			String a;
			String b;
			a = h;
			b = w;
			Email new1 = new Email(a, b);
			return new1;
		}
		Email test = new Email("", "");
		public String homeEmail(Email test){
			return test.home();
		}
		public String workEmail(Email test){
			return test.work();
		}
	}
}
