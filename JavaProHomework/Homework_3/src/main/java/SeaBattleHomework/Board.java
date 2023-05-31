package SeaBattleHomework;


public class Board {
    private int sizeX = 10;
    private int sizeY = 10;
    Square[][] matrix = new Square[10][10];

    public Board(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        fillBoard(sizeX, sizeY);
    }

    public int getSizeX() {
        return sizeX;
    }

    public Square getSquare(int x, int y){
        return matrix[x][y];
    }

    public int getSizeY() {
        return sizeY;
    }

    public Square[][] fillBoard(int x, int y) {
        matrix = new Square[sizeX][sizeY];
        for (int row=0; row< x; row++) {
            for(int col= 0; col< y; col++) {
                matrix[row][col] = new Square(row,col, BattleShipPro.SquareStatus.OCEAN);
            }
        }
        return  matrix;
    }



    public void placeShip(Square square, Ship ship) {
        switch (ship.getShipType().getLabel()){
            case 1:
                square.setSquareStatus(BattleShipPro.SquareStatus.SHIP);
                ship.add(square);
                break;
            case 2:
                square.setSquareStatus(BattleShipPro.SquareStatus.SHIP);
                ship.add(square);
                int x= square.getX();
                int y = square.getY();
                ship.add(new Square(x,y+1, BattleShipPro.SquareStatus.SHIP));
            case 3:
                square.setSquareStatus(BattleShipPro.SquareStatus.SHIP);
                ship.add(square);
                x= square.getX();
                y = square.getY();
                ship.add(new Square(x,y+1, BattleShipPro.SquareStatus.SHIP));
                ship.add(new Square(x,y+2, BattleShipPro.SquareStatus.SHIP));
            case 4:
                square.setSquareStatus(BattleShipPro.SquareStatus.SHIP);
                ship.add(square);
                x= square.getX();
                y = square.getY();
                ship.add(new Square(x,y+1, BattleShipPro.SquareStatus.SHIP));
                ship.add(new Square(x,y+2, BattleShipPro.SquareStatus.SHIP));
                ship.add(new Square(x,y+3, SquareStatus.SHIP));
        }
    }

}
