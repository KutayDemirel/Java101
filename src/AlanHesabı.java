import java.util.Scanner;


public class AlanHesabı {
    public static void main(String[] args) {
        int a,b,c;
        double u;
        double alan;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk dik kenarı uzunluğunu giriniz   :");
        a = input.nextInt();
        System.out.print("İkinci dik kenarı uzunluğunu giriniz   :");
        b = input.nextInt();

        u = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs  :"+u);


        System.out.print("İlk kenar uzunluğunu giriniz   :");
        a = input.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz   :");
        b = input.nextInt();
        System.out.print("Üçüncü kenar uzunluğunu giriniz   :");
        c = input.nextInt();

        u = (double)(a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(alan);
    }

}

