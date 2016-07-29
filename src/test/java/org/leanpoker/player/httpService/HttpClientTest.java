package org.leanpoker.player.httpService;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;
import org.leanpoker.player.HoleCards;
import org.leanpoker.player.RankResult;

public class HttpClientTest {

    HttpClient client = new HttpClient();

    @Test
    public void test() throws IOException {

        HoleCards card1 = new HoleCards();
        card1.setRank("2");
        card1.setSuit("diamonds");
        HoleCards card2 = new HoleCards();
        card2.setRank("3");
        card2.setSuit("diamonds");
        HoleCards card3 = new HoleCards();
        card3.setRank("4");
        card3.setSuit("diamonds");
        HoleCards card4 = new HoleCards();
        card4.setRank("5");
        card4.setSuit("diamonds");
        HoleCards card5 = new HoleCards();
        card5.setRank("6");
        card5.setSuit("diamonds");
        RankResult result = client.getRank(Arrays.asList(card1,card2,card3,card4,card5));

        System.out.println(result);



    }
}
