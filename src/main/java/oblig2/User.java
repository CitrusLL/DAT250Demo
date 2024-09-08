package oblig2;

public class User {
    private String username;
    private String email;

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
}
