import java.util.Scanner;
public class Primenumber
{
    public static void main(String[] args)
    {
        try (Scanner scn=new Scanner(System.in))
        {
            System.out.println("Enter a number");
            int t=scn.nextInt();
            for(int a=0;a<t;a++)
            {
                int n=scn.nextInt();
                int times=0;
                for (int d=1;d<= n;d++)
                {
                    if(n%d==0)
                    {
                        times++;
                    }
                }
                if (times==2)
                {
                    System.out.println("Prime");
                }
                else
                {
                    System.out.println("Not prime");
                }
            }
        }
    }
}
