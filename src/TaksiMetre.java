import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args){
        int km;
        double value;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter KM value   :");
        km = input.nextInt();
        value = (km * 2.20) + 10;
        System.out.println((value <= 20) ? "Your fee is 20 TL" : "Your fee is " + value + " TL"  );
    }
}
