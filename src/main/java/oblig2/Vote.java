package oblig2;

import java.time.Instant;

public class Vote {
    private Instant publshedAt;
    private VoteOption option;
    private String username;

    public Vote(){
    }

    public void setPublishTime(Instant time){
        publshedAt = time;
    }

    public Instant getPublishTime(){
        return publshedAt;
    }

    public void setOption(VoteOption option){
        this.option = option;
    }

    public VoteOption getOption(){
        return option;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String user){
        this.username = user;
    }
}

