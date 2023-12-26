import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) 
        {
            System.out.println("Enter a number");
            int row = scn.nextInt();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
