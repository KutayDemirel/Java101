import java.util.Arrays;
import java.util.Scanner;

public class ArrayTransposed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 2, b = 3;
        int[][] matrix = new int [a][b];
        int[][] transpose = new int[b][a];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextInt();
            }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrix  :");
        for (int[] row : matrix) System.out.println(Arrays.toString(row));
        System.out.println("Transposed Matrix  :");
        for (int[] row : transpose) System.out.println(Arrays.toString(row));
    }
}
