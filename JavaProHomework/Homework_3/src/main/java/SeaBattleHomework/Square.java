package SeaBattleHomework;


public class Square {

    private int x;
    private int y;
    private BattleShipPro.SquareStatus squareStatus;

    public Square(int x, int y, BattleShipPro.SquareStatus squareStatus) {
        this.x = x;
        this.y = y;
        this.squareStatus = squareStatus;
    }

    public Square(int x, int y, SeaBattleHomework.SquareStatus ship) {
    }

    public void setSquareStatus(BattleShipPro.SquareStatus squareStatus) {
        this.squareStatus = squareStatus;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public BattleShipPro.SquareStatus getSquareStatus() {
        return squareStatus;
    }

    public char getCharacter() {
        char result=' ';
        switch (squareStatus) {

            case EMPTY :
                result = 'E';
                break;
            case HIT:
                result = 'H';
                break;
            case SHIP:
                result = 'S';
                break;
            case OCEAN:
                result = 'O';
                break;
            case MISSED:
                result = 'M';
                break;
        }
        return result;
    }

    public void setSquareStatus(SeaBattleHomework.SquareStatus missed) {
    }
}
