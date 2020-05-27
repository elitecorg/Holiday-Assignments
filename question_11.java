import java.util.Scanner;
public class question_11
{
    public static void main(String args[])
    {
        Scanner choice = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Smith number: ");
        int num = choice.nextInt();
        int d1 = num;
        int k1 = 0, res1 = 0;
        while (d1 != 0)
        {
            k1 = d1 % 10;
            d1 = d1 / 10;
            res1 += k1;
        }
        int d2 = num;
        int k2 = 0, res2 = 0;
        
    }
}