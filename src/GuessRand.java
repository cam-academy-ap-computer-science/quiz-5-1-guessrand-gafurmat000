import java.util.*;   
public class GuessRand {

	public static void main(String[] args) {
		int rand;
		boolean success = false;
		Random r = new Random();// Instantiate (create) a new Random() object 'r'
		int number = r.nextInt(100) + 1; // Get a random number between 1-100
		
		while (success != true) {   // loop until 'success' is true. ) {
			Scanner console = new Scanner(System.in);// Instantiate a new Scanner 'console'
			System.out.println("Your Guess: ?");
			int guess = console.nextInt(); // Get an integer from the user.
			 success = compare(guess, number);  // call 'compare()' method
		}
		
	}
	
	
	
	// Declare a method named 'compare()' that accepts two parameters 'guess' and 'rand' and returns
	// a boolean.
	public static boolean compare(int guess, int rand) {
		boolean got_it = false;
		if (guess == rand) {  // Fix if test
			System.out.println("You got it!");
			got_it = true;
		} else if (guess < rand) {  // Fix if test
			System.out.println("No, it's Higher");
		} else {
			System.out.println("No, it's Lower");
		}
		return got_it;
	}

}
	

