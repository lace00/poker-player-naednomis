package org.leanpoker.player.httpService;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.leanpoker.player.HoleCards;
import org.leanpoker.player.RankResult;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class HttpClient {


    public RankResult getRank(List<HoleCards> cards) throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        JsonParser parser = new JsonParser();
        String json = new Gson().toJson(cards);
        HttpGet getRequest = new HttpGet("http://rainman.leanpoker.org/rank?cards="+ URLEncoder.encode(json.toString(), "UTF-8"));
        HttpResponse response = httpClient.execute(getRequest);

        String responseString = EntityUtils.toString(response.getEntity());
        JsonElement jsonElement = new JsonParser().parse(responseString);

        System.out.println(jsonElement);

        return new Gson().fromJson(jsonElement,RankResult.class);

    }

}
