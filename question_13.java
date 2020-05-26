import java.util.*;

public class question_13
{
    public static void main(String args[])
    {
        Scanner gradyear = new Scanner(System.in);
        System.out.println("Enter the graduation year: ");
        int grady = gradyear.nextInt();
        int gradArray[]={1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};
        int first=0;
        int last=9;
        int middle = (first + last)/2;  
        while( first <= last )
       {  
           
           if ( gradArray[middle] < grady )
           {  
                first = middle + 1;     
            }
            else if ( gradArray[middle] == grady )
                {  
                    System.out.println("Record exists!");  
                    break;  
                }
                else
                {  
                    last = middle - 1;  
                }  
           middle = (first + last)/2;  
        }  
        if ( first > last )
        {  
            System.out.println("Record does not exist!");  
        }  
        
    }      
       
          
    }
