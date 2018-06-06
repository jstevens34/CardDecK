package enums;

public enum Suits {
    SPADE(1),
    DIAMONDS(2),
    CLUBS(3),
    HEARTS(4);

    private int value;

    Suits(int value) {
        this.value = value;
    }

    public int getSuitValue(){
        return this.value;
    }
}
