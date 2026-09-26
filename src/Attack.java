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
        boolean HitStatus;
        HitStatus = board[cords[0]][cords[1]].equals("X");
        board[cords[0]][cords[1]] = "O";

        return HitStatus;
    }
}
