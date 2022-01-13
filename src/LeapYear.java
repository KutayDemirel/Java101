import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year, result;
        boolean leap = false;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please, enter a year  :");
        year = inp.nextInt();

        if (year % 4 == 0 && year % 100 != 0)
            leap = true;
        else if (year % 400 == 0)
            leap = true;

        if (leap)
            System.out.println(year + " is a leap year ");
        else
            System.out.println(year + " is not a leap year");
    }
}
