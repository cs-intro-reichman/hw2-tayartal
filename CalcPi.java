// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int items = Integer.parseInt(args[0]);
		double phi4 = 0;
		for(int i = 0; i < items; i++) {
			if( i % 2 == 0) {
				phi4 += 1.0 / (2*i +1);
			} 
			else {
				phi4 -= 1.0 / (2*i + 1);
			}

		}
		double phi = phi4 * 4;
		double phiMath = Math.PI;

		System.out.println("pi according to Java: " + phiMath);
		System.out.println("pi, approximated:     " + phi);
	}
}
