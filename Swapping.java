import java.util.Scanner;
class Swapping
{
    public static void main(String args[])
    {
        int x,y,temp;
        System.out.println("Enter two values to swap");
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        System.out.println("Before Swapping\nX = "+x+"\nY ="+y);
        
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("After Swapping\nX = "+x+"\nY ="+y);
    }
}