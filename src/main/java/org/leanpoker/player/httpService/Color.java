package org.leanpoker.player.httpService;

public enum Color {
    HEARTHS("hearths"),
    DIAMONDS("diamonds"),
    SPADES("spades"),
    CLUBS("clubs");

    private String string;

    Color(String string) {
        this.string = string;
    }

    public static Color from(String rank) {
        for (Color current : Color.values()) {
            if (current.string.equals(rank)) {
                return current;
            }
        }
        return null;
    }
}
