package pro.sky.java.course1.CourseWork;


public class CourseWork {
    public static void main(String[] args) {
        //massive of members

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addMember("Danya", "Ermolaev", 1, 150000);
        employeeBook.addMember("Slava", "Musinov", 3, 135000);
        employeeBook.addMember("Nikita", "Molokanov", 2, 140000);
        employeeBook.addMember("Ivan", "Ivanov", 1, 110000);
        employeeBook.addMember("Kolya", "Dorvanov", 4, 100000);
        employeeBook.printListBusinessMembers();
        employeeBook.deleteMember("Kolya", "Dorvanov", 5);
        employeeBook.printListBusinessMembers();
        System.out.println("Затраты на зарплату: " + employeeBook.calculateSalaryCosts());
        System.out.println("Минимальная зарплата: " + employeeBook.findMinSalary());
        System.out.println("Максимальная зарплата: " + employeeBook.findMaxSalary());
        System.out.println("Средняя зарплата: " + employeeBook.findMiddleSalary());
        employeeBook.printNamesOfMembers();
        employeeBook.modifiedSalaries(50);
        employeeBook.printListBusinessMembers();
        System.out.println("Минимальная зарплата в отделе: " + employeeBook.findMinSalaryInDepartment(1));
        System.out.println("Максимальная зарплата в отделе: " + employeeBook.findMaxSalaryInDepartment(1));
        System.out.println("Затраты на зарплату в отделе: " + employeeBook.calculateSalaryCostsInDepartment(1));
        System.out.println("Средняя зарплата в отделе: " + employeeBook.findMiddleSalaryInDepartment(1));
        employeeBook.modifiedSalariesInDepartment(10, 1);
        employeeBook.printListBusinessMembersInDepartment(1);
        employeeBook.findPeopleWithSalariesBelowTheThreshold(200000);
        employeeBook.findPeopleWithSalariesAboveTheThreshold(200000);
        employeeBook.changeCash("Ivan", "Ivanov", 190000);
        employeeBook.changeDepartment(4,1);
        employeeBook.printListOfMembersInDepartments();
    }
}
