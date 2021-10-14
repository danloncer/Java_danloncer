package pro.sky.java.course1.CourseWork;


public class Employee {


    //Fields


    private final String firstName;
    private final String lastName;
    private int department;
    private float cash;
    private static int counter;
    private final int id;



    //Constructor

    public Employee (String firstName, String lastName, int department, float cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        setDepartment(department);
        this.cash = cash;
        this.id = counter++;
    }


    //Getters


    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public float getCash() {
        return cash;
    }

    public int getId() {
        return id;
    }


    //Setters


    public void setCash (float cash) {
        this.cash = cash;
    }

    public void setDepartment (int department) {
        if (department < 5 && department > 0) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("Отдел не должен быть больше 5 и не меньше 0");
        }
    }


    //Override


    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " :Department: " + department + " :Cash: " + cash + " :Id: " +id;
    }

}
