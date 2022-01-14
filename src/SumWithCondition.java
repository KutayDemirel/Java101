import java.util.Scanner;

public class SumWithCondition {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        while (num % 2 == 0 ) {
            System.out.print("Please enter a number  :");
            num = input.nextInt();
            if(num % 4 == 0 )
                sum += num;
        }
        System.out.println("Summation of the multiples of four of entered numbers is \"" + sum + "\"");
    }
}


