import java.util.Scanner;
public class numberreverse
{
    public static void main(String[]args)
    {
        try (Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter a number");
            int n=scn.nextInt();
            int reverse=0;
            int rem;
            while (n!=0)
            {
                rem=n%10;
                reverse=reverse*10+rem;
                n=n/10;
            }
            System.out.print("The reversed number is="+reverse);
        }
    }
}
