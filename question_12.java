import java.util.*;

public class question_12
{
    public static void main(String args[])
    {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter twenty names with space in between two names :  : ");
        String namestr = name.nextLine();
        String [] namefin = namestr.split(" ");
        String temp="";
        for (int i = 0; i < namefin.length; i++)
        {
            for(int j=i+1;j < namefin.length; j++)
            {
                if (namefin[i].compareTo(namefin[j]) > 0 )
                {
                    temp = namefin[i];
                    namefin[i]=namefin[j];
                    namefin[j]=temp;
                }
            }
        }
        for (int i=namefin.length-1;i>=0;i--)
        {
        System.out.println(namefin[i]);
    }
    }
}        