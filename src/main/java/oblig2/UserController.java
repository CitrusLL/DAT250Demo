package oblig2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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
    public void updateUser(@PathVariable String username, @RequestBody User updatedUser) {
        User existingUser = pollManager.getUsers().get(username);
        if (existingUser != null) { // Simplified logic: directly update fields
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setEmail(updatedUser.getEmail());
        }
    }
}