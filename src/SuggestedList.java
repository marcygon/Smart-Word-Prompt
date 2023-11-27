import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SuggestedList {
    public SuggestedList (KeywordsList keywordsList){
    };

    /*/
     List of suggestions based on the input that the user entered. It will filter the first letter of the input and
     check if there is a coincidence in the list of keywords. The suggestions will be sorted in alphabetical order and
     limited to a maximum of 4 suggestions per input.

     Sources:
     -  Collectors: https://www.geeksforgeeks.org/collectors-tolist-method-in-java-with-examples/
     -  Sorting an array of strings: https://stackoverflow.com/questions/14945656/list-an-array-of-strings-in-alphabetical-order
     */

      public List<String> getSuggestions(String input) {
          return Arrays.stream(KeywordsList.getKeywordsList())
                  .filter(keyword -> keyword.toLowerCase().startsWith(input.toLowerCase()))
                  .sorted(String.CASE_INSENSITIVE_ORDER)
                  .limit(4)
                  .collect(Collectors.toList());
      }
}
