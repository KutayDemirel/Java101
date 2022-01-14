import java.util.Scanner;

public class DivisibleBy3And4 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number  :");
        num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 || i % 4 == 0)
                System.out.println(i);
        }
    }
}
