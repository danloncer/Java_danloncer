package pro.sky.java.course1.CourseWork;

public class EmployeeBook {
    private final Employee[] listBusiness = new Employee[10];
    private static float MAX_VALUE = 99999999999F;

    //main methods for active with Employee list

    public void addMember(String firstName, String middleName, int department, float cash) {
        Employee member = new Employee(firstName, middleName, department, cash);
        for (int i = 0; i < listBusiness.length; i++) {
            if (listBusiness[i] == null) {
                listBusiness[i] = member;
                System.out.println("Сотрудник добавлен в ячейку" + " " + i);
                return;
            }
        }
        System.out.println("Нет свободных мест!");
    }

    public void deleteMember (String firstName, String middleName) {
        for (int i = 0; i < listBusiness.length; i++) {
            if (listBusiness[i] == null) {
                continue;
            }
            if (listBusiness[i].getFirstName().equals(firstName) && listBusiness[i].getMiddleName().equals(middleName)) {
                listBusiness[i] = null;
                System.out.println("Сотрудник удален из ячейки" + " " + i);
                return;
            }
        }
        System.out.println("Сотрудник не найден!");
    }

    public void deleteMember (int id) {
        for (int i = 0; i < listBusiness.length; i++) {
            if (listBusiness[i] == null) {
                continue;
            }
            if (listBusiness[i].getId() == id) {
                listBusiness[i] = null;
                return;
            }
        }
        System.out.println("Сотрудник не найден!");
    }

    public void changeCash (String firstName, String middleName, float cash) {
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getFirstName().equals(firstName) && business.getMiddleName().equals(middleName)) {
                business.setCash(cash);
                System.out.println("Зарплата успешно изменена!");
                return;
            }
        }
        System.out.println("Сотрудний не найден.");
    }

    public void changeDepartment (String firstName, String middleName, int department) {
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getFirstName().equals(firstName) && business.getMiddleName().equals(middleName)) {
                business.setDepartment(department);
                System.out.println("Отдел успешно изменен!");
                return;
            }
        }
        System.out.println("Сотрудник не найден!");
    }

    public void changeDepartment (int id, int department) {
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getId() == id) {
                business.setDepartment(department);
                System.out.println("Отдел успешно изменен!");
                return;
            }
        }
        System.out.println("Сотрудник не найден!");
    }

    public void printEmployeeInDep() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n" + "Department: " + i);
            for (Employee business : listBusiness) {
                if (business == null) {
                    continue;
                }
                if (business.getDepartment() == i) {
                    System.out.println("Name: " + business.getFirstName() + " " + business.getMiddleName());
                }
            }
        }
    }


    //different methods for Employee list

    public void printEmployeeList() {
        System.out.println("\n" + "Employee: ");
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            System.out.println(business);
        }
        System.out.println();
    }

    public float calculateSalaryCosts() {
        float sum = 0;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            sum += business.getCash();
        }
        return sum;
    }

    public void findMinSalary() {
        float min = MAX_VALUE;
        StringBuilder member = new StringBuilder();
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getCash() < min) {
                min = business.getCash();
            }
        }
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (min == business.getCash()) {
                System.out.println("Минимальная зарплата у " + business.getFirstName() + " " + business.getMiddleName());
            }
        }
    }

    public void findMaxSalary() {
        float max = -1;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getCash() > max) {
                max = business.getCash();
            }
        }
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (max == business.getCash()) {
                System.out.println("Максимальная зарплата у " + business.getFirstName() + " " + business.getMiddleName());
            }
        }
    }

    public float findMiddleSalary() {
        int countMembers = 0;
        for (Employee business : listBusiness) {
            if (business != null) {
                countMembers++;
            }
        }
        return calculateSalaryCosts() / countMembers;
    }

    public void printNamesEmployee() {
        System.out.println("\n" + "Names all members: ");
        for (int i = 0; i < listBusiness.length; i++) {
            if (listBusiness[i] == null) {
                continue;
            }
            System.out.print(i + 1 + "." + listBusiness[i].getFirstName() + " " + listBusiness[i].getMiddleName() + "\n");
        }
    }

    public void modifiedSalaries(float percent) {
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            business.setCash(business.getCash() * (percent/100+1));
        }
    }


    //different methods for Employee list (deportment)

    public void findMinSalaryInDep(int department) {
        float min = MAX_VALUE;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getDepartment() == department) {
                if (business.getCash() < min) {
                    min = business.getCash();
                }
            }
        }
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (min == business.getCash()) {
                System.out.println("Минимальная зарплата в отделе у " + business.getFirstName() + " " + business.getMiddleName());
            }
        }
    }


    public void findMaxSalaryInDep(int department) {
        float max = -1f;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getDepartment() == department) {
                if (business.getCash() > max) {
                    max = business.getCash();
                }
            }
        }
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (max == business.getCash()) {
                System.out.println("Максимальная зарплата в отделе у " + business.getFirstName() + " " + business.getMiddleName());
            }
        }
    }

    public float calculateSalaryCostsInDep(int department) {
        float sum = 0f;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getDepartment() == department) {
                sum += business.getCash();
            }
        }
        return sum;
    }

    public float findMiddleSalaryInDep(int department) {
        int countMembers = 0;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getDepartment() == department) {
                countMembers++;
            }
        }
        return calculateSalaryCostsInDep(department) / countMembers;
    }

    public void modifiedSalariesInDepartment(float percent, int department) {
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getDepartment() == department) {
                business.setCash(business.getCash() * (percent/100+1));
            }
        }
    }

    public void printDepartment (int department) {
        System.out.println("\n" + "Department: " + department);
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getDepartment() == department) {
                System.out.println(business);
            }
        }
        System.out.println();
    }

    public void findEmployeeWithSalariesBelowTheThreshold(float threshold) {
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getCash() >= threshold) {
                System.out.println("Зарплата выше порога: " + threshold + " : " + business.getFirstName() + " " + business.getMiddleName() + " :Cash: " + business.getCash() + " :Id: " + business.getId());
            }
        }
        System.out.println();
    }

    public void findEmployeeWithSalariesAboveTheThreshold(float threshold) {
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getCash() < threshold) {
                System.out.println("Зарплата ниже порога: " + threshold + " : " + business.getFirstName() + " " + business.getMiddleName() + " :Cash: " + business.getCash() + " :Id: " + business.getId());
            }
        }
        System.out.println();
    }

}
