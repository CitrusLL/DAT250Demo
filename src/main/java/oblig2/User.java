package oblig2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class User {
    private String username;
    private String email;

    private Set<Vote> votes = new HashSet<>();

    public User(){
    }

    public String getEmail(){

        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String newUserame){

        username = newUserame;
    }

    public void setEmail(String newEmail){

        email = newEmail;
    }

    public void addVote(Vote vote){
        votes.add(vote);
    }

    public Set<Vote> getVotes(){

        return votes;
    }

    public void removesVote(Vote vote){
        if(votes.contains(vote)){
            votes.remove(vote);
        }
    }
}
