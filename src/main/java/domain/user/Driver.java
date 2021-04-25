package domain.user;

public class Driver {

    private boolean haveLicence;
    private User user;

    public Driver(User user) {
        this.user = user;
        haveLicence = false;
    }

    public Driver(boolean haveLicence, User user) {
        this.haveLicence = haveLicence;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setHaveLicence(boolean haveLicence) {
        this.haveLicence = haveLicence;
    }

    public boolean isHaveLicence() {
        return haveLicence;
    }
}
