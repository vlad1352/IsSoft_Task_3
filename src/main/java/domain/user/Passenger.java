package domain.user;

public class Passenger extends User {

    private  boolean haveTicket;

    public Passenger(String firstName, String lastName, Age age, boolean haveTicket) {
        super(firstName, lastName, age);
        this.haveTicket = haveTicket;
    }

    public boolean isHaveTicket() {
        return haveTicket;
    }

    public void setHaveTicket(boolean haveTicket) {
        this.haveTicket = haveTicket;
    }
}
