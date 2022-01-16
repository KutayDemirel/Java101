import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num,total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter a number  :");
        num = input.nextInt();

        for (int i = 1; i < num; i++){
            if(num % i == 0)
                total += i;
        }
        if ( total == num)
            System.out.print(num + " is perfect number ");
        else
            System.out.print(num + " is not perfect number");
    }
}
