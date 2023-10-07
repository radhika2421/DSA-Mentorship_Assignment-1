import java.util.Scanner;
public class Q8rotatenumber
{
    public static void main(String[]args)
    {
        try (Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter a number");
            int n=scn.nextInt();
            int k=scn.nextInt();
            int d=0;
            int n1=n;
            while (n!=0)
            {
                n/=10;
                d++;
            }
            int p=d-1;
            int rotate=0;
            for(int a=1;a<=k;a++)
            {
                int rem=n1%10;
                n1/=10;
                rotate=(int) ((rem*Math.pow(10,p))+n1);
                n1=rotate;
            }
            System.out.println(n1);
        }
    }
}
