import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] board = Board.boardBuilder();

        Prints.printBoard(board);

        for (int i = 0; i < 3; i++) {
            System.out.println("ship placement: ");

            PlacementChecker checker = new PlacementChecker();
            int[] buffer = checker.placementTbT(scanner.nextLine());
            int placementRow = buffer[0];
            int placementColumn = buffer[1];

            ShipsBuilder.TwoByTwoShip(board, placementRow, placementColumn);
            Prints.printBoard(board);
            for (int j = 0; j != -1; j++) {
                System.out.println("pick place to aim");
                Attack attack = new Attack();
                int[] cords = attack.attackCords(scanner.nextLine());
                boolean hit = attack.isHit(board, cords);
                Prints.hit(hit);
                if (hit) {
                    board[cords[0]][cords[1]] = "O";
                    continue;
                } else {
                    j = -2;
                }
                Prints.printBoard(board);

            }
        }
        scanner.close();
    }
}
