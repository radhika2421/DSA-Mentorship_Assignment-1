import java.util.Scanner;

public class Q10primefactors {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = scn.nextInt();
            for (int a = 2; a <= n;a++)
            {
                while (n % a == 0)
                {
                    n /= a;
                    System.out.print(a + "*");
                }
            }
            if (n==1)
            {
                System.out.println(n);
            }
        }
    }
}
