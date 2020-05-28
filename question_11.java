import java.util.Scanner;
public class question_11
{
    public static void main(String args[])
    {
        
        Scanner studata = new Scanner(System.in);
        Scanner stuname = new Scanner(System.in);
        
        System.out.println("Enter the Number of Students: ");
        int stunum = studata.nextInt();
        
        int[] rolln = new int[stunum];
        String[] names = new String[stunum];
        int[] marks1= new int[stunum];
        int[] marks2 = new int[stunum];
        int[] marks3 = new int[stunum];
       
      
        for (int i=0; i<stunum ; i++)
        {
          System.out.println("Enter the Student Roll Number: ");
          rolln[i]=studata.nextInt();
          
          System.out.println("Enter the Student Name: ");
          names[i]=stuname.nextLine();
          
          System.out.println("Enter the marks for Subject 1: ");
          marks1[i]=studata.nextInt();
          
          System.out.println("Enter the marks for Subject 2: ");
          marks2[i]=studata.nextInt();
          
          System.out.println("Enter the marks for Subject 3: ");
          marks3[i]=studata.nextInt();  
        }
        int avg=0;
        String remark="";
        
        for (int i=0; i<stunum ; i++)
        {
          
          System.out.println("The Student Name : " + names[i]);
         
          avg = (marks1[i]+marks2[i]+marks3[i])/3;
          
          System.out.println("Average Marks : " + avg);
          
          if (avg>=85 && avg<=100) remark="EXCELLENT";
          if (avg>=75 && avg<=84) remark="DISTINCTION";
          if (avg>=60 && avg<=74) remark="FIRST CLASS";
          if (avg>=40 && avg<=59) remark="PASS";
          if (avg>=0 && avg<=40) remark="POOR";
          
          System.out.println("REMARK : " + remark);
      
        }
        
        
    }
}