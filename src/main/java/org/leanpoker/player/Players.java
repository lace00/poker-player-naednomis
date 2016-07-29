package org.leanpoker.player;

import java.util.List;

public class Players
{
    private String name;
    private int stack;
    private String status;
    private int bet;
    private List<HoleCards> hole_cards;
    private String version;
    private String id;

    public String getName() {
        return name;
    }

    public int getStack() {
        return stack;
    }

    public String getStatus() {
        return status;
    }

    public int getBet() {
        return bet;
    }

    public List<HoleCards> getHole_cards() {
        return hole_cards;
    }

    public String getVersion() {
        return version;
    }

    public String getId() {
        return id;
    }
}