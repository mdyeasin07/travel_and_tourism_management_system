package Models;

public class User {
    String user,email,pass,repass;
    public User(){

    }

    public User(String user, String email, String pass, String repass) {
        this.user = user;
        this.email = email;
        this.pass = pass;
        this.repass = repass;
    }

    public User(String user, String email, String pass) {
        this.user = user;
        this.email = email;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }
}
