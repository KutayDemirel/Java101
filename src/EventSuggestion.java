import java.util.Scanner;

public class EventSuggestion {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature value");
        heat = input.nextInt();

        if (heat < 5)
            System.out.println("Our suggestion is Ski");
        else if (heat < 15)
            System.out.println("Our suggestion is Cinema");
        if (heat >= 10 && heat < 25)
            System.out.println("Our suggestion is Picnic");
        else if (heat >= 25)
            System.out.println("Our suggestion is Swimming");
    }
}
