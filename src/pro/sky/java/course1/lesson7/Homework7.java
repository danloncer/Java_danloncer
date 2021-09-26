package pro.sky.java.course1.lesson7;

import java.time.LocalDate;
import java.util.Arrays;

public class Homework7 {


    public static void defineYearLimp(int year){
        boolean yearIsLimp = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (yearIsLimp) {
            System.out.println(year + " - високосный год");
            System.out.println(); // Отступ для облегчения читаемости в консоле
            return;
        }
        System.out.println(year + " - невисокосный год");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }


    public static void defineOsVersion(int OS, int year) {
        int nowYear = LocalDate.now().getYear();
        if (OS == 1) {
            if (year < nowYear) {
                System.out.println("Установите Lite-версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (year < nowYear) {
                System.out.println("Установите Lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }


    public static int defineDaysOfDelivery(int distance) {
        int deliveryDays = 1; // minDeliveryDays

        if (distance >= 20) {
            deliveryDays++;
        }
        if (distance >= 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }


    public static void findDoubleSymbols(String problemString) {
        for (int i = 0; i < problemString.length(); i++) {
            for (int j = i + 1; j < problemString.length(); j++) {
                if (problemString.charAt(i) == problemString.charAt(j)) {
                    System.out.print("В строке "+ "<" + problemString + ">" + " найден дубль: " + problemString.charAt(i));
                    return;
                }
            }
        }
        System.out.print("В строке нет дублей");
    }


    public static void doReverseMassive(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static int findSummaElementsOfArray(int [] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }


    public static float findMiddleMeaning(int [] arr) {
        float sum = findSummaElementsOfArray(arr);
        return sum/arr.length;
    }


    public static void main(String[] args) {
        task1();

        task2();

        task3();

        task4();

        task5();

        task6();
    }

    private static void task1() {
        System.out.println("Задача 1");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        defineYearLimp(2004);
        defineYearLimp(2005);
        System.out.println("В первом случае год високосный");
        System.out.println("Во втором случае год невисокосный");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task2() {
        System.out.println("Задача 2");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        defineOsVersion(1, 2021);
        defineOsVersion(1, 2018);
        defineOsVersion(0, 2021);
        defineOsVersion(0, 2018);
        System.out.println("В первом случае iOs и Default версия сайта");
        System.out.println("Во втором случае iOs и Lite версия сайта");
        System.out.println("В третьем случае Android и Default версия сайта");
        System.out.println("В четвертом случае Android и Lite версия сайта");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task3() {
        System.out.println("Задача 3");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int deliveryDays = defineDaysOfDelivery(60);
        System.out.println("Доставка будет через " + deliveryDays);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task4() {
        System.out.println("Задача 4");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        findDoubleSymbols("aabccddefgghiijjkk");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task5() {
        System.out.println("Задача 5");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int[] symbols = {3, 2, 1, 6, 5};
        doReverseMassive(symbols);
        System.out.println(Arrays.toString(symbols));
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task6() {
        System.out.println("Задача 6");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int[] arr = generateRandomArray();
        float middleMeaning = findMiddleMeaning(arr);
        System.out.println("Среднее значение " + middleMeaning);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }
}
