import java.util.Scanner;

public class ReversedTriAngle {
    public static void main(String[] args) {
        int digit;
        Scanner input = new Scanner(System.in);

        digit = input.nextInt();

        for (int i = 1; i <= digit; i++) {
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            for (int k = digit*2; (2*i)-1 < k; k--)
                System.out.print("*");
            System.out.println();
        }
    }
}
