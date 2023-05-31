package SeaBattleHomework;

import java.util.List;

public class Player {

    private List<SeaBattleHomework.Ship> ships;
    private int remainingShips = 0;
    private final SeaBattleHomework.Board board;

    public Player(List<SeaBattleHomework.Ship> ships, SeaBattleHomework.Board board) {
        this.ships = ships;
        this.board = board;
    }

    public SeaBattleHomework.Board getBoard() {
        return board;
    }

    public int numberOfSquaresOfShips(List<SeaBattleHomework.Ship> ships) {
        int sumOfAllSquares = 0;
        for (SeaBattleHomework.Ship ship : ships) {
            sumOfAllSquares += ship.getShipType().getLabel();
        }
        return sumOfAllSquares;
    }





    public boolean  handleShot(int x, int y) {
        for( Ship ship : ships) {
            for(Square square : ship.getFields()) {

                if(square.getY() == y && square.getX() == x && square.getSquareStatus().equals(BattleShipPro.SquareStatus.SHIP)) {
                    square.setSquareStatus(BattleShipPro.SquareStatus.HIT);
                    board.getSquare(x,y).setSquareStatus(BattleShipPro.SquareStatus.HIT);
                    System.out.println("You hit a ship!");
                    return true;
                } else if(square.getY() == y && square.getX() == x && square.getSquareStatus().equals(BattleShipPro.SquareStatus.HIT)){
                    square.setSquareStatus(BattleShipPro.SquareStatus.HIT);
                    board.getSquare(x,y).setSquareStatus(BattleShipPro.SquareStatus.HIT);
                    System.out.println("Already Hit");
                    return  false;
                }
            }
        }
        board.getSquare(x,y).setSquareStatus(SquareStatus.MISSED);
        System.out.println("Miss!");
        return  false;
    }

}
