package org.leanpoker.player;

import java.util.ArrayList;
import java.util.List;

import org.leanpoker.player.httpService.Color;

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

        if (isPair(myHand)) {
            if (myHand.get(0).ordinal() >= Card.NINE.ordinal()) {
                return Integer.MAX_VALUE;
            }
        }

        if (isSameColor(hole_cards) && isBig(myHand)) {
            return Integer.MAX_VALUE;
        }

//        if (isFold(myHand)) {
//            return 0;
//        }

        return 0;
    }

    private static boolean isAK(Card card) {
        return card == Card.A || card == Card.K;
    }

    private static boolean isBig(List<Card> hand) {
        boolean hasAK = isAK(hand.get(0)) || isAK(hand.get(1));
        boolean bothBig = isBigCard(hand, 0) && isBigCard(hand, 1);

        return hasAK && bothBig;
    }

    private static boolean isSameColor(List<HoleCards> myHand) {
        return Color.from(myHand.get(0).getSuit()) == Color.from(myHand.get(1).getSuit());
    }

    private static boolean isPair(List<Card> myHand) {
        return  myHand.get(0).ordinal() == myHand.get(1).ordinal();
    }

    private static boolean isFold(List<Card> myHand) {
        boolean far = Math.abs(myHand.get(0).ordinal() - myHand.get(1).ordinal()) >= 5;
        boolean small = isSmallCard(myHand, 0) || isSmallCard(myHand, 1);

        return far || small;
    }

    private static boolean isSmallCard(List<Card> myHand, int index) {
        return myHand.get(index).ordinal() < 9;
    }

    private static boolean isBigCard(List<Card> myHand, int index) {
        return myHand.get(index).ordinal() >= 9;
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
