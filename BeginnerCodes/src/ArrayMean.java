import java.util.Arrays;

public class ArrayMean {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double harm = 0.0;

        for (int k : list)
            for (int j = 1; j <= k; j++)
                harm += 1.00 / j;

        double harmMean = harm / list.length;
        System.out.println(harmMean);

    }
}
