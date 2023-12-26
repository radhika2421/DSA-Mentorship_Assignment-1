import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter no. of rows");
            int row = scn.nextInt();
            for (int i = row; i >0; i--)
            {
                for (int j = 0; j<i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
