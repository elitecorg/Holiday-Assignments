//the primitive types and their corresponding object wrapper classes. For example. If the conversion goes the other way, this is called unboxing.
public class question_15
{
    public static void main(String args[])
    {
        Character ch = 'a'; // is an example of autoboxing
        
        Integer i = new Integer(-8);//Unboxing where wrapper class is converted into its primitive type
        int absVal = Math.abs(i);
        System.out.println("absolute value of " + i + " = " + absVal);
    }
}