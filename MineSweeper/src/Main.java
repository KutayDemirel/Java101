import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MineSweeper mine = new MineSweeper(5,5);
        String[][] asd ={{"kutay"}, {"yatay"}};

        mine.MineBoard();
        mine.print();
        mine.run();







        /*int[] a = new int[5];

        for (int i = 0 ; i < 5 ; i++)
            a[i] = (int) (Math.random() * 10);

        System.out.println(Arrays.toString(a));

         */
    }
}
