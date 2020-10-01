package models;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    private Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public static Name of(String firstName, String middleName, String lastName) {
        return new Name(firstName, middleName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

}
