import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter a number  :");
        num = input.nextInt();

        if (isPalindromic(num))
            System.out.println(num + " is Palindromic Number");
        else
            System.out.println(num + " is not Palindromic Number");
    }

    static boolean isPalindromic(int a) {
        int temp, digit, reversedNumber = 0;
        temp = a;
        while (temp != 0) {
            digit = temp % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            temp = temp / 10;
        }
        return (reversedNumber == a) ? true : false;
    }
}
