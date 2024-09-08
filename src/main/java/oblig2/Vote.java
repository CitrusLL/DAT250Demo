package oblig2;

import java.time.Instant;

public class Vote {
    private Instant publshedAt;
    private VoteOption option;

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
}

