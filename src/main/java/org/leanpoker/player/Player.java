package org.leanpoker.player;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "naeDnomiS";

    public static int betRequest(JsonElement request) {
        Gson gson = new Gson();
        BetRequest betRequest = gson.fromJson(request.getAsJsonObject(), BetRequest.class);

        Players me = getMe(betRequest);
        List<HoleCards> hole_cards = me.getHole_cards();
        List<Card> myHand = getHand(hole_cards);

        if (Math.abs(myHand.get(0).ordinal()-myHand.get(1).ordinal()) >= 5) {
            return 0;
        }

        return Integer.MAX_VALUE;
    }

    private static List<Card> getHand(List<HoleCards> hole_cards) {
        List<Card> myHand = new ArrayList<>();
        for (HoleCards current: hole_cards) {
            String rank = current.getRank();
            myHand.add(Card.from(rank));
        }
        return myHand;
    }

    public static void showdown(JsonElement game) {
    }

    private int getIntValue(String text) {
        return Integer.parseInt(text);
    }

    private static Players getMe(BetRequest betRequest) {
        Players[] players = betRequest.getPlayers();
        for (Players current : players) {
            if (VERSION.equals(current.getName())) {
                return current;
            }
        }

        return null;
    }
}
