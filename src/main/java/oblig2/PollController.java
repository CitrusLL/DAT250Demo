package oblig2;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@CrossOrigin
@RequestMapping("/polls")
public class PollController {
    private final PollManager pollManager;

    public PollController(@Autowired PollManager pollManager) {
        this.pollManager = pollManager;
    }

    @PostMapping("/{usr}")
    public void addPoll(@PathVariable(required = true,name="usr") String username, @RequestBody Poll poll) {
        poll.setUser(pollManager.lookupUser(username));
        pollManager.addPoll(poll); 
    }

    /* 
    @GetMapping
    public Collection<Poll> getPolls(String question) {
        return pollManager.getPolls().keySet();
    }
    */

    @GetMapping
    public Collection<Poll> getPolls() {
        return pollManager.getPolls();
    }

    /* 
    @GetMapping("/{usr}")
    public List<Poll> getPolls(@PathVariable(required = true,name="usr") String username) {
        
        List<Poll> pollsOut = new ArrayList<>();

        for (Poll poll : getPolls()) {
            User usr = poll.getUser();
            if(usr == pollManager.lookupUser(username)){
                pollsOut.append(poll);
            }
        }
       
        return pollsOut;
    }
    */
    
}