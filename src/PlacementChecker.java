public class PlacementChecker {
    public boolean canPlaceShip(String[][] board, int[] cords , int width , int height){
        int topRow = cords[0];
        int topCol = cords[1];
        if (topRow < 0 || topCol < 0 || topRow + height > 10 || topCol + width > 10) {
            return false;
        }
        int startRow = Math.max(0, topRow - 1);
        int endRow = Math.min(9, topRow + height);
        int startCol = Math.max(0, topCol - 1);
        int endCol = Math.min(9, topCol + width);

        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                if (board[r][c] != null) {
                    return false;
                }
            }
        }
        return true;
    }
    public int[] placementTbT(String input) {
        if (input == null || input.trim().isEmpty()) {
            return new int[]{0, 0};
        }

        input = input.trim();

        char rowChar = Character.toUpperCase(input.charAt(0));
        int placementRow = rowChar - 'A' + 1;

        int placementColumn = 0;
        try {
            String numberPart = input.replaceAll("[^0-9]", "");
            if (!numberPart.isEmpty()) {
                placementColumn = Integer.parseInt(numberPart);
            }
        } catch (NumberFormatException e) {
            placementColumn = 0;
        }

        return new int[]{placementRow, placementColumn};
    }
}