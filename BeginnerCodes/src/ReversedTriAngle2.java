import java.util.Scanner;

public class ReversedTriAngle2 {
    public static void main(String[] args) {
        int digit;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number  :");
        digit = input.nextInt();

        for (int i = digit; i > 0; i--) {
            for (int j = digit; j > i ; j--)
                System.out.print(" ");
            for (int k = 0; k < (2*i)-1 ; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
