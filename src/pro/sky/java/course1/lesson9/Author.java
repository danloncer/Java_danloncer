package pro.sky.java.course1.lesson9;

import java.util.Objects;

public class Author {

    private final String firstName;
    private final String middleName;



    public Author(String firstName,String middleName) {
        this.firstName = firstName;
        this.middleName= middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return "Author: " + firstName + " " + middleName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return firstName.equals(c2.firstName) && middleName.equals(c2.middleName);
    }

    public int hashCode() {
        return Objects.hash(firstName, middleName);
    }

}