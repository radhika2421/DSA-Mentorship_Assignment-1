import java.util.Scanner;
public class Q6inverseofnumber
{
    public static void main(String[]args)
    {
        try (Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter a number and if there are n digits in it then it must contain all natural numbers till n without repetition");
            int n=scn.nextInt();
            double inverse=0;
            int d=0;
            int rem;
            while(n!=0)
            {
                rem=n%10;
                int b=rem-1;
                d++;
                inverse=inverse+(d*Math.pow(10,b));
                n/=10;
            }
            System.out.println(inverse);
        }
    }
}
