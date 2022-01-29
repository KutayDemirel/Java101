import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    int row;
    int col;
    int selectedRow;
    int selectedCol;
    String[][] mineBoard;
    String[][] gameBoard;
    boolean isMine = false;

    MineSweeper(int row, int col) {

        this.gameBoard = new String[row][col];
        this.mineBoard = new String[row][col];
        this.row = row;
        this.col = col;
    }

    void run() {
        mineBoard();
        minePrint();
        gameBoard();
        while (!isMine) {
            if (!isWin()) {
                System.out.println("Enter row number  :");
                this.selectedRow = input.nextInt();
                System.out.println("Enter column number  :");
                this.selectedCol = input.nextInt();
                if (this.selectedRow <= this.row && this.selectedCol <= this.col &&
                        this.selectedRow >= 0 && this.selectedCol >= 0)
                    play();
                else {
                    System.out.println("=======");
                    System.out.println("Please enter row and column values correctly");
                    System.out.println("=======");
                }
            } else
                break;
        }
    }

    // Creating random placed minefield
    void mineBoard() {
        Random rand = new Random();
        int mine = (this.row * this.col) / 4;
        int a = 0;
        while (a < mine) {
            int b = rand.nextInt(this.row);
            int c = rand.nextInt(this.col);
            if (this.mineBoard[b][c] == null) {
                this.mineBoard[b][c] = " * ";
                a++;
            }
        }
        for (int i = 0; i < this.mineBoard.length; i++)
            for (int j = 0; j < this.mineBoard[i].length; j++)
                if (this.mineBoard[i][j] == null)
                    this.mineBoard[i][j] = " - ";

    }

    // Printing the Minefield
    void minePrint() {
        for (String[] row : this.mineBoard) {
            for (String col : row)
                System.out.print(col);
            System.out.println();
        }
        System.out.println("==============");
    }

    // Checking nearby mine's and writing them to played index
    // Checking whether player stepped onto mine or not
    void play() {
        int sum = 0, a = selectedRow - 1;
        if (this.mineBoard[selectedRow][selectedCol].equals(" - ")) {
            for (int i = 0; i < 3; i++) {
                int b = selectedCol - 1;
                for (int j = 0; j < 3; j++) {
                    try {
                        if (this.mineBoard[a][b++].equals(" * ")) {
                            sum++;
                        }
                    } catch (Exception ignored) {
                    }
                }
                a++;
            }
            this.gameBoard[selectedRow][selectedCol] = " " + sum + " ";
            this.mineBoard[selectedRow][selectedCol] = " " + sum + " ";
            GamePrint();
        } else if (this.mineBoard[selectedRow][selectedCol].equals(" * ")) {
            this.isMine = true;
            System.out.println("=========================");
            System.out.println("You have stepped on mine!");
            System.out.println("Game Over!!");
            System.out.println("=========================");
            minePrint();
        } else {   // (Integer.parseInt(this.mineBoard[selectedRow][selectedCol].trim()) <= this.mine) {
            System.out.println("You have enter the same values");
            System.out.println("Please choose another ones");
        }
    }

    // Checking if the game being won
    boolean isWin() {
        for (String[] row : this.mineBoard) {
            for (String col : row)
                if (col.equals(" - ")) {
                    return false;
                }
        }
        System.out.println("You have won!! Congratulations!");
        System.out.println("===============================");
        minePrint();
        return true;
    }

    // Creating player's game board
    void gameBoard() {
        for (int i = 0; i < this.gameBoard.length; i++)
            for (int j = 0; j < this.gameBoard[i].length; j++)
                if (this.gameBoard[i][j] == null)
                    this.gameBoard[i][j] = " - ";
    }

    // Printing player's steps
    void GamePrint() {
        for (String[] row : this.gameBoard) {
            for (String col : row)
                System.out.print(col);
            System.out.println();
        }
        System.out.println("==============");
    }

}
