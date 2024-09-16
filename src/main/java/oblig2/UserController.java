package oblig2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    private final PollManager pollManager;

    public UserController(@Autowired PollManager pollManager) {
        this.pollManager = pollManager;
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        pollManager.addUser(user);
    }

    @GetMapping
    public Collection<User> getUsers() {
        return pollManager.getUsers();
    }

    @GetMapping("/login/{username}")
    public User getMethodName(@PathVariable("username") String username) {
        return pollManager.lookupUser(username);
    }
    
    /* 
    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username) {
        pollManager.deleteUser(username);
    }
    */

    @PostMapping("/votes/{username}")
    public void vote(@PathVariable("username") String username, @RequestBody Vote vote) {
        User existingUser = pollManager.lookupUser(username);

        vote.setUsername(existingUser.getUsername());

        Collection<Poll> polls = pollManager.getPolls();

        for (Vote v : existingUser.getVotes()) {
            VoteOption v1 = v.getOption();
            VoteOption v2 = vote.getOption();

            for(Poll p : polls){
                Collection<VoteOption> vos = p.getOptions();
                if(vos.contains(v1) && vos.contains(v2)){
                    pollManager.removeVote(v);
                    pollManager.addVote(vote);
                    return;
                }
            }
        }

        pollManager.addVote(vote);

        /*
        System.out.println("!?!?!?");
        System.out.println(pollManager.lookupUser(username));
        System.out.println(vote.getUser());
        System.out.println(vote.getOption());*/
    }

    @GetMapping("/votes")
    public Collection<Vote> getVotes() {

        return pollManager.getVotes();        
    }
    
}