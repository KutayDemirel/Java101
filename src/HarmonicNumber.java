import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int num;
        float result = 0f ;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number  :");
        num = input.nextInt();

        for (int i = 1; i <= num;i++){
            result += (1.0f / i);
        }
        System.out.println(result);
    }
}
