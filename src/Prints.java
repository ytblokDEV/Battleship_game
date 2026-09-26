public class Prints {
    public static void hit(boolean hit) {
        if (hit) {
            System.out.println("you hit the ship");
        } else {
            System.out.println("you missed");
        }
    }


    public static void printBoard(String[][] board){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
