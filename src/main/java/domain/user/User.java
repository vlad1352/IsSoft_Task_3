package domain.user;

public class User {

    private final String firstName;
    private final String lastName;
    private final Age age;



    public User(String firstName, String lastName, Age age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Age getAge() {
        return age;
    }
}
