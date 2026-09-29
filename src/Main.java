import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] board = new String[10][10];

        Prints.printBoard();

        for (int i = 0; i < 3; i++) {
            System.out.println("ship placement: ");

            PlacementChecker checker = new PlacementChecker();
            int[] buffer;
            int placementRow;
            int placementColumn;
            String[][] boardWithShips = new String[10][10];

            for (int k = 0; k < 3; k++) {
                buffer = checker.placementTbT(scanner.nextLine());
                placementRow = buffer[0];
                placementColumn = buffer[1];
                if (checker.canPlaceShip(board, buffer, 2, 2)) {
                    boardWithShips = ShipsBuilder.TwoByTwoShip(board, placementRow, placementColumn);
                    Prints.printBoardWithShips(boardWithShips);
                } else {
                    Prints.printBoardWithShips(boardWithShips);
                    System.out.println("unable to place a ship here try again somewhere else");
                    continue;
                }
            }
            for (int j = 0; j != -1; j++) {
                System.out.println("pick place to aim");
                Attack attack = new Attack();
                int[] cords = attack.attackCords(scanner.nextLine());
                boolean hit = attack.isHit(board, cords);
                Prints.hit(hit);
                if (hit) {
                    board[cords[0]][cords[1]] = "O";
                    if (attack.isDestroyed(board, cords)) {
                        System.out.println("ship destroyed");
                        board = Board.sunkShip(board, cords);
                        Prints.printBoard();
                        continue;
                    }
                } else {
                    j = -2;
                }
                Prints.printBoard();

            }
        }
        scanner.close();
    }
}
