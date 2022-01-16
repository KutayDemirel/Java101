import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        int num1, num2;
        int gcd = 1, i = 1;
        int lcm;
        Scanner input = new Scanner(System.in);

        System.out.println("PLease, enter first number");
        num1 = input.nextInt();
        System.out.println("PLease, enter second number");
        num2 = input.nextInt();

        if ( num1 > num2 ) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while (i <= num1) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
            i++;
        }
        lcm = (num1 * num2) / gcd;

        System.out.println("Gcd is " + gcd);
        System.out.println("Lcm is " + lcm);
    }
}
