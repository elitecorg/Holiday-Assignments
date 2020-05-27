/*19. Write a program to accept a word and convert it into lowercase if 
 * it is in uppercase and display the new word by replacing only the vowels
 * with the characters following it.
Example:
Sample Input: computer
Sample Output: cpmpvtfr 
 */
import java.util.*;

public class question_19
{
    public static void main(String args[])
    {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String wordstr = word.nextLine();
        wordstr = wordstr.toLowerCase(); //Converts the string in lower case
        char[] charword = new char[wordstr.length()];
        //assigns the char array and also replaces the vowels
        for (int i = 0; i < wordstr.length(); i++) 
        { 
            charword[i] = wordstr.charAt(i);
            if (charword[i] == 'a') {charword[i]='b';}
            if (charword[i] == 'e') charword[i]='f';
            if (charword[i] == 'i') charword[i]='j';
            if (charword[i] == 'o') charword[i]='p';
            if (charword[i] == 'u') charword[i]='v';
        } 
        
        // Printing content of array 
        for (char c : charword) { 
            System.out.print(c); 
        } 
        
        
    }
    
}        