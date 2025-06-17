import java.util.Scanner;

class IfElse
{
    public static void main(String args[])
    {
        int marksObtained, passingMarks;
        
        passingMarks = 30;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input marks scored by you!");
        
        marksObtained = sc.nextInt();
        
        if(marksObtained>=passingMarks)
        {
            System.out.println("Congratulation, You passed the exam.");
        }
        else
        {
            System.out.println("Better luck next time!");
        }
    }
}