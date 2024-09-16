package oblig2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PollManager {
    private Map<String, User> users = new HashMap<>();
    private Map<Integer,Poll> polls = new HashMap<>();
    private Integer pollID = 0;

    //private Map<VoteOption, Poll> options = new HashMap<>();
    //private Map<Vote,User> votes = new HashMap<>();

    public PollManager(){
        //New user
        User u1 = new User();
        u1.setUsername("Home");
        u1.setEmail("home@test.org");
        addUser(u1);

        //New poll
        Poll p1 = new Poll();
        p1.setQuestion("Do you like the cookie?");

        List<VoteOption> vs = new ArrayList<>();
        VoteOption o1 = new VoteOption();
        VoteOption o2 = new VoteOption();
        o1.setCaption("Yes :)");
        o2.setCaption("No :(");
        vs.add(o1);
        vs.add(o2);
        p1.setOptions(vs);

        addPoll(p1);
    }

    public User addUser(User user){
        //removes anything after a space
        return users.put(user.getUsername().split(" ",2)[0],user);
    }

    public User lookupUser(String username){
        return users.get(username.split(" ",2)[0]);
    }

    public void addPoll(Poll poll){
        polls.put(pollID,poll);

        pollID ++;
    }

    public Collection<User> getUsers(){
        return users.values();
    }

    public Collection<Poll> getPolls(){
       return polls.values();
    }

    public void addVote(Vote vote){
        User user = lookupUser(vote.getUsername());

        user.addVote(vote);
    }

    public void removeVote(Vote vote){
        User user = lookupUser(vote.getUsername());

        user.removesVote(vote);
    }

    public Collection<Vote> getVotes(){

        List<Vote> votes = new ArrayList<>();

        for (User user : getUsers()) {
            Collection<Vote>  vs = user.getVotes();
            votes.addAll(vs);
        }

        System.out.println("Ended loop");

        return votes;
    }


}
