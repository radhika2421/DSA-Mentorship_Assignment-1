import java.util.Scanner;
public class countingdigits
{
    public static void main(String[]args)
    {
        try (Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter a number");
            int n=scn.nextInt();
            int digits=0;
            while (n!=0)
            {
                n/=10;
                digits++;
            }
            System.out.println(digits);
        }
    }
}
