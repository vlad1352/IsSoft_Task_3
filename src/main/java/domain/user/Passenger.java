package domain.user;

public class Passenger {

    private  boolean haveTicket;
    private User user;

    public Passenger(User user) {
        this.user = user;
        haveTicket = false;
    }

    public Passenger(boolean haveTicket, User user) {
        this.haveTicket = haveTicket;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isHaveTicket() {
        return haveTicket;
    }

    public void setHaveTicket(boolean haveTicket) {
        this.haveTicket = haveTicket;
    }
}
