package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.util.Map;


public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
//        Gson gson = new Gson();
//        BetRequest betRequest = gson.fromJson(request, BetRequest.class);
//
//        System.out.println("BetRequest: " + betRequest);
        return Integer.MAX_VALUE;
    }

    public static void showdown(JsonElement game) {
    }

    private int getIntValue(String text) {
        return Integer.parseInt(text);
    }
}
