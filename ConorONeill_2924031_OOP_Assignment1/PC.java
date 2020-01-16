// hi, just to let you know, i only recieved access to moodle the same day as the deadline for this asssignment. I hope you can take this into consideration when marking said assignment. Thank you.

public class PC {
	String make;
	String processor;
	int RAM;
	int harddrive;
	double price;
	
	//constructor
	public PC(String make, String processor, int RAM, int harddrive, double price){
		make = "Toshiba";
		processor = "intel i5";
		RAM = 16;
		harddrive = 1024;
		price = 450.00;
		System.out.println("This is the constructor");
	}
	
	//display method
	public void display(){ 
		System.out.println("Make: " + make);
		System.out.println("Processor: " + processor);
		System.out.println("RAM: " + RAM);
		System.out.println("Harddrive: " + harddrive);
		System.out.println("Price: €" + price);
	}
	
	// getter methods 
	
	public String make(){
		return make;
	}
	
	public String processor(){
		return processor;
	}
	
	public int RAM(){
		return RAM;
	}
	
	public int harddrive(){
		return harddrive;
	}
	
	public double price(){
		return price;
	}
	
	//setter methods
	
	public void setPrice(double price){
		double discount = 50.00;
		this.price = price - discount;
		System.out.println(price);
	}
	
	//test class
	
	class PCtest {
		public void main(String args[]){
			PC unit1 = new PC("HP","intel i7",8, 556, 325.00);
			unit1.display();
			unit1.setPrice(unit1.price);
			unit1.display();
		}
	}
}
