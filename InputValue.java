import java.util.Scanner;
class InputValue
{
    public static void main(String args[])
    {
        int a;
        float b;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        s = sc.nextLine();
        System.out.println("String Entered = "+s);
        
        System.out.println("Enter an integer");
        a = sc.nextInt();
        System.out.println("Integer Entered = "+a);
        
        System.out.println("Enter a Float Value");
        b = sc.nextFloat();
        System.out.println("Float Value Entered = "+b);
    }
}