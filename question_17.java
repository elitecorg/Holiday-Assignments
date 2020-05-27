import java.util.*;
import java.io.File;
public class question_17
{
    public static void main(String args[])
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your file path: ");
        String chk = scan1.nextLine();
        
        
        String [] extchk = chk.split("[.]");
        
        File myObj = new File(extchk[0]);
        
        String fname = myObj.getName();
        
        
        String extfile = extchk[1];
        String filechk1 = extchk[0];
      
        char[] finalstr = new char[extchk[0].length()];
        //assigns the char array 97 122
        for (int i = 0; i < extchk[0].length(); i++) 
        { 
           finalstr[i] = extchk[0].charAt(i);
           
        }
        for(int a = finalstr.length-1; a > 0; a--)
        {
            if ((((int)finalstr[a] >= 65) && ((int)finalstr[a] <=90)) || (((int)finalstr[a] >= 97) && ((int)finalstr[a] <= 122)))
            {
                finalstr[a] = ' ';
            }
            else
            {
                finalstr[a] = ' ';
                break;
            }
        }
        System.out.print("Path is: ");
        System.out.println(finalstr);
        System.out.println("File name : "+fname);
        System.out.println("File Extension : "+extchk[1]);
        
    }
}