import java.util.Scanner;

public class Sorting3Number {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number   :");
        a = input.nextInt();
        System.out.print("Enter Second Number   :");
        b = input.nextInt();
        System.out.print("Enter Third Number   :");
        c = input.nextInt();

        if (a < b && a < c) {
            if (b < c)
                System.out.println("a < b < c");
            else
                System.out.println("a < c < b");
        } else if (b < c && b < a) {
            if (c < a)
                System.out.println("b < c < a");
            else
                System.out.println("b < c < a");
        } else {
            if (b < a)
                System.out.println("c < b < a");
            else
                System.out.println("c < a < b");
        }

    }
}
