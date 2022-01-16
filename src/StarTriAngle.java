import java.util.Scanner;

public class StarTriAngle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Please enter a number  :");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i) - 1; k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = num - 1; i > 0; i--) {
            for (int j = num; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2 * (i - 1)) + 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}