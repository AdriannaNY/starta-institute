package lesson3.practice3.Coffee;

enum Volume {
    SMALL(50), MIDDLE(120), LARGE(200);

    private int volume;

    Volume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
