import java.util.Scanner;
class SwapWithoutTemp
{
    public static void main(String args[])
    {
        int x,y;
        System.out.println("Enter two values to swap");
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        System.out.println("Before Swapping\nX = "+x+"\nY ="+y);
        
        x = x+y;
        y = x-y;
        x = x-y;
        
        System.out.println("After Swapping\nX = "+x+"\nY ="+y);
    }
}