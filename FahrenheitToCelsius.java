import java.util.*;
public class FahrenheitToCelsius
{
    public static void main(String args[])
    {
        float temp;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter temperature in Fahrenhit");
        temp = sc.nextFloat();
        
        temp = ((temp - 32)*5)/9;
        
        System.out.println("Temperature in celsius = "+temp);
    }
}