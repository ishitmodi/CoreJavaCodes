import java.util.Scanner;

class FindLargestFromThree
{
    public static void main(String args[])
    {
        int x,y,z;
        System.out.println("Enter three integers");
        Scanner sc = new Scanner(System.in);
        
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        
        if(x>y && x>z)
        {
            System.out.println("First element is largest that is:"+x);
        }
        else if(y>x && y>z)
        {
            System.out.println("Second element is largest that is:"+y);
        }
        else if(z>x && z>y)
        {
            System.out.println("Third element is largest that is:"+z);
        }
        else
        {
            System.out.println("Entered numbers are not distinct.");
        }
    }
}