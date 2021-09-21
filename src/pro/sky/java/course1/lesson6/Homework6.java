package pro.sky.java.course1.lesson6;

public class Homework6 {
    public static void main(String[] args) {
        task1();

        task2();

        task3();

        task4();

        task5();

        task6();

        task7();

        task8();
    }

    private static void task1() {
        System.out.println("Задача 1");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich";
        String fullName = middleName + firstName + lastName;
        System.out.println("ФИО сотрудника – " + fullName);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task2() {
        System.out.println("Задача 2");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullName);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task3() {
        System.out.println("Задача 3");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела – " + fullName);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task4() {
        System.out.println("Задача 4");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        String fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника – " + fullName);
        } else {
            System.out.println("Данные ФИО сотрудника – " + fullName);
        }
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task5() {
        System.out.println("Задача 5");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(fullName.indexOf(' '), fullName.lastIndexOf(' '));
        String lastName = fullName.substring(fullName.lastIndexOf(' '));
        String middleName = fullName.replace(lastName, "");
        middleName = middleName.replace(firstName, "");
        System.out.println("Имя сотрудника –" + firstName);
        System.out.println("Фамилия сотрудника – " + middleName);
        System.out.println("Отчество сотрудника –" + lastName);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task6() {
        System.out.println("Задача 6");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        String fullName = "ivanov ivan ivanovich";
        char[] symbols = fullName.toCharArray();
        symbols[0] = Character.toUpperCase(symbols[0]);
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ' ') {
                symbols[i + 1] = Character.toUpperCase(symbols[i + 1]);
            }
        }
        fullName = new String(symbols);
        System.out.println("Верное написание ФИО сотрудника с заглавных букв – " + fullName);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task7() {
        System.out.println("Задача 7");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        String first = "135";
        String second = "246";
        StringBuilder third = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            third.append(first.charAt(i));
            third.append(second.charAt(i));
        }
        System.out.println(third);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

        private static void task8() {
            System.out.println("Задача 8");
            System.out.println(); // Отступ для облегчения читаемости в консоле
            String letters = "aabccddefgghiijjkk";
            for (int i = 0; i < letters.length(); i++) {
                for (int j = i + 1; j < letters.length(); j++) {
                    if (letters.charAt(i) == letters.charAt(j)) {
                        System.out.print(letters.charAt(i));
                    }
                }
            }
            System.out.println(); // Отступ для облегчения читаемости в консоле
    }
}