import java.util.Scanner;

public class PrimeNumberWithRecursive {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number  :");
        num = input.nextInt();

        if (num == 1)
            System.out.println("1 is not prime number");
        else if (num == 2)
            System.out.println("2 is prime number");
        else
            if (primeNumber(num,num) == num)
                System.out.println(num + " is prime number");
            else
                System.out.println(num + " is not prime number");
    }

    static int primeNumber(int num, int temp) {
        if (num > 2) {
            if (temp % (num - 1) == 0)
                return num;
            return primeNumber(num - 1, temp);
        } else {
            return temp;
        }
    }
}
