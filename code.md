# Main
```
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    String check; //String to convert to character array once input is received
    PalindromeChecker checker = new PalindromeChecker(); //Object initiated solely to check for palindromes
    char[] letters; //Array of chars to be put into Deque
    Deque<Character> sequence = new LinkedList<Character>(); //New LinkedList to act as a Deque for checking for palindromes
    Boolean result; //The result of the check
    System.out.print("Input a word to check for palindrome: "); //Prompt user for input
    check = input.nextLine();
    while(check.isEmpty())
    {
        System.out.print("You did not input a valid word or phrase. Input a word to check for palindrome: ");
        check = input.nextLine(); //While the input is empty, keep prompting user for input
    }
    letters = check.toCharArray();
    for(int i = 0; i<check.length(); ++i)
    {
        sequence.add(letters[i]); //Put contents of letters array into the Deque LinkedList
    }
    result = checker.checkPalindrome(sequence); //Check for palindrome, and set this variable as a result.
    System.out.println("Is " + check + " a palindrome? Our checker says: " + result);



}
```
# PalindromeChecker
```
import java.util.Deque;
import java.util.LinkedList;
public class PalindromeChecker {
    private Boolean checkResult;
    public Boolean checkPalindrome(Deque<Character> check)
    {
        Deque<Character> checkClone = new LinkedList<Character>(); //New LinkedList Deque to copy input to
        checkClone.addAll(check); //Clone the list
        for(int i=check.size(); i > 0; i--) //Iterate through all the elements of the Deque
        {

            char tempOne = check.removeFirst(); //Set temporary character variables to compare
            char tempTwo = checkClone.removeLast();
            if(tempOne != tempTwo) { //If two letters aren't matching, return as false
                return false;
            }
        }
        return true; //Return true if it did not return false
    }
}
```
