import java.util.*;

public class question_7
{
    public static void main(String args[])
    {
        Scanner strmarks = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("Enter the Student Name: ");
        stu.name = strmarks.nextLine();
        System.out.println("Enter the Student Roll Number: ");
        stu.rollnum = strmarks.nextInt();
        for (int i=0; i<5 ; i++)
        {
          System.out.println("Enter the marks for"+ " subject "+(i+1)+": ");
          stu.marks[i]=strmarks.nextInt();
        }
        
        String stream = stu.stream_method();
        System.out.println("Stream alloted : " + stream);
    }
}

class Student
{
    String name;
    int rollnum;
    int [] marks = new int[5];
  
    
    String stream_method()
    {
        float per;
        String str="";
        per=(marks[0] + marks[1] + marks[2] + marks[3] + marks[4])/5;
        if (per >= 90) str = "Science with Computers";
        if (per <= 89 && per>=80) str ="Science without Computers";
        if (per <= 79 && per>=70) str= "Commerce with Maths";
        if (per <= 69 && per>=60) str = "Commerce without Maths";
        return str;
        
    }
}