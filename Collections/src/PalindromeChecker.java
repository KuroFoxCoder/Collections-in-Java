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
