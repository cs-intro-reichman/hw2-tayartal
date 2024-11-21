// Demonstrates the Collatz conjecture.

public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int counter = 0 ; 
		
		for (int i = 1; i <= seed; i++) {
            int ans = i;
			counter = 0 ;
            do { 
				System.out.println(ans + " ");
                if (ans % 2 != 0) {
                    ans = ans * 3 + 1;
                } else {
                    ans /= 2;
                }
                if (mode.equals("v")) {
                    System.out.println(ans + " ");
                }
                counter++;
            } while (ans != 1); 

			if(mode.equals("v")) {
				System.out.print("(" + counter +")\n");
			}
		}
		System.out.println("Every one of the first " + seed + "hailstone sequences reached 1.");

	}
}