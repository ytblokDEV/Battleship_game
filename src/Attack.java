public class Attack {
    public int[] attackCords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return new int[]{0, 0};
        }

        input = input.trim();

        char rowChar = Character.toUpperCase(input.charAt(0));
        int aimRow = rowChar - 'A';

        int aimColumn = 0;
        try {
            String numberPart = input.replaceAll("[^0-9]", "");
            if (!numberPart.isEmpty()) {
                aimColumn = Integer.parseInt(numberPart) - 1;
            }
        } catch (NumberFormatException ignored) {
        }
        return new int[]{aimRow, aimColumn};
    }

    public boolean isHit(String[][] board, int[] cords) {
        return board[cords[0]][cords[1]].equals("X");
    }

    public boolean isDestroyed(String[][] board, int[] cords) {
        int startRow = Math.max(0, cords[0] - 1);
        int endRow = Math.min(9, cords[0] + 1);
        int startCol = Math.max(0, cords[1] - 1);
        int endCol = Math.min(9, cords[1] + 1);
        boolean isSunk = true;

        for (int r = startRow; r <= endRow; r++){
            for (int c = startCol; c <= endCol; c++) {
                if ("X".equals(board[r][c])) {
                    isSunk = false;
                    break;
                }
            }
            if (!isSunk) break;
        }

            return isSunk;
    }
}
