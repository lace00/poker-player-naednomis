package org.leanpoker.player;

import com.google.gson.JsonElement;


public class Player {

    static final String VERSION = "naeDnomiS";

    public static int betRequest(JsonElement request) {
//        Gson gson = new Gson();
//        BetRequest betRequest = gson.fromJson(request.getAsJsonObject(), BetRequest.class);
//
//        System.out.println("BetRequest: " + betRequest);
        System.err.println(request);

        return Integer.MAX_VALUE;
    }

    public static void showdown(JsonElement game) {
    }

    private int getIntValue(String text) {
        return Integer.parseInt(text);
    }
}
