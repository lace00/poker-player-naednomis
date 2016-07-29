package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;


public class Player {

    static final String VERSION = "naeDnomiS";

    public static int betRequest(JsonElement request) {
        Gson gson = new Gson();
        Wrapper betRequest = gson.fromJson(request.getAsJsonObject(), Wrapper.class);

        return Integer.MAX_VALUE;
    }

    public static void showdown(JsonElement game) {
    }

    private int getIntValue(String text) {
        return Integer.parseInt(text);
    }
}
