import java.util.Scanner;

public class UserInput {

    /*/
     Here we create a scanner that reads an input from the terminal. The userInput() method prints a message in
     terminal, guides the user on the steps to follow and then waits for user input by reading a line from the
     scanner.

     Source: https://www.w3schools.com/java/java_user_input.asp
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static String userInput() {
        System.out.print("Enter a word and press enter to continue: ");
        return scanner.nextLine();
    }

    /*/
     Closes the scanner, terminating the user interaction.
     */
    public static void closeScanner() {
        scanner.close();
    }
}
