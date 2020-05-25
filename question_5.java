import java.util.Scanner;

public class question_5
{
    public static void main(String args[])
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Choose pattern type - 1 or 2: ");
        int choose = scan1.nextInt();
        switch(choose)
        {
            case 1:
                System.out.println("Enter how many rows needed: ");
                int n1 = scan1.nextInt();
                for(int j = 1;j <= n1;j++)
                {
                    int k = 1;
                    while (k <= j)
                    {
                       System.out.print(k + " ");
                       k++;
                    }
                    System.out.print("\n");
                }
            case 2:
                System.out.println("Enter how many rows needed: ");
                int n2 = scan1.nextInt();
                for(int j = 1; j <= n2; j++)
                {
                    for(int k = 1; k <= (n2 - j + 1); j++)
                    {
                        System.out.print((char)(k + 96));
                    }
                    System.out.print("\n");
                }
            }
        }
    }