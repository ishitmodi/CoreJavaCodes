import java.util.Scanner;

class Addition
{
    public static void main(String args[])
    {
        int x,y,z;
        
        System.out.println("Enter two integers to find there sum");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = x+y;
        System.out.println("Sumation ="+z);
    }
}