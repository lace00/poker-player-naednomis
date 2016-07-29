package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "naeDnomiS";

    public static int betRequest(JsonElement request) {
        Gson gson = new Gson();
        BetRequest betRequest = gson.fromJson(request.getAsJsonObject(), BetRequest.class);

        Players me = getMe(betRequest);
        System.out.println(me);

        return Integer.MAX_VALUE;
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
