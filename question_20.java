import java.util.Scanner;
public class question_20
{
    public static void main (String args[])
    {
        int arr [][] = new int[3][3];
        Scanner scannum = new Scanner(System.in);
        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <=2; j++)
            {
                System.out.println("Enter a number: ");
                arr[i][j] = scannum.nextInt();
            }
        }
        int max = arr[0][0], min = arr[0][0];
        for(int i = 0; i <= 2; i++)
        {
            for(int j = 0; j <=2; j++)
            {
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                }
                else if (arr[i][j] < min)
                {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Max number is " + max + " and min number is " + min);
    }
}