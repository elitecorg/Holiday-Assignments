import java.util.*;
public class question_6
{
    public static void main(String args[])
    {
        Scanner sen = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String senstr = sen.nextLine();
        String [] strfin = senstr.split(" ");
        int len = 0,max = 0,j=0;
        for (int i = 0; i < strfin.length; i++)
        {
            len = strfin[i].length();
            if (len > max)
            {
                max=len;
                j=i;
            }
        }
        System.out.println("Longest word in the sentence is: " + strfin[j]);
    }
}        