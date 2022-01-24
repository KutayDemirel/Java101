import java.util.Arrays;

public class ArrayClosestToMaxMix {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int max = list[0];
        int min = list[0];
        int difMin = 1000000, difMax = 1000000;
        int closestMin = 0, closestMax = 0;

        for (int i : list) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        for (int j = 0; j < list.length - 1; j++) {
            if (difMax > (max - list[j])) {
                if (max - list[j] == 0)
                    continue;
                difMax = (max - list[j]);
                closestMax = list[j];
            }
            if (difMin > (list[j] - min)) {
                if (list[j] - min == 0)
                    continue;
                difMin = list[j] - min;
                closestMin = list[j];
            }

        }
        System.out.println(closestMax);
        System.out.println(closestMin);


        // With methods
        /*
        Arrays.sort(list);
        System.out.println(list[1] + " " + list[(list.length -2)]);
        */
    }
}
