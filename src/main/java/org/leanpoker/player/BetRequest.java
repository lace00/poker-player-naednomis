package org.leanpoker.player;

public class BetRequest
{
    private String tournament_id;
    private String game_id;
    private int round;
    private Players[] players;
    private int small_blind;
    private int big_blind;
    private String orbits;
    private int dealer;
    private Object community_cards;
    private int current_buy_in;
    private int pot;
    private int in_action;
    private int minimum_raise;
    private int bet_index;

    public String getTournament_id() {
        return tournament_id;
    }

    public String getGame_id() {
        return game_id;
    }

    public int getRound() {
        return round;
    }

    public Players[] getPlayers() {
        return players;
    }

    public int getSmall_blind() {
        return small_blind;
    }

    public int getBig_blind() {
        return big_blind;
    }

    public String getOrbits() {
        return orbits;
    }

    public int getDealer() {
        return dealer;
    }

    public int getCurrent_buy_in() {
        return current_buy_in;
    }

    public int getPot() {
        return pot;
    }

    public int getIn_action() {
        return in_action;
    }

    public int getMinimum_raise() {
        return minimum_raise;
    }

    public int getBet_index() {
        return bet_index;
    }
}
