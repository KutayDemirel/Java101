import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isFault = false;

        while (right < 5) {
            System.out.println("PLease , guess the number  :");
            selected = input.nextInt();
            if (selected == number) {
                isWin = true;
                System.out.println("Congratulations!, you have won the game");
                break;
            } else if (selected < 0 || selected > 99) {
                System.out.println("You should enter a value between 0 and 100");
                System.out.println("If you enter one more irrelevant number, you life will be decreased");
                if (isFault) {
                    right++;
                    System.out.println("Your remaining life is " + (5 - right));
                }
                isFault = true;
                continue;
            } else {
                if (selected < number)
                    System.out.println("Wrong guess!, your pick must be higher");
                else
                    System.out.println("Wrong guess!, your pick must be lower");
            }
            wrong[right] = selected;
            System.out.println("Your remaining life is " + (5 - ++right));
        }

        if (!isWin) {
            System.out.println("=================");
            System.out.println("You have lost the game");
            System.out.println("The number was " + number);
            if (!isFault)
                System.out.println(Arrays.toString(wrong));
        }

    }
}
