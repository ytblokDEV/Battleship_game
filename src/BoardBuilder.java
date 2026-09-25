public class BoardBuilder {
    public static String[][] boardBuilder() {
        String[][] board = new String[10][10];
        char row = 'A';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = String.valueOf((char) (row + i)) + (j + 1);
            }
        }
        return board;
    }
}
