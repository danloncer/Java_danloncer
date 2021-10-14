package pro.sky.java.course1.CourseWork;

public class EmployeeBook {
    private final Employee[] listWorkers = new Employee[10];

    //main methods for active with Employee list

    public void addMember(String firstName, String middleName, int department, float cash) {
        Employee member = new Employee(firstName, middleName, department, cash);
        for (int i = 0; i < listWorkers.length; i++) {
            if (listWorkers[i] == null) {
                listWorkers[i] = member;
                System.out.println("Сотрудник добавлен в ячейку" + " " + i);
                return;
            }
        }
        System.out.println("Нет свободных мест!");
    }

    public void deleteMember (String firstName, String middleName) {
        for (int i = 0; i < listWorkers.length; i++) {
            if (listWorkers[i] == null) {
                continue;
            }
            if (listWorkers[i].getFirstName().equals(firstName) && listWorkers[i].getlastName().equals(middleName)) {
                listWorkers[i] = null;
                System.out.println("Сотрудник удален из ячейки" + " " + i);
                return;
            }
        }
        System.out.println("Сотрудник не найден!");
    }

    public void deleteMember (int id) {
        for (int i = 0; i < listWorkers.length; i++) {
            if (listWorkers[i] == null) {
                continue;
            }
            if (listWorkers[i].getId() == id) {
                listWorkers[i] = null;
                return;
            }
        }
        System.out.println("Сотрудник не найден!");
    }

    public void changeCash (String firstName, String middleName, float cash) {
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            if (worker.getFirstName().equals(firstName) && worker.getlastName().equals(middleName)) {
                worker.setCash(cash);
                System.out.println("Зарплата успешно изменена!");
                return;
            }
        }
        System.out.println("Сотрудний не найден.");
    }

    public void changeDepartment (String firstName, String middleName, int department) {
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            if (worker.getFirstName().equals(firstName) && worker.getlastName().equals(middleName)) {
                worker.setDepartment(department);
                System.out.println("Отдел успешно изменен!");
                return;
            }
        }
        System.out.println("Сотрудник не найден!");
    }

    public void changeDepartment (int id, int department) {
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            if (worker.getId() == id) {
                worker.setDepartment(department);
                System.out.println("Отдел успешно изменен!");
                return;
            }
        }
        System.out.println("Сотрудник не найден!");
    }

    public void printEmployeeInDep() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n" + "Department: " + i);
            for (Employee worker : listWorkers) {
                if (worker == null) {
                    continue;
                }
                if (worker.getDepartment() == i) {
                    System.out.println("Name: " + worker.getFirstName() + " " + worker.getlastName());
                }
            }
        }
    }


    //different methods for Employee list

    public void printEmployeeList() {
        System.out.println("\n" + "Employee: ");
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            System.out.println(worker);
        }
        System.out.println();
    }

    public float calculateSalaryCosts() {
        float sum = 0;
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            sum += worker.getCash();
        }
        return sum;
    }

    public Employee findMinSalary() {
        float minSal = Float.MAX_VALUE;
        int salId = 0;
        for (int i = 0; i < listWorkers.length; i++) {
            if (listWorkers[i] == null) {
                continue;
            }
            if (listWorkers[i].getCash() < minSal) {
                minSal = listWorkers[i].getCash();
                salId = i;
            }
        }
    return listWorkers[salId];
    }

    public Employee findMaxSalary() {
        float maxSal = Float.MIN_VALUE;
        int salId = 0;
        for (int i = 0; i < listWorkers.length; i++) {
            if (listWorkers[i] == null) {
                continue;
            }
            if (listWorkers[i].getCash() > maxSal) {
                maxSal = listWorkers[i].getCash();
                salId = i;
            }
        }
        return listWorkers[salId];
    }

    public float findMiddleSalary() {
        int countWorkers = 0;
        for (Employee worker : listWorkers) {
            if (worker != null) {
                countWorkers++;
            }
        }
        return calculateSalaryCosts() / countWorkers;
    }

    public void printNamesEmployee() {
        System.out.println("\n" + "Names all members: ");
        int i = 1;
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            System.out.println(i++ + "." + worker.getFirstName() + " " + worker.getlastName());
        }
    }

    public void modifiedSalaries(float percent) {
        float multiplier = percent/100+1;
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            worker.setCash(worker.getCash() * multiplier);
        }
    }


    //different methods for Employee list (deportment)

    public Employee findMinSalaryInDep(int department) {
        float minSal = Float.MAX_VALUE;
        int salId = 0;
        for (int i = 0; i < listWorkers.length; i++) {
            if (listWorkers[i] == null) {
                continue;
            }
            if (listWorkers[i].getDepartment() == department) {
                if (listWorkers[i].getCash() < minSal) {
                    minSal = listWorkers[i].getCash();
                    salId = i;
                }
            }
        }
        return listWorkers[salId];
    }


    public Employee findMaxSalaryInDep(int department) {
        float maxSal = Float.MIN_VALUE;
        int salId = 0;
        for (int i = 0; i < listWorkers.length; i++) {
            if (listWorkers[i] == null) {
                continue;
            }
            if (listWorkers[i].getDepartment() == department) {
                if (listWorkers[i].getCash() > maxSal) {
                    maxSal = listWorkers[i].getCash();
                    salId = i;
                }
            }
        }
        return listWorkers[salId];
    }

    public float calculateSalaryCostsInDep(int department) {
        float sum = 0f;
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            if (worker.getDepartment() == department) {
                sum += worker.getCash();
            }
        }
        return sum;
    }

    public float findMiddleSalaryInDep(int department) {
        int countWorkers = 0;
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            if (worker.getDepartment() == department) {
                countWorkers++;
            }
        }
        return calculateSalaryCostsInDep(department) / countWorkers;
    }

    public void modifiedSalariesInDepartment(float percent, int department) {
        float multiplayer = percent/100+1;
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            if (worker.getDepartment() == department) {
                worker.setCash(worker.getCash() * multiplayer);
            }
        }
    }

    public void printDepartment (int department) {
        System.out.println("\n" + "Department: " + department);
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            if (worker.getDepartment() == department) {
                System.out.println(worker);
            }
        }
        System.out.println();
    }

    public void findSalariesBelowThreshold(float threshold) {
        System.out.println("Зарплата выше порога: " + threshold);
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            if (worker.getCash() >= threshold) {
                System.out.println(worker.getFirstName() + " " + worker.getlastName() + " :Cash: " + worker.getCash() + " :Id: " + worker.getId());
            }
        }
        System.out.println();
    }

    public void findSalariesAboveThreshold(float threshold) {
        System.out.println("Зарплата ниже порога: " + threshold);
        for (Employee worker : listWorkers) {
            if (worker == null) {
                continue;
            }
            if (worker.getCash() < threshold) {
                System.out.println(worker.getFirstName() + " " + worker.getlastName() + " :Cash: " + worker.getCash() + " :Id: " + worker.getId());
            }
        }
        System.out.println();
    }

}
