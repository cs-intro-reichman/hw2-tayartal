// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
                String word = args[0];
                int numCheers = Integer.parseInt(args[1]);

                for (int i = 0; i < word.length(); i++) {
                        char letter = word.charAt(i);
                        if ("AEFHILMNORSX".indexOf(letter) != -1) {
                                System.out.println("Give me an " + letter + ": " + letter + "!");
                        } else {
                                System.out.println("Give me a " + letter + ": " + letter + "!");
                        }
                }     
                System.out.println("What does that spell?");
               // System.out.println(word + "!!!");
                for (int i = 0; i < numCheers; i++) {
                        System.out.println(word + "!!!");
                }
        }
}
