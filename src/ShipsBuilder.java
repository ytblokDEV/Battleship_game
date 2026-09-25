public class ShipsBuilder {
    public static String[][] TwoByTwoShip(String[][] board, int placementRow, int placementColumn) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                board[(placementRow - 1) + i][(placementColumn - 1) + j] = "X";
            }
        }
        return board;
    }
}
