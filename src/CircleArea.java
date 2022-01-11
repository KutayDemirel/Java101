import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        int r;
        double area,circ,pi = 3.14;
        int angle;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle   :");
        r = input.nextInt();

        area = pi * r * r;
        circ = 2 * pi * r;

        System.out.println("Area of the circle is " + area);
        System.out.println("Circumference of the circle is " + circ);

        System.out.print("Enter the radius of a circle   :");
        r = input.nextInt();
        System.out.print("Enter the central angle of a circle   :");
        angle = input.nextInt();

        area = (pi * r * r * angle) / 360;

        System.out.println("Area of a sector of a circle, which central angle represent is "+ area);
    }
}
