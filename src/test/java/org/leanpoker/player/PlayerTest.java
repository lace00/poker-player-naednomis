package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void testBetRequest() throws Exception {

        JsonElement jsonElement = new JsonParser().parse("{\"bet_index\": \"value1\", \"game_id\": \"value2\"}");


        assertEquals(0, Player.betRequest(jsonElement));



    }
}
