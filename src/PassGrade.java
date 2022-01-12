import java.util.Scanner;

public class PassGrade {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, total = 0;
        float mean;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Maths score");
        mat = input.nextInt();
        if (mat > 0 && mat <= 100)
            total++;
        else {
            mat = 0;
            System.out.println("You have entered invalid maths grade");
            }
        System.out.print("Enter physics score");
        fizik = input.nextInt();
        if (fizik > 0 && fizik <= 100)
            total++;
        else {
            fizik = 0;
            System.out.println("You have entered invalid physics grade");
            }
        System.out.print("Enter turkish score");
        turkce = input.nextInt();
        if (turkce > 0 && turkce <= 100)
            total++;
        else {
            turkce = 0;
            System.out.println("You have entered invalid turkish grade");
        }
        System.out.print("Enter chemistry score");
        kimya = input.nextInt();
        if (kimya > 0 && kimya <= 100)
            total++;
        else {
            kimya = 0;
            System.out.println("You have entered invalid chemistry grade");
        }
        System.out.print("Enter music score");
        muzik = input.nextInt();
        if (muzik > 0 && muzik <= 100)
            total++;
        else {
            muzik = 0;
            System.out.println("You have entered invalid music grade");
        }

        mean = (float) (mat + fizik + turkce + kimya + muzik) / total;
        System.out.println("Your grade's mean is " + mean);

        if (mean <= 55)
            System.out.println("Grade repetition");
        else
            System.out.println("Grade Pass");

    }
}

