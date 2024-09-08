package oblig2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PollManager {
    private Map<String, User> users = new HashMap<>();
    private Map<Poll, User> polls = new HashMap<>();
    private Map<VoteOption, Poll> options = new HashMap<>();

    public void addUser(User user){
        users.put(user.getUsername(),user);
    }

    public void addPoll(PollRequest req){
        User user = req.getAuthor();
        Poll poll = req.getPoll();
        users.put(user.getUsername(), user);
        
        polls.put(poll, user);

        List<VoteOption> pollOptions = req.getOptions();

        for (VoteOption voteOption : pollOptions) {
            options.put(voteOption, poll);
        }
    }

    public Map<String, User> getUsers(){
        return users;
    }

    public Collection<PollRequest> getPolls(){
        List<PollRequest> out = new ArrayList<>();
        for (Poll  poll : polls.keySet()) {

            User author = polls.get(poll);
            List<VoteOption> options = getPollOptions(poll);

            out.add(new PollRequest(author, poll, options));
            
        }
        return out;
    }

    private List<VoteOption> getPollOptions(Poll poll){

        List<VoteOption> outOptions = new ArrayList<>();

        for (VoteOption option : options.keySet()) {
            if(options.get(option) == poll){
                outOptions.add(option);
            }
        }

        return outOptions;
    }
}
