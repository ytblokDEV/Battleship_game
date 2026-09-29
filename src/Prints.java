public class Prints {
    public static void hit(boolean hit) {
        if (hit) {
            System.out.println("you hit the ship");
        } else {
            System.out.println("you missed");
        }
    }


    public static void printBoard(){
        String[][] board = new String[10][10];
        char row = 'A';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = String.valueOf((char) (row + i)) + (j + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void printBoardWithShips(String[][] board){
        char row = 'A';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == null) {
                    board[i][j] = String.valueOf((char) (row + i)) + (j + 1);
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
