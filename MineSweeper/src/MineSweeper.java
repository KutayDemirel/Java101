import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    int row;
    int col;
    int satir;
    int kolon;
    String[][] board2;
    String[][] played;

    MineSweeper(int row, int col) {

        int[][] board = new int[row][col];
        this.board2 = new String[row][col];
        this.row = row;
        this.col = col;
    }

    int run() {
        System.out.println("Satır giriniz  :");
        this.satir = input.nextInt();
        System.out.println("Kolon giriniz  :");
        this.kolon = input.nextInt();
        play();
        PlayedPrint();
        return 0;
    }

    void MineBoard() {
        Random rand = new Random();
        int mine = (this.row * this.col) / 4;
        int a = 0;
        //String[][] board2 = new String[this.row][this.col];
        while (a < mine) {
            int b = rand.nextInt(this.row);
            int c = rand.nextInt(this.col);
            if (this.board2[b][c] == null) {
                this.board2[b][c] = " * ";
                a++;
            }
        }
        for (int i = 0; i < this.board2.length; i++)
            for (int j = 0; j < this.board2[i].length; j++)
                if (this.board2[i][j] == null)
                    this.board2[i][j] = " - ";

    }

    void print() {
        for (String[] row : this.board2) {
            for (String col : row)
                System.out.print(col);
            System.out.println();
        }
        System.out.print("==============");

    }

    String[][] play() {
        int sum = 0, a = satir - 1, b = kolon - 1;
        this.played = this.board2;
        if (Objects.equals(this.played[satir][kolon], " - ")) {
            if (satir != 0 && satir != this.row && kolon != 0 && kolon != this.col) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++)
                        try {
                            if (this.played[a][b++].equals(" * ")) {
                                sum++;
                            }
                        } catch (Exception ignored){}
                    a++;
                }
                this.played[satir][kolon] = Integer.toString(sum);
            }
        } else {
            System.out.println("You have lost");
        }

        return this.played;
    }

    void PlayedPrint() {
        for (String[] row : this.played) {
            for (String col : row)
                System.out.print(col);
            System.out.println();
        }
        System.out.print("==============");

    }

}
