package oblig2;

import java.util.List;

public class PollRequest {
    private User author;
    private Poll poll;
    private List<VoteOption> options;

    public PollRequest(User author, Poll poll, List<VoteOption> options){
        this.author = author;
        this.poll = poll;
        this.options = options;
    }

    public User getAuthor(){
        return author;
    }

    public Poll getPoll(){
        return poll;
    }

    public List<VoteOption> getOptions(){
        return options;
    }
}
