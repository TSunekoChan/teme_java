package isp.lab6.exercise3;

import java.util.Set;

public abstract class LoginSystem {
    private Set<User> users;
    private OnlineStore store;

    public LoginSystem(Set<User> users, OnlineStore store) {
        this.users = users;
        this.store = store;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public void setStore(OnlineStore store) {
        this.store = store;
    }

    public void register(String username, String password) {
        for (User user : this.users) {

        }
        users = (this.users);
        new User(username, password);
    }

    public boolean login(String username, String password) {
        register(username, password);
        if (users.hashCode() == hashCode(username) && users.hashCode() == hashCode(password)) return true;
        else return false;
    }

    protected abstract int hashCode(String username);

    public boolean logout(String username, String password) {
        login(username, password);
        if (users.hashCode() == hashCode(username)) return true;
        else return false;
    }
}
