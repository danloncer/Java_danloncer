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
        employeeBook.printEmployeeList();
        employeeBook.deleteMember("Kolya", "Dorvanov");
        employeeBook.printEmployeeList();
        System.out.println("Затраты на зарплату: " + employeeBook.calculateSalaryCosts());
        employeeBook.findMinSalary();
        employeeBook.findMaxSalary();
        System.out.println("Средняя зарплата: " + employeeBook.findMiddleSalary());
        employeeBook.printNamesEmployee();
        employeeBook.modifiedSalaries(50);
        employeeBook.printEmployeeList();
        employeeBook.findMinSalaryInDep(1);
        employeeBook.findMaxSalaryInDep(1);
        System.out.println("Затраты на зарплату в отделе: " + employeeBook.calculateSalaryCostsInDep(1));
        System.out.println("Средняя зарплата в отделе: " + employeeBook.findMiddleSalaryInDep(1));
        employeeBook.modifiedSalariesInDepartment(10, 1);
        employeeBook.printDepartment(1);
        employeeBook.findEmployeeWithSalariesBelowTheThreshold(200000);
        employeeBook.findEmployeeWithSalariesAboveTheThreshold(200000);
        employeeBook.changeCash("Ivan", "Ivanov", 190000);
        employeeBook.changeDepartment(1,4);
        employeeBook.printEmployeeInDep();
    }
}
