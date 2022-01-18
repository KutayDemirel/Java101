import java.util.Scanner;


public class CalculatorMenu {
    static int total(int a,int b){
        int result =a+b;
        System.out.println("Total :"+result);
        return result;
    }
    static int subtraction(int a,int b){
        int result =a-b;
        System.out.println("Total :"+result);
        return result;
    }
    static int multiply(int a,int b){
        int result =a*b;
        System.out.println("Total :"+result);
        return result;
    }
    static int divide(int a,int b){
        if (b==0){
            System.out.println("Please enter a number other than 0");
            return b;
        }
        int result =a/b;
        System.out.println("Total :"+result);
        return result;
    }
    static int exponentiation(int a,int b) {
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        System.out.println("Total :" + result);
        return result;
    }
    static void area(int a, int b) {
        int result= +(2*(a+b));
        System.out.println("Perimeter : "+(2*(a+b)));
        System.out.println("Area :"+(a*b));

    }
    public static void main(String[] args) {
        int select,a,b;
        Scanner inp=new Scanner(System.in);


        String menu="1-Summation\n"+
                "2-Subtraction\n"+
                "3-Multiply\n"+
                "4-Division\n"+
                "5-Exponentiation\n"+
                "6-Mod\n"+
                "7-Rectangular Area and Perimeter calculation\n"+
                "8-Exit";
        while (true){
            System.out.println(menu);
            System.out.print("Your choice :");
            select=inp.nextInt();

            if (select==0){
                break;
            }
            System.out.print("Please enter the First Number :");
            a=inp.nextInt();
            System.out.print("Please enter the Second Number :");
            b=inp.nextInt();

            switch (select){
                case 1:
                    total(a,b);
                    break;
                case 2:
                    subtraction(a,b);
                    break;
                case 3:
                    multiply(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    System.out.println("Exponentiation :"+(exponentiation(a,b)));
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    area(a,b);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid Selection");
            }
        }
    }
}