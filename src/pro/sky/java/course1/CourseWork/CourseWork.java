package pro.sky.java.course1.CourseWork;


public class CourseWork {
    public static void main(String[] args) {
        //massive of members

        Employee[] listBusiness = new Employee[10];
        Employee firstMember = new Employee("Danya", "Ermolaev", 1, 150000);
        Employee secondMember = new Employee("Slava", "Musinov", 3, 135000);
        Employee thirdMember = new Employee("Nikita", "Molokanov", 2, 120000);
        Employee fourthMember = new Employee("Ivan", "Ivanov", 1, 130000);

        printListBusinessMembers(listBusiness);
        System.out.println("SalaryCosts: " + calculateSalaryCosts(listBusiness));
        System.out.println("MinSalary: " + findMinSalary(listBusiness));
        System.out.println("MaxSalary: " + findMaxSalary(listBusiness));
        System.out.println("MiddleSalary: " + findMiddleSalary(listBusiness));
        printNamesOfMembers(listBusiness);
        modifiedSalaries(listBusiness, 20);
        printListBusinessMembers(listBusiness);
        System.out.println("Минимальная зарплата в отделе: " + findMinSalaryInDepartment(listBusiness, 1));
        System.out.println("Максимальная зарплата в отделе: " + findMaxSalaryInDepartment(listBusiness, 1));
        System.out.println("Затраты на зарплату в отделе: " + calculateSalaryCostsInDepartment(listBusiness, 1));
        System.out.println("Средняя зарплата в отделе: " + findMiddleSalaryInDepartment(listBusiness, 1));
        modifiedSalariesInDepartment(listBusiness, 50, 1);
        printListBusinessMembersInDepartment(listBusiness, 1);
        findPeopleWithSalariesBelowTheThreshold(listBusiness, 170000);
        findPeopleWithSalariesAboveTheThreshold(listBusiness, 170000);


    }


    //static methods for massive (all department)


    public static void printListBusinessMembers(Employee[] listOfBusinessMembers) {
        System.out.println("Employee: ");
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            System.out.println(listOfBusinessMembers[i]);
        }
        System.out.println();
    }

    public static float calculateSalaryCosts(Employee[] listOfBusinessMembers) {
        float sum = 0;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            sum += listOfBusinessMembers[i].getCash();
        }
        return sum;
    }

    public static float findMinSalary(Employee[] listOfBusinessMembers) {
        float min = 99999999;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getCash() < min) {
                min = listOfBusinessMembers[i].getCash();
            }
        }
        return min;
    }

    public static float findMaxSalary(Employee[] listOfBusinessMembers) {
        float max = -1;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getCash() > max) {
                max = listOfBusinessMembers[i].getCash();
            }
        }
        return max;
    }

    public static float findMiddleSalary(Employee[] listOfBusinessMembers) {
        int countMembers = 0;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] != null) {
                countMembers++;
            }
        }
        return calculateSalaryCosts(listOfBusinessMembers) / countMembers;
    }

    public static void printNamesOfMembers(Employee[] listOfBusinessMembers) {
        System.out.println("Names all members: ");
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            System.out.print(i + 1 + "." + listOfBusinessMembers[i].getFirstName() + " " + listOfBusinessMembers[i].getMiddleName() + "\n");
        }
        System.out.println();
    }

    public static void modifiedSalaries(Employee[] listOfBusinessMembers, float percent) {
        percent = (percent / 100) + 1;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            float a = listOfBusinessMembers[i].getCash() * percent;
            listOfBusinessMembers[i].setCash(a);
        }
    }


    //static methods for massive (for one department)


    public static float findMinSalaryInDepartment(Employee[] listOfBusinessMembers, int department) {
        float min = 99999999;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getDepartment() == department) {
                if (listOfBusinessMembers[i].getCash() < min) {
                    min = listOfBusinessMembers[i].getCash();
                }
            }
        }
        return min;
    }

    public static float findMaxSalaryInDepartment(Employee[] listOfBusinessMembers, int department) {
        float max = -1;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getDepartment() == department) {
                if (listOfBusinessMembers[i].getCash() > max) {
                    max = listOfBusinessMembers[i].getCash();
                }
            }
        }
        return max;
    }

    public static float calculateSalaryCostsInDepartment(Employee[] listOfBusinessMembers, int department) {
        float sum = 0;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getDepartment() == department) {
                sum += listOfBusinessMembers[i].getCash();
            }
        }
        return sum;
    }

    public static float findMiddleSalaryInDepartment(Employee[] listOfBusinessMembers, int department) {
        int countMembers = 0;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getDepartment() == department) {
                countMembers++;
            }
        }
        return calculateSalaryCostsInDepartment(listOfBusinessMembers, department) / countMembers;
    }

    public static void modifiedSalariesInDepartment(Employee[] listOfBusinessMembers, float percent, int department) {
        percent = (percent / 100) + 1;
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getDepartment() == department) {
                float a = listOfBusinessMembers[i].getCash() * percent;
                listOfBusinessMembers[i].setCash(a);
            }
        }
    }

    public static void printListBusinessMembersInDepartment(Employee[] listOfBusinessMembers, int department) {
        System.out.println("Department: ");
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getDepartment() == department) {
                System.out.println("Name: " + listOfBusinessMembers[i].getFirstName() + " " + listOfBusinessMembers[i].getMiddleName() + " Cash: " + listOfBusinessMembers[i].getCash() + " Id: " + listOfBusinessMembers[i].getId());
            }
        }
        System.out.println();
    }

    public static void findPeopleWithSalariesBelowTheThreshold(Employee[] listOfBusinessMembers, float threshold) {
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getCash() >= threshold) {
                System.out.println("Зарплата выше порога: " + threshold + " : " + listOfBusinessMembers[i].getFirstName() + " " + listOfBusinessMembers[i].getMiddleName() + " :Cash: " + listOfBusinessMembers[i].getCash() + " :Id: " + listOfBusinessMembers[i].getId());
            }
        }
        System.out.println();
    }

    public static void findPeopleWithSalariesAboveTheThreshold(Employee[] listOfBusinessMembers, float threshold) {
        for (int i = 0; i < listOfBusinessMembers.length; i++) {
            if (listOfBusinessMembers[i] == null) {
                continue;
            }
            if (listOfBusinessMembers[i].getCash() < threshold) {
                System.out.println("Зарплата ниже порога: " + threshold + " : " + listOfBusinessMembers[i].getFirstName() + " " + listOfBusinessMembers[i].getMiddleName() + " :Cash: " + listOfBusinessMembers[i].getCash() + " :Id: " + listOfBusinessMembers[i].getId());
            }
        }
        System.out.println();
    }
}
