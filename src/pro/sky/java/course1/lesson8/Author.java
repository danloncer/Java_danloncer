package pro.sky.java.course1.lesson8;

public class Author {

    private String firstName;
    private String middleName;



    public Author(String firstName,String middleName) {
        this.firstName = firstName;
        this.middleName= middleName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

}
