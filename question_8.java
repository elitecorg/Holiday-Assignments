import java.util.*;

public class question_8
{
    public static void main(String args[])
    {
        Scanner str = new Scanner(System.in);
        disp_fucntoverload funct = new disp_fucntoverload();
        
        System.out.println("Enter the word: ");
        String word = str.nextLine();
        
        System.out.println("Enter the character: ");
        char ch = str.next().charAt(0);
       
        funct.check(word,ch);
        funct.check(ch,word);
    }
}

class disp_fucntoverload
{
    void check(String st,char c)
    {
        int count=0;
        char[] fstr = new char[st.length()];
        
        for (int i = 0; i < st.length(); i++) 
        { 
           fstr[i] = st.charAt(i);
           if (fstr[i] == c) count++;
           
        }
        
        System.out.println("Number of " + c + " present is = " + count);
        
    }
    void check(char c,String st)
    {
        int count=0;
        char[] fstr = new char[st.length()];
       
        for (int i = 0; i < st.length(); i++) 
        { 
           fstr[i] = st.charAt(i);
           if (fstr[i] == c) count++;
           
        }
        
        System.out.println("Number of " + c + " present is = " + count);
        
    }
}