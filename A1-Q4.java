import java.util.Scanner;
public class Q4primestilln
    {
        public static void main(String[]args)
        {
            try (Scanner scn=new Scanner(System.in))
            {
                System.out.println("Enter a number");
                int n=scn.nextInt();
                for(int a=1;a<=n;a++)
                {
                    int times=0;
                    for (int d=1;d<=a;d++)
                    {
                        if(a%d==0)
                        {
                            times++;
                        }
                    }
                        if(times==2)
                        {
                            System.out.println(a);
                        }
                }
            }
        }
    }

