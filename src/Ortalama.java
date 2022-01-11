import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args){
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik değerini giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz");
        muzik = input.nextInt();

        int toplam;
        double ort;
        toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        ort = toplam /6.0;
        System.out.println("Derslerin ortalaması :   "+ort);

        String result = (ort>=60) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(result);

    }
}