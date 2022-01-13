import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        int age, type;
        double km, fee;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance as a km  :");
        km = input.nextInt();
        System.out.print("Please enter your age  :");
        age = input.nextInt();
        System.out.print("Please enter the type of flight (One Way -> 1 , Round Trip -> 2):");
        type = input.nextInt();

        if (km <= 0 || age <= 0)
            System.out.println("\nYou have entered wrong value");
        else if (type <= 0 || type > 2)
            System.out.println("\nYou have entered wrong value");
        else {
            fee = km / 10;

            if (age < 12) {
                fee = fee / 2;
            } else if (age < 24) {
                fee = fee * 0.9;
            } else if (age > 65) {
                fee = fee * 0.7;
            }

            if (type == 2) {
                    fee = (fee * 0.8) * 2;
            }
            System.out.println("\nTotal fee is " + fee + "TL");
        }
    }
}
