package org.leanpoker.player;

public class BetRequest
{
    private String[] community_cards;

    private String dealer;

    private String tournament_id;

    private String orbits;

    private String bet_index;

    private String game_id;

    private Players[] players;

    private String current_buy_in;

    private String round;

    private String small_blind;

    private String pot;

    public String[] getCommunity_cards ()
    {
        return community_cards;
    }

    public void setCommunity_cards (String[] community_cards)
    {
        this.community_cards = community_cards;
    }

    public String getDealer ()
    {
        return dealer;
    }

    public void setDealer (String dealer)
    {
        this.dealer = dealer;
    }

    public String getTournament_id ()
    {
        return tournament_id;
    }

    public void setTournament_id (String tournament_id)
    {
        this.tournament_id = tournament_id;
    }

    public String getOrbits ()
    {
        return orbits;
    }

    public void setOrbits (String orbits)
    {
        this.orbits = orbits;
    }

    public String getBet_index ()
    {
        return bet_index;
    }

    public void setBet_index (String bet_index)
    {
        this.bet_index = bet_index;
    }

    public String getGame_id ()
    {
        return game_id;
    }

    public void setGame_id (String game_id)
    {
        this.game_id = game_id;
    }

    public Players[] getPlayers ()
    {
        return players;
    }

    public void setPlayers (Players[] players)
    {
        this.players = players;
    }

    public String getCurrent_buy_in ()
    {
        return current_buy_in;
    }

    public void setCurrent_buy_in (String current_buy_in)
    {
        this.current_buy_in = current_buy_in;
    }

    public String getRound ()
    {
        return round;
    }

    public void setRound (String round)
    {
        this.round = round;
    }

    public String getSmall_blind ()
    {
        return small_blind;
    }

    public void setSmall_blind (String small_blind)
    {
        this.small_blind = small_blind;
    }

    public String getPot ()
    {
        return pot;
    }

    public void setPot (String pot)
    {
        this.pot = pot;
    }

    @Override
    public String toString()
    {
        return "BetRequest [community_cards = "+community_cards+", dealer = "+dealer+", tournament_id = "+tournament_id+", orbits = "+orbits+", bet_index = "+bet_index+", game_id = "+game_id+", players = "+players+", current_buy_in = "+current_buy_in+", round = "+round+", small_blind = "+small_blind+", pot = "+pot+"]";
    }
}
