import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int numb1, numb2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the first value  :");
        numb1 = input.nextInt();
        System.out.print("Please, enter the second value   :");
        numb2 = input.nextInt();

        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Please, select the operator  ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("The result of the equation is " + (numb1 + numb2));
                break;
            case 2:
                System.out.println("The result of the equation is " + (numb1 - numb2));
                break;
            case 3:
                System.out.println("The result of the equation is " + (numb1 * numb2));
                break;
            case 4:
                System.out.println("The result of the equation is " + ((double) numb1 / numb2));
                break;
            default:
                System.out.println("You have entered invalid operation number");

        }

    }
}