public class question_1
{
    public static void main(String args[])
    {
        int k, i = 0;
        for(int j=1; j<=4; j++)
        {
            k=j;
            while (k>0)
            {
                i++;
                System.out.print(i + " ");
                k--;
            }
            System.out.print("\n");
        }
    }
}