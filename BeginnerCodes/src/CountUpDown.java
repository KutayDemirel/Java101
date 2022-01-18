import java.sql.SQLOutput;
import java.util.Scanner;

public class CountUpDown {
    static int sort(int a,int temp, boolean isReturned) {
        if (a > 0 && !isReturned) {
            System.out.print(a + " ");
            return sort(a - 5, temp, isReturned);
        } else if (a <= 0 || isReturned && a <= temp) {
            isReturned = true;
            System.out.print(a + " ");
            return sort(a + 5, temp, isReturned);
        }
        return 0;
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number  :");
        num = input.nextInt();
        sort(num,num,false);

    }
}
