import java.util.Scanner;

public class ExpWithLoop {
    public static void main(String[] args) {
        int num, exp, result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number  :");
        num = input.nextInt();
        System.out.print("Please enter a power number  :");
        exp = input.nextInt();

        for (int i = 1; i <= exp; i++) {
            result *=num;
        }
        System.out.println(result);
    }
}
