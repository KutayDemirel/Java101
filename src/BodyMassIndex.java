import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        int weight;
        double height,mass;
        Scanner input = new Scanner(System.in);

        System.out.print("Please, Enter the height as cm(like 1,70)  :");
        height = input.nextDouble();
        System.out.print("Please, Enter the weight as kg  :");
        weight = input.nextInt();

        mass = weight / (height * height);
        System.out.println("Your Body Mass Index is " + mass);
    }

}
