import java.util.Scanner;

public class MaxMin2 {
    public static void main(String[] args) {
        int num, temp, min=0, max =0, total;
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter  :");
        total = input.nextInt();
        if (total >= 2) {
            for (int i = 1; i <= total; i++) {
                System.out.print(i + ". number is  :");
                num = input.nextInt();
                if (i == 1) {
                    max = num;
                    min = num;
                } else {
                    if (num >= max)
                        max = num;
                    if (num <= min)
                        min = num;
                }
            }
            System.out.println("Min number is " + min);
            System.out.println("Max number is " + max);
        } else
            System.out.println("You have enter insufficient number");
    }
}
