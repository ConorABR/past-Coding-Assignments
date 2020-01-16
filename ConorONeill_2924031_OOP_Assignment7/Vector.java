
final class Vector implements Comparable<Vector> {
	private final double a, b;
	Vector(double a0, double b0) {
		a = a0; b = b0;
	}
	
	public String toString() {
		return "The vector is (" + a + ", " + b + ").";
	}
	
	public boolean equals(Vector y) {
		if ((a == y.a) && (b == y.b)) {
			return true;
		} 
		return false;
	}
	
	@Override
	public int compareTo(Vector z) {
		if ((a == z.a) && (b == z.b)) {
			return 0;
		} else if ((a > z.a) && (b > z.b)) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public int hashCode(Vector z) {
		return z.hashCode();
	}

}
