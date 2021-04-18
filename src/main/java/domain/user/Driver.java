package domain.user;

public class Driver extends User {

    private boolean haveLicence;

    public Driver(String firstName, String lastName, Age age, boolean haveLicence) {
        super(firstName, lastName, age);
        this.haveLicence = haveLicence;
    }

    public boolean isHaveLicence() {
        return haveLicence;
    }
}
