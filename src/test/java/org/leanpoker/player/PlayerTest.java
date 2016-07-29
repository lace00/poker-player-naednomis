package org.leanpoker.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class PlayerTest {

    @Test
    public void testBetRequest() throws Exception {

        JsonElement jsonElement = new JsonParser().parse("{\n" +
                "  \"tournament_id\": \"579b599c4df50d000300009b\",\n" +
                "  \"game_id\": \"579b7429d182f600030001cb\",\n" +
                "  \"round\": 0,\n" +
                "  \"players\": [\n" +
                "    {\n" +
                "      \"name\": \"naeDnomiS\",\n" +
                "      \"stack\": 1000,\n" +
                "      \"status\": \"active\",\n" +
                "      \"bet\": 0,\n" +
                "      \"hole_cards\": [\n" +
                "        {\n" +
                "          \"rank\": \"10\",\n" +
                "          \"suit\": \"hearts\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"rank\": \"Q\",\n" +
                "          \"suit\": \"spades\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"version\": \"naeDnomiS\",\n" +
                "      \"id\": 0\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Cooperative Turkey\",\n" +
                "      \"stack\": 1000,\n" +
                "      \"status\": \"active\",\n" +
                "      \"bet\": 0,\n" +
                "      \"version\": \"1.0.0\",\n" +
                "      \"id\": 1\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Likely Pony\",\n" +
                "      \"stack\": 1000,\n" +
                "      \"status\": \"active\",\n" +
                "      \"bet\": 0,\n" +
                "      \"version\": \"Default JavaScript folding player\",\n" +
                "      \"id\": 2\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"PickPackPoker\",\n" +
                "      \"stack\": 1000,\n" +
                "      \"status\": \"active\",\n" +
                "      \"bet\": 0,\n" +
                "      \"version\": \"Default Java folding player\",\n" +
                "      \"id\": 3\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Cooperative Eagle\",\n" +
                "      \"stack\": 998,\n" +
                "      \"status\": \"active\",\n" +
                "      \"bet\": 2,\n" +
                "      \"version\": \"Default Java folding player\",\n" +
                "      \"id\": 4\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Simon Says\",\n" +
                "      \"stack\": 996,\n" +
                "      \"status\": \"active\",\n" +
                "      \"bet\": 4,\n" +
                "      \"version\": \"Default Java folding player\",\n" +
                "      \"id\": 5\n" +
                "    }\n" +
                "  ],\n" +
                "  \"small_blind\": 2,\n" +
                "  \"big_blind\": 4,\n" +
                "  \"orbits\": 0,\n" +
                "  \"dealer\": 3,\n" +
                "  \"community_cards\": [],\n" +
                "  \"current_buy_in\": 4,\n" +
                "  \"pot\": 6,\n" +
                "  \"in_action\": 0,\n" +
                "  \"minimum_raise\": 2,\n" +
                "  \"bet_index\": 2\n" +
                "}");


        assertEquals(Integer.MAX_VALUE, Player.betRequest(jsonElement));
    }
}
