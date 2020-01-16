
public interface Operations {
	public Rational add(Rational q);
	public Rational sub(Rational q);
	public Rational mult(int k);
	public Rational div(Rational q);
	public Rational dibBy(Rational q, int k);
	public boolean eq(Rational q); // returns true if this = q
}

class Rational implements Operations {
	private int num, den;
	public Rational(int n, int d) {
		//assume d != 0
		if (n<0 && d<0) {
			n=-n; 
			d=-d;
		} else if (d<0) {
			n=-n;
			d=-d;
		}
		int g = gcd(Math.abs(n), Math.abs(d));
		num = n/g;
		den = d/g;
	}
	/*public Rational(int n){
		
	} */
	public int num() {
		return num;
	}
	public int den(){
		return den;
	}
	public String toString() {
		return "the rational number is: " + num + "/" + den + ".";
	}
	private int gcd(int a, int b) {
		if(b==0) return a;
		else return gcd(b, a%b);
	}
	public Rational flip(){
		return new Rational(den,num);
	}
	@Override
	public Rational add(Rational q) {
		int LCD = den * q.den(); // LCD = lowest common denominator
		int num1 = num * q.den();
		int num2 = q.num() * den;
		int sum = num1 + num2;
		return new Rational(sum,LCD);
	}
	
	@Override
	public Rational sub(Rational q) {
		int LCD = den * q.den();
		int num1 = num * q.den();
		int num2 = q.num() * den;
		int diff = num1 - num2;
		return new Rational(diff,LCD);
	}
	@Override
	public Rational mult(int k) {
		int numerator = num * k;
		int denominator = den * k;
		return new Rational(numerator,denominator);
	}
	public Rational multR(Rational q){
		int numerator = num * q.num();
		int denominator = den * q.den();
		return new Rational(numerator,denominator);
	}
	@Override
	public Rational div(Rational q) {
		return multR(q.flip());
	}
	@Override
	public Rational dibBy(Rational q, int k) {
		int numerator = (num * q.num()) % k;
		int denominator = (den * q.den()) % k;
		return new Rational(numerator,denominator);
	}
	@Override
	public boolean eq(Rational q) {
		if (this == q) return true;
		else return false;
	}
}

class testClass {
	Rational k = new Rational(4,5);
	int k1 = k.num();
	System.out.println(k1);
	int k2 = k.den();
	System.out.println(k2);
	r1 = new Rational(5,6);
	Rational new1 = new Rational(k.add(r1));
}