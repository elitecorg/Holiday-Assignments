import java.util.Scanner;
public class question_9
{
    public static void main(String args[])
    {
        Scanner objtbu = new Scanner(System.in);
        int k,res=0;
        for(int i=1;i<=10;i++)
        {
            k = i * 2;
            if ((k/2)%2==1)
            {
                res+=k;
            }
            else
            {
                res-=k;
            }
        }
        System.out.println(res);
        System.out.print("\n");
        System.out.println("Enter the desired number: ");
        int x = objtbu.nextInt();
        int sol = 0;
        for(int a = 2; a<=20; a+=3)
        {
            sol += (x/a);
        }
        System.out.println("The answer is "+sol);
    }
}