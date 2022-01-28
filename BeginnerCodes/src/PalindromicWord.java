import java.util.Scanner;

public class PalindromicWord {
    static boolean isPalindromic(String a) {
        char[] check = a.toCharArray();
        int z = a.length() - 1;

        for (int i = 0; i < a.length() / 2; i++)
            check[i] = check[z--];
        String temp = String.valueOf(check);
        return a.equals(temp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        String s = isPalindromic(word) ? word + " is a palindromic word" : word + " is NOT palindromic word";
        System.out.println(s);

    }
}
