public class Board {

    public static String[][] sunkShip(String[][] board, int[] cords) {
        int minRow = cords[0];
        int maxRow = cords[0];
        int minCol = cords[1];
        int maxCol = cords[1];

        int startRow = Math.max(0, cords[0] - 1);
        int endRow = Math.min(board.length, cords[0] + 1);
        int startCol = Math.max(0, cords[1] - 1);
        int endCol = Math.min(board[0].length, cords[1] + 1);

        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                if ("O".equals(board[r][c])) {
                    if (r < minRow) minRow = r;
                    if (r > maxRow) maxRow = r;
                    if (c < minCol) minCol = c;
                    if (c > maxCol) maxCol = c;
                }
            }
        }
        int boxStartRow = Math.max(0, minRow - 1);
        int boxEndRow = Math.min(board.length - 1, maxRow + 1);
        int boxStartCol = Math.max(0, minCol - 1);
        int boxEndCol = Math.min(board[0].length - 1, maxCol + 1);

        for (int r = boxStartRow; r <= boxEndRow; r++) {
            for (int c = boxStartCol; c <= boxEndCol; c++) {
                boolean isInsideShip = (r >= minRow && r <= maxRow && c >= minCol && c <= maxCol);
                if (!isInsideShip) {
                    board[r][c] = "*";
                }
            }
        }
        return board;
    }
}

