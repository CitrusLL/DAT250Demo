package oblig2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
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
        return pollManager.getUsers().values();
    }

    /* 
    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username) {
        pollManager.deleteUser(username);
    }
    */

    @PutMapping("/{username}")
    public void vote(@PathVariable String username, @RequestBody Vote vote) {
        User existingUser = pollManager.getUsers().get(username);

        pollManager.addVote(vote, existingUser);
    }

    @GetMapping("/votes")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}