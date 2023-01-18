import java.util.Scanner;

public class Calculator
{
    public static int Sum(int a, int b)
    {
        int c= a+b;
        System.out.println("\n  Addition of two number is =  " + c);
        return c;
    }

    public static int subtract(int a, int b)
    {
        int c= a-b;
        System.out.println("\n  subtraction  of two number is =  " + c);
        return c;
    }
    public static int multiply(int a, int b)
    {
        int c= a*b;
        System.out.println("\n Multiplication  of two number is =  " + c);
        return c;
    }
    public static int division(int a,int b) throws IllegalAccessException {
        if (b==0){
            throw new IllegalAccessException("Num cannot be divided by Zero");
        }
        int c= a/b;
        System.out.println("\n  division  of two number is =   " + c);
        return c;
    }
    public static void main(String[] args) throws IllegalAccessException {

        Scanner obj = new Scanner(System.in);

        int no1, no2;
        System.out.println("Enter a first integer no:");
        no1= obj.nextInt();
        System.out.println("Enter a second integer no:");
        no2=obj.nextInt();
        Sum(no1,no2);
        subtract(no1,no2);
        multiply(no1,no2);
        division( no1, no2);

    }
}