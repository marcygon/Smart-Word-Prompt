import java.util.List;

public class Main {

    public Main(KeywordsList keywordsList, UserInput userInput, SuggestedList suggestedList){
    };

    /*/
     Here is where we compile the project.
     We initialize instances of KeywordsList, UserInput, and SuggestedList.
     */

    public static void main(String[] args) {
        KeywordsList keywordsList = new KeywordsList();
        UserInput userInput = new UserInput();
        SuggestedList suggestedList = new SuggestedList(keywordsList);

        //Executes the userInput() method to get the input from the user.
        String input = UserInput.userInput();

        //Suggestions list based on the user input provided.
        List<String> suggestions = suggestedList.getSuggestions(input);

        //Checks if the suggested list is empty and prints a message.
        if (suggestions.isEmpty()){
            System.out.println("No coincidence found. Try again!");
        } else {
            //Prints each suggestion from the suggested list.
            for (String suggestion : suggestions) {
                System.out.println(suggestion);
            }
        }

        //Closes the scanner to end the compilation.
        UserInput.closeScanner();
    }
}

