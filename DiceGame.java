import java.util.Scanner;
/**
 * The DiceGame program asks the user to
 * guess an integer, and then the program
 * tells the user if the guess is too low,
 * too high or correct and the number of
 * it took the user to get the correct guess.
 * 
 * @author  Ketia Gaelle Kaze
 * @version 1.0
 * @since   2022-03-02
 */

class DiceGame {
	    /**
	     * Declaring constant.
             */
	    private static final int MIN_NUM = 1;
	        /**
                 * Declaring constant.
                 */
	        private static final int MAX_NUM = 6;
		    /**
                     * Display result to the console.
                     *
                     * @param args nothing passed in
                     */

               public static void main(String[] args) {
	           // declaring variables
                   final int randomNumber = (int) (Math.random() * (MAX_NUM - MIN_NUM + 1)
                                                                    + MIN_NUM);
                   int tries = 0;
                   int userGuessInt = 0;
                   final Scanner sc = new Scanner(System.in);
                   String userGuessString;
                   // use loop to get user guess
                   while (userGuessInt != randomNumber) {
                       // get input from the user
                       System.out.print("Guess a number between 1 and 6: ");
                       userGuessString = sc.nextLine();

                       try {
                           // convert user input from string to an int
                           userGuessInt = Integer.parseInt(userGuessString);
                           // check if guess is between 1 and 6
                           if (userGuessInt >= MIN_NUM && userGuessInt <= MAX_NUM) {
                               // increment tries
                               tries++;
                               // check if guess is too high
                               if (userGuessInt > randomNumber) {
                                   // display message to the user
                                   System.out.println("Your guess is too high.");
                                   // check if guess is too low
                              } else if (userGuessInt < randomNumber) {
                                  // display message to the user
                                  System.out.println("Your guess is too low.");
                                 // check if guess is correct
                              } else {
                                  // display message to the user
                                  System.out.println("You guessed right!");
                                  System.out.println("It took " + tries + " tries!");
                              }
		          } else {
                              // display error message
                              System.out.println("Input should be between 1 and 6. ");
                          }
		       } catch (IllegalArgumentException exception) {
                           // catch invalid inputs
                           System.out.println("Enter a valid integer!");
                       }
                 }
	  }
}
