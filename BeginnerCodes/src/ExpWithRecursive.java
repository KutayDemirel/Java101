import java.util.Scanner;

public class ExpWithRecursive {

    static int power(int a, int b) {
        if (a == 1)
            return b;
        return power(a - 1, b) * b;
    }

    public static void main(String[] args) {
        int base, exponential;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a base number  :");
        base = input.nextInt();
        System.out.print("Please enter a exponential number  :");
        exponential = input.nextInt();

        System.out.println(base + "^" + exponential + " = " + power(exponential, base));
        input.close();
    }
}
