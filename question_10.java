
public class question_10
{
    public static void main(String args[])
    {
                for(int i = 1;i <= 5;i++)
                {
                    System.out.print(i + " ");
                    for(int j = 1; j <= i; j++)
                    {
                        if (j % 2 == 0)
                        {
                            System.out.print("# ");
                        }
                        else
                        {
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                for(int a = 5;a >= 1;a--)
                {
                    for(int b = 5, c = 1; c <= a; c++, b--)
                    {
                        System.out.print(b + " ");
                    }
                    System.out.print("\n");
                }
            }
        }