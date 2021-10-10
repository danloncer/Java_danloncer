package pro.sky.java.course1.CourseWork;


public class Employee {


    //Fields


    private final String firstName;
    private final String middleName;
    private int department;
    private float cash;
    private static int counter = 0;
    private final int id;



    //Constructor

    public Employee (String firstName, String middleName, int department, float cash) {
        this.firstName = firstName;
        this.middleName = middleName;
        setDepartment(department);
        this.cash = cash;
        this.id = counter++;
    }


    //Getters


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
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
            throw new RuntimeException("Отдел не должен быть больше 5 и не меньше 0");
        }
    }


    //Override


    @Override
    public String toString() {
        return "Name: " + firstName + " " + middleName + " :Department: " + department + " :Cash: " + cash + " :Id: " +id;
    }

}
