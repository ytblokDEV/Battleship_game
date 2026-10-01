import java.util.Scanner;
import java.util.regex.Pattern;

public class InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public Coordinate readCoordinate() {
        while (true) {
            System.out.println("Enter coordinates e.g. \"A5\" ");
            String input = scanner.nextLine().toUpperCase().trim();
            boolean hasValidCharacters = Pattern.matches("[A-J](10|[1-9])", input);

            int row = 0;
            int column = 0;
            if (hasValidCharacters) {
                try {
                    column = Integer.parseInt(input.replaceAll("[^0-9]", "")) - 1;
                    row = (int) input.charAt(0) - 'A';
                    return new Coordinate(row, column);
                } catch (Exception e) {
                    System.out.println("Invalid format");
                }
            } else {
                System.out.println("You need to specify cell on the board");
            }
        }
    }
}
