package SeaBattleHomework;

public enum ShipType {
    SINGLE_DECK(4),
    TWO_DECK(3),
    THREE_DECK(2),
    FOUR_DECK(1);


    private final Integer label;

    public Integer getLabel() {
        return label;
    }

    private ShipType(Integer label) {
        this.label = label;
    }


}
