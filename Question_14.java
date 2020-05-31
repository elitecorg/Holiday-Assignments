import java.util.Scanner;
public class Question_14
{
    public static void main(String args[])
    {
       String [] city = new String[5];
       double [] temp = new double[5];
       Scanner scan1 = new Scanner(System.in);
       Scanner scan2 = new Scanner(System.in);
       for(int i = 0; i < 5; i++)
       {
           System.out.println("Enter city name(" + (i + 1) + "):");
           city[i] = scan1.nextLine();
           
           System.out.println("Enter temperature(" + (i + 1) + "):");
           temp[i] = scan2.nextDouble();
       }
       
       String temp1 = "";
       double temp2 = 0;
       for (int i = 0; i < 5; i++)
       {
           for(int j = i + 1; j < 5; j++)
           {
               if (temp[i] > temp[j])
               {
                   temp2 = temp[i];
                   temp[i] = temp[j];
                   temp[j] = temp2;
                   temp1 = city[i];
                   city[i] = city[j];
                   city[j] = temp1;
               }
           }
       }
       
       for(int i = 0; i < 5; i++)
       {
           System.out.println((i + 1) + ". " + city[i] + " with temperature " + temp[i]);
       }
    }
}