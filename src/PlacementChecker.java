public class PlacementChecker {
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