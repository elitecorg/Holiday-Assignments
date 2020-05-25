import java.util.Scanner;
public class question_4
{
    public static void main(String args[])
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter type of bank deposit: ");
        String type = scan1.nextLine();
        switch(type)
        {
            case "Term Deposit":
                System.out.println("Enter principal: ");
                double P1 = scan1.nextDouble();
                System.out.println("Enter rate: ");
                double r1 = scan1.nextDouble();
                System.out.println("Enter time period in years: ");
                double n1 = scan1.nextDouble();
                double A1 = P1 * Math.pow((1 + (r1 / 100)), n1);
                System.out.println("The maturity value is " + A1);
                break;
            case "Recurring Deposit":
                System.out.println("Enter monthly installment: ");
                double P2 = scan1.nextDouble();
                System.out.println("Enter rate: ");
                double r2 = scan1.nextDouble();
                System.out.println("Enter time period in months: ");
                double n2 = scan1.nextDouble();
                double A2 = (P2 * n2) + (P2 * ((n2 * (n2 + 1)) / 2) * (r2 / 100) * (1 / 12));
                System.out.println("The maturity value is " + A2);
                break;
            default:
                System.out.println("Invalid request!!!");
            }
        }
    }