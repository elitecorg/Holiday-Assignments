import java.util.Random;
public class question_3
{
    public static void main(String args[])
    {
        Random rand = new Random();
        int rnumcheck[];
        rnumcheck = new int[20];
        int upperbound = 101;
        for(int i = 0; i <= 19; i++)
        {
            rnumcheck[i] = rand.nextInt(upperbound);// Here random integer is calculated from 0 to 101 - 1 = 100
            for(int j=0;j<i;j++)
            {
                if (rnumcheck[i] == rnumcheck[j])
                {
                    i--;
                    break;
                }
            }       
        }
        for(int k = 0; k < rnumcheck.length; k++)
        {
            System.out.println("This is "+(k+1)+" random number:"+rnumcheck[k]);
        }
    }
}