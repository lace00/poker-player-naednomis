package org.leanpoker.player;

public class Players
{
    private String id;

    private String status;

    private String bet;

    private String name;

    private String stack;

    private String version;

    private String[] hole_cards;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getBet ()
    {
        return bet;
    }

    public void setBet (String bet)
    {
        this.bet = bet;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getStack ()
    {
        return stack;
    }

    public void setStack (String stack)
    {
        this.stack = stack;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    public String[] getHole_cards ()
    {
        return hole_cards;
    }

    public void setHole_cards (String[] hole_cards)
    {
        this.hole_cards = hole_cards;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", status = "+status+", bet = "+bet+", name = "+name+", stack = "+stack+", version = "+version+", hole_cards = "+hole_cards+"]";
    }
}