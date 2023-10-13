package isp.lab6.exercise3;

import java.util.Objects;

public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object user) {
        return super.equals(user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
