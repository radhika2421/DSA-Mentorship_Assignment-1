import java.util.Scanner;
public class naturalnumbers
{
    public static void main(String[] arg)
    {
        try (Scanner scn=new Scanner(System.in))
        {
            System.out.println("enter a number");
            int n=scn.nextInt();
            for (int i=1;i<=n;i++)
            {
                System.out.println(i);
            }
        }
    }
}
