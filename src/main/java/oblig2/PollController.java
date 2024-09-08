package oblig2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;



@RestController
@RequestMapping("/polls")
public class PollController {
    private final PollManager pollManager;

    public PollController(@Autowired PollManager pollManager) {
        this.pollManager = pollManager;
    }

    @PostMapping
    public void addPoll(@RequestBody PollRequest req) {
        pollManager.addPoll(req);
    }

    /* 
    @GetMapping
    public Collection<Poll> getPolls(String question) {
        return pollManager.getPolls().keySet();
    }
    */

    @GetMapping
    public Collection<PollRequest> getPolls() {
        return pollManager.getPolls();
    }
}