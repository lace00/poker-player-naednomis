package org.leanpoker.player;

public enum Card {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    J("J"),
    Q("Q"),
    K("K"),
    A("A");

    private String string;

    Card(String string) {
        this.string = string;
    }

    public static Card from(String rank) {
        for (Card current : Card.values()) {
            if (current.string.equals(rank)) {
                return current;
            }
        }
        return null;
    }
}
