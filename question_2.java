
public class question_2
{
    public static void main(String args[])
    {
        Employee emp = new Employee();
        emp.name = "Rohan";
        emp.bsalary = 100000;
        float fin;
        fin = emp.sal_method();
        System.out.println(emp.name + " " + fin);
    }
}
class Employee
{
    String name;
    float bsalary;
    
    float sal_method()
    {
        float salfinal = bsalary * 150 / 100;
        return salfinal;
    }
}