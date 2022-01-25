import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int flag = 0;
        Arrays.sort(list);


        for (int i = 0; i < list.length; i++) {
            if (list[i] != flag) {
                int counter = 1;
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && list[i] == list[j]) {
                        counter++;
                        flag = list[i];
                    }
                }
                System.out.println("Number of " + list[i] + " is repeated " + counter + " times.");
            }
        }
    }
}
