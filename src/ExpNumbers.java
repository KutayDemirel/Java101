import java.util.Scanner;

public class ExpNumbers {
    public static void main(String[] args) {
    int num ;
    Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number  :");
        num = input.nextInt();

        System.out.println("Multiples of four and five\n-----------------");
        for(int i = 1, k = 1; i<=num || k <=num; i *= 4,k *=5) {
            if(i != 1)
                System.out.println(i);
            System.out.println(k);
        }
    }
}

