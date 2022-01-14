import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int num, subset, fact3 = 1, fact1 = 1, fact2 = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for population  :");
        num = input.nextInt();
        System.out.print("Enter a value for subset  :");
        subset = input.nextInt();

        if (num >= subset) {
            for (int i = 1; i <= num; i++) {
                fact1 *= i;
            }
            for (int i = 1; i <= subset; i++) {
                fact2 *= i;
            }
            for (int i = 1; i <= num - subset; i++) {
                fact3 *= i;
            }
            float equation = (float) fact1 / (fact2 * fact3);
            System.out.println("Combination is " + equation);

        } else
            System.out.println("You have entered invalid values");
    }


}