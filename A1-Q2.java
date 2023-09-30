import java.util.Scanner;
public class Gradingsys
{
    public static void main(String[] args)
    {
        System.out.println("Enter your marks");
        try (Scanner scn = new Scanner (System .in))
        {
            int marks=scn.nextInt();
            if(marks>90)
            {
                System.out.println("Excellent!!");
            }
            else if(marks>80 && marks<=90)
            {
                System.out.println("Good");
            }
            else if(marks>70 && marks<=80)
            {
                System.out.println("Fair");
            }
            else if(marks>60 && marks<=70)
            {
                System.out.println("Meets expectations");
            }
            else if(marks<60)
            {
                System.out.println("Below par");
            }
        }
    }
}
