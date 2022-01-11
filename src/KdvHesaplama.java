import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tutar;
        double kdv;
        System.out.print("Kdv\'siz tutarı giriniz   :");
        tutar = input.nextInt();

        kdv = (tutar>0 && tutar<1000) ?  (tutar * 0.18) : (tutar * 0.08);
        System.out.print("\nKdv tutarı   :" + kdv + "\nKdv\'li fiyat   :" + (kdv + tutar));
    }
}




