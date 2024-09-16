package oblig2;

import java.time.Instant;
import java.util.Collection;
import java.util.List;

//import java.util.ArrayList;

public class Poll {
    private String question;
    private Instant publishedAt;
    private Instant validUntil;

    private User author;
    private List<VoteOption> options;
    

    public Poll(){
    }
    
    public void setQuestion(String newPromt){
        question = newPromt;
    }

    public String getQuestion(){
        return question;
    }

    public void setPublishTime(Instant time){
        publishedAt = time;
    }

    public void setEndTime(Instant time){
        validUntil = time;
    }

    public Instant getPublishTime(){
        return publishedAt;
    }
    
    public Instant getEndTime(){
        return validUntil;
    }

    public User getUser(){
        return author;
    }

    public void setUser(User user){
        this.author = user;
    }

    public List<VoteOption> getOptions(){
        return options;
    }

    public void addOption(VoteOption option){
        options.add(option);
    }

    public void setOptions(List<VoteOption> options){
        this.options = options;
    }

}
