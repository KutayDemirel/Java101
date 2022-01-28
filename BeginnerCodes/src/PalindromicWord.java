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

    static boolean isControl(String str) {
        int end = str.length() - 1, start = 0;
        while (end > start) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            end--;
            start++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();


        String s = isPalindromic(word) ? word + " is a palindromic word" : word + " is NOT palindromic word";
        System.out.println(s);

        /*
        if(!isControl(word))
            System.out.println("no");
        else
            System.out.println("yes");
         */
    }
}
