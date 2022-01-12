import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        String userName,password;
        int control = 0,cont;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Username");
        userName = input.nextLine();
        System.out.print("Enter your Password");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {

            System.out.println("You have entered");
        }
        else {
            System.out.println("Wrong Username or Password");
            control = 1;
        }

        if (control == 1) {
            System.out.println("Would you like to reset your password ? ");
            System.out.println("1.Yes");
            System.out.println("2.No");
            cont = input.nextInt();
            input.nextLine();

            switch (cont){
                case 1:
                    System.out.println("Please, Enter your new password");
                    password = input.nextLine();
                    if (password.equals("java123")) {
                        System.out.println("Password couldn't be generated. Please, try another password");
                    } else {
                        System.out.println("New password is generated");
                    }
                    break;
                case 2:
                    System.out.println("Please, try to login again");
                    break;
                default:
                    System.out.println("You have entered invalid character, try 1 or 2");
            }


        }
    }

}
