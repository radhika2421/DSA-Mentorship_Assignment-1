import java.util.Scanner;
public class Q9GCDandLCM
{
    public static void main(String[]args)
    {
        try (Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter two numbers");
            int n1=scn.nextInt();
            int n2=scn.nextInt();
            int a=n1;
            int b=n2;
            while(n1%n2!=0)
            {
                int rem=n1%n2;
                n1=rem;
                n2=n1;
            }
            int gcd=n1;
            int lcm=(a*b)/gcd;
            System.out.println(gcd+" is the GCD of "+a+" and "+b);
            System.out.println(lcm+" is the LCM of "+a+" and "+b);
        }
    }
}
