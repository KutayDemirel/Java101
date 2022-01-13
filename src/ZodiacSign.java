import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay   :");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün   :");
        day = input.nextInt();

        if (month == 1 && day<=31 && day > 0 ) {
            if (day <= 21) {
                System.out.print("Oğlak burcusunuz");
            } else {
                System.out.print("Kova burcusunuz");
            }
        }
        else if ( month == 2 && day<=29 && day > 0 ) {
            if (day <= 19)
                System.out.print("Kova burcusunuz");
            else
                System.out.print("Balık burcusunuz");
        }
        else if ( month == 3 && day<=31 && day > 0 ) {
            if (day <= 20) {
                System.out.print("Balık burcusunuz");
            }
            else
                System.out.print("Koç burcusunuz");
        }
        else if ( month == 4 && day<=30 && day > 0 ) {
            if (day <= 21) {
                System.out.print("Koç burcusunuz");
            }
            else
                System.out.print("Boğa burcusunuz");
        }
        else if ( month == 5 && day<=31 && day > 0  ) {
            if (day <= 21) {
                System.out.print("Boğa burcusunuz");
            }
            else
                System.out.print("İkizler burcusunuz");
        }
        else if ( month == 6 && day<=30 && day > 0 ) {
            if (day <= 22) {
                System.out.print("İkizler burcusunuz");
            }
            else
                System.out.print("Yengeç burcusunuz");
        }
        else if ( month == 7 && day<=31 && day > 0 ) {
            if (day <= 22) {
                System.out.print("Yengeç burcusunuz");
            }
            else
                System.out.print("Aslan burcusunuz");
        }
        else if ( month == 8 && day<=31 && day > 0 ) {
            if (day <= 22) {
                System.out.print("Aslan burcusunuz");
            }
            else
                System.out.print("Başak burcusunuz");
        }
        else if ( month == 9 && day<=30 && day > 0 ) {
            if (day <= 22)
                System.out.print("Başak burcusunuz");
            else
                System.out.print("Terazi burcusunuz");
        }
        else if ( month == 10 && day<=31 && day > 0 ) {
            if (day <= 22)
                System.out.print("Terazi burcusunuz");
            else
                System.out.print("Akrep burcusunuz");
        }
        else if ( month == 11 && day<=30 && day > 0 ) {
            if (day <= 21)
                System.out.print("Akrep burcusunuz");
            else
                System.out.print("Yay burcusunuz");
        }
        else if ( month == 12 && day<=31 && day > 0 ) {
            if (day <= 21)
                System.out.print("Yay burcusunuz");
            else
                System.out.print("Oğlak burcusunuz");
        }
        else
            System.out.println("Yanlış sayı girdiniz");

    }
}
