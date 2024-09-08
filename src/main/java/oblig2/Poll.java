package oblig2;

import java.time.Instant;

//import java.util.ArrayList;

public class Poll {
    private String question;
    private Instant publishedAt;
    private Instant validUntil;

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

}
