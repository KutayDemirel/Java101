import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        int banana,apple,tom,pear,eggp ;
        float price;
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the kg of Pears   :");
        pear = input.nextInt();
        System.out.print("Please, Enter the kg of Apples   :");
        apple = input.nextInt();
        System.out.print("Please, Enter the kg of Tomatoes   :");
        tom = input.nextInt();
        System.out.print("Please, Enter the kg of Bananas   :");
        banana = input.nextInt();
        System.out.print("Please, Enter the kg of Eggplants   :");
        eggp = input.nextInt();

        price = (float) (pear * 2.14 + apple * 3.67 + tom * 1.11 + banana * 0.95 + eggp * 5.00);

        System.out.println("Total Price is " + price + "TL");

    }

}
