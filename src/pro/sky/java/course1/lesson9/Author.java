package pro.sky.java.course1.lesson9;

import java.util.Objects;

public class Author {

    private final String firstName;
    private final String middleName;
    private final String lastName;


    public Author(String firstName,String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return "Author: " + firstName + " " + middleName + " " + lastName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return firstName.equals(c2.firstName) && middleName.equals(c2.middleName) && lastName.equals(c2.lastName);
    }

    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }

}