import java.util.Arrays;

public class ArrayRepeatedNumbers {

    static boolean isRepeated(int[] arry, int value) {
        for (int i : arry) {
            if (i == value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 3, 3, 15, 12, 8, 8, 12, 5, 8, 13, 9, 45, 9};
        int[] duplicate = new int[list.length];
        int a = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] % 2 == 0 && list[i] == list[j]) {
                    if (!isRepeated(duplicate, list[i])) {
                        duplicate[a++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.print("[");
        for ( int i : duplicate) {
            if (i != 0)
                System.out.print(i + ", ");
        }
        System.out.print("\b\b]");
    }
}
