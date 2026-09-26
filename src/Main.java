import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] board = Board.boardBuilder();

        Prints.printBoard(board);

        System.out.println("ship placement: ");


        PlacementChecker checker = new PlacementChecker();
        int[] buffer = checker.placementTbT(scanner.nextLine());
        int placementRow = buffer[0];
        int placementColumn = buffer[1];

        ShipsBuilder.TwoByTwoShip(board, placementRow, placementColumn);
        Prints.printBoard(board);

        System.out.println("pick place to aim");
        Attack attack = new Attack();
        boolean hit = attack.isHit(board, attack.attackCords(scanner.nextLine()));
        Prints.hit(hit);

        scanner.close();
    }
}
