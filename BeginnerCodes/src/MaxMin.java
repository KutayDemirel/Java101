import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int num1, num2, num3, min = 0, max = 0, total;
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter  :");
        total = input.nextInt();
        if (total >= 2) {
            System.out.print("1. number is  :");
            num1 = input.nextInt();
            System.out.print("2. number is  :");
            num2 = input.nextInt();

            if (num1 > num2)
                max = num1;
            else
                max = num2;
            if (num1 < num2)
                min = num1;
            else
                min = num2;
            if (total == 2) {
                System.out.println("Min number is " + min);
                System.out.println("Max number is " + max);
            }else {
                for (int i = 3; i <= total; i++) {
                    System.out.print(i + ". number is  :");
                    num3 = input.nextInt();
                    if (num3 > max)
                        max = num3;
                    if (num3 < min)
                        min = num3;
                }
                System.out.println("Min number is " + min);
                System.out.println("Max number is " + max);
            }
        }else
            System.out.println("You have enter insufficient number");
    }
}
