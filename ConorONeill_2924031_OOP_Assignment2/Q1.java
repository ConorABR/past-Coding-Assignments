
public class Q1 {
	class Engine {
		private int cc;
		public Engine(int c){
			cc = c;
		}
		public int get(){
			return cc;
		}
		public void edit(int c){
			cc = c;
		}
		public String toString(){
			return "CC: " + cc;
		}
	}
	
	class Vehicle {
		private String make;
		private String model;
		private Engine engine;
		public Vehicle(String mk, String mdl, Engine e){
			make = mk;
			model = mdl;
			engine = e;
		}
		private Engine getEngine() {
			return engine;
		}
	}
}
