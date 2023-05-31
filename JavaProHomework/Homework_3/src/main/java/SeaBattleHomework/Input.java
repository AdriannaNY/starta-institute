package SeaBattleHomework;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Input {
    private Scanner scanner = new Scanner(System.in);
    private List<SeaBattleHomework.Board> boards = new ArrayList<>();
    int choice;
    List<Integer> CoordinatesAndShipType = new ArrayList<>();

    public List<SeaBattleHomework.Board> getBoards() {
        generateBoard();
        return boards;
    }

    public Input() {

    }


    public int getIntegerMenuOption() {
        choice = scanner.nextInt();
        scanner.nextLine();
        return choice;

    }

    private List<Integer> AskCoordForShipAndType() {
        this.CoordinatesAndShipType = new ArrayList<>();
        System.out.println("выберите строку:");
        int row = scanner.nextInt();
        scanner.nextLine();
        System.out.println("выберите столбец: ");
        int col = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Выберите корабль: \n" + "1. Однопалубный \n" + "2. Двухпалубный" + "\n" + "3. Трехпалубный \n"
                + "4. Четырехпалубный");
        int shipType = scanner.nextInt();
        CoordinatesAndShipType.add(row);
        CoordinatesAndShipType.add(col);
        CoordinatesAndShipType.add(shipType);
        return CoordinatesAndShipType;

    }

    public Ship createShip(int player) {
        int GamePlayer = player + 1;
        Square shipPart;
        Ship ship;
        System.out.println("Игрок " + GamePlayer + " размещает корабль");
        CoordinatesAndShipType = AskCoordForShipAndType();
        int row = CoordinatesAndShipType.get(0);
        int col = CoordinatesAndShipType.get(1);
        int shipType = CoordinatesAndShipType.get(2);
        shipPart = new Square(row, col, SquareStatus.SHIP);
        ship = new Ship(new ArrayList<>(), ShipType.values()[shipType - 1]);
        boards.get(player).placeShip(shipPart, ship);
        return ship;
    }


    public void generateBoard() {
        int x = 10;
        int y = 10;
        SeaBattleHomework.Board board1 = new SeaBattleHomework.Board(x, y);
        SeaBattleHomework.Board board2 = new SeaBattleHomework.Board(x, y);
        boards.add(board1);
        boards.add(board2);
    }

    public int[] shoot(int player) {
        int GamePlayer = player + 1;
        System.out.println("Player " + GamePlayer + " shoot");
        System.out.println("select row :");
        int row = scanner.nextInt();
        scanner.nextLine();
        System.out.println("select col: ");
        int col = scanner.nextInt();
        return new int[]{row, col};
    }


}
