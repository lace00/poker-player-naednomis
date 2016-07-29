package org.leanpoker.player;

import java.util.List;

public class RankResult
{
    private String second_value;

    private String rank;

    private String[] kickers;

    private String value;

    private List<Cards_used> cards_used;

    private List<Cards> cards;

    public String getSecond_value ()
    {
        return second_value;
    }

    public void setSecond_value (String second_value)
    {
        this.second_value = second_value;
    }

    public String getRank ()
    {
        return rank;
    }

    public void setRank (String rank)
    {
        this.rank = rank;
    }

    public String[] getKickers ()
    {
        return kickers;
    }

    public void setKickers (String[] kickers)
    {
        this.kickers = kickers;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public List<Cards_used> getCards_used ()
    {
        return cards_used;
    }

    public void setCards_used (List<Cards_used> cards_used)
    {
        this.cards_used = cards_used;
    }

    public List<Cards> getCards ()
    {
        return cards;
    }

    public void setCards (List<Cards> cards)
    {
        this.cards = cards;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [second_value = "+second_value+", rank = "+rank+", kickers = "+kickers+", value = "+value+", cards_used = "+cards_used+", cards = "+cards+"]";
    }
}