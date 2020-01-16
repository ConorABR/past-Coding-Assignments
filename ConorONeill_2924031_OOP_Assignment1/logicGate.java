
public class logicGate {
	boolean state;
	
	
	//constructor
	public logicGate(boolean state){
		state = false;
		System.out.println("This is the constructor");
	}
	
	//display method
	public void display(){
		System.out.println("The logic gate is set to: " + state);
	}
	
	//general methods
	public boolean not(boolean state){
		if (state == true){
			return false;
		}
		return true;
	}
	
	public boolean state(boolean state){
		return state;
	}
	
	public boolean set(boolean state) {
		if (state == false){
			return true;
		}
		return true;
	}
	
	public boolean negate(boolean state) {
		if (state == true){
			return false;
		}
		return false;
	}
	
	class LogicTest{
		public void main(String args[]) {
			logicGate s1 = new logicGate(false);
			s1.display();
			s1.not(state);
			s1.state(state);
			s1.set(true);
			s1.negate(false);
		}
	}
}
 