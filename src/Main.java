import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] board = BoardBuilder.boardBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("ship placement: ");


        PlacementChecker checker = new PlacementChecker();
        int[] buffer = checker.placementTbT(scanner.nextLine());
        int placementRow = buffer[0];
        int placementColumn = buffer[1];

       ShipsBuilder.TwoByTwoShip(board,placementRow,placementColumn);


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
