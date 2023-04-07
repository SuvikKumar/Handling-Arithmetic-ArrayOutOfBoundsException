package exceptionhandlingarrayarithmetic;
public class exceptionhandlingarrayarithmetic {
public static void main(String args[])
{
int a[]={5,10};
int b=5;
try
{
int x=a[1]/(b-a[0]);
}
catch(ArithmeticException e)
{
System.out.println("Divide by 0 error !!!");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index error !!!");
}
finally
{
int y=a[1]/a[0];
System.out.println("Handling the exception...");
System.out.println("Y :"+y);
}
}
}
