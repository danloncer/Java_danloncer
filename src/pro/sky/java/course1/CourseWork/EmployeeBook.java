package pro.sky.java.course1.CourseWork;

public class EmployeeBook {
    private final Employee[] listBusiness = new Employee[10];


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

    public void deleteMember (String firstName, String middleName, int id) {
        for (int i = 0; i < listBusiness.length; i++) {
            if (listBusiness[i].getFirstName().equals(firstName) && listBusiness[i].getMiddleName().equals(middleName) && listBusiness[i].getId() == id) {
                listBusiness[i] = null;
                System.out.println("Сотрудник удален из ячейки" + " " + i);
                return;
            }
        }
    }

    public void deleteMember (int id) {
        for (int i = 0; i < listBusiness.length; i++) {
            if (listBusiness[i].getId() == id) {
                listBusiness[i] = null;
                return;
            }
        }
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
        System.out.println("Отдел успешно изменен.");
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
        System.out.println("Отдел успешно изменен.");
    }

    public void printListOfMembersInDepartments() {
        for (int i = 0; i < listBusiness.length; i++) {
            if (listBusiness[i] == null) {
                continue;
            }
            System.out.println("\n" + "Department: " + listBusiness[i].getDepartment());
            for (int j = 0; j < listBusiness.length; j++) {
                if (listBusiness[j] == null) {
                    continue;
                }
                if (listBusiness[i].getDepartment() == listBusiness[j].getDepartment()) {
                    System.out.println("Name: " + listBusiness[j].getFirstName() + " " + listBusiness[j].getMiddleName());
                }
            }
        }
    }


    //different methods for Employee list

    public void printListBusinessMembers() {
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

    public float findMinSalary() {
        float min = 99999999;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getCash() < min) {
                min = business.getCash();
            }
        }
        return min;
    }

    public float findMaxSalary() {
        float max = -1;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getCash() > max) {
                max = business.getCash();
            }
        }
        return max;
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

    public void printNamesOfMembers() {
        System.out.println("\n" + "Names all members: ");
        for (int i = 0; i < listBusiness.length; i++) {
            if (listBusiness[i] == null) {
                continue;
            }
            System.out.print(i + 1 + "." + listBusiness[i].getFirstName() + " " + listBusiness[i].getMiddleName() + "\n");
        }
    }

    public void modifiedSalaries(float percent) {
        percent = (percent / 100) + 1;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            float a = business.getCash() * percent;
            business.setCash(a);
        }
    }


    //different methods for Employee list (deportment)

    public float findMinSalaryInDepartment(int department) {
        float min = 99999999999f;
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
        return min;
    }


    public float findMaxSalaryInDepartment(int department) {
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
        return max;
    }

    public float calculateSalaryCostsInDepartment(int department) {
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

    public float findMiddleSalaryInDepartment(int department) {
        int countMembers = 0;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getDepartment() == department) {
                countMembers++;
            }
        }
        return calculateSalaryCostsInDepartment(department) / countMembers;
    }

    public void modifiedSalariesInDepartment(float percent, int department) {
        percent = (percent / 100) + 1;
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getDepartment() == department) {
                float a = business.getCash() * percent;
                business.setCash(a);
            }
        }
    }

    public void printListBusinessMembersInDepartment(int department) {
        System.out.println("\n" + "Department: " + department);
        for (Employee business : listBusiness) {
            if (business == null) {
                continue;
            }
            if (business.getDepartment() == department) {
                System.out.println("Name: " + business.getFirstName() + " " + business.getMiddleName() + " Cash: " + business.getCash() + " Id: " + business.getId());
            }
        }
        System.out.println();
    }

    public void findPeopleWithSalariesBelowTheThreshold(float threshold) {
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

    public void findPeopleWithSalariesAboveTheThreshold(float threshold) {
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
