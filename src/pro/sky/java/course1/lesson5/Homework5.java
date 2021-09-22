package pro.sky.java.course1.lesson5;

import java.util.Arrays;

public class Homework5 {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        task1();

        task2();

        task3();

        task4();

        task6();

        task7();

        task8();

        task9();
    }

    private static void task1() {
        System.out.println("Задача 1");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task2() {
        System.out.println("Задача 2");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int[] arr = generateRandomArray();
        Arrays.sort(arr);
        System.out.println("Минимальное значение " + arr[0] + " рублей");
        System.out.println("Максимальное значение " + arr[arr.length - 1] + " рублей");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task3() {
        System.out.println("Задача 3");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i: arr) {
            sum += i;
        }
        double middleSum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleSum + " рублей");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task4() {
        System.out.println("Задача 4");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName);
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[reverseFullName.length-1-i]);
        }
        System.out.println(); // Отступ для облегчения читаемости в консоле
        System.out.println(); // Отступ для облегчения читаемости в консоле


    }

    private static void task6() {
        System.out.println("Задача 6");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int [] massive = {5, 4, 3, 2, 1};
        int [] reverseMassive = new int[massive.length];
        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            reverseMassive[i] = massive[massive.length-1-i];
        }
        System.out.println(Arrays.toString(reverseMassive));
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task7() {
        System.out.println("Задача 7");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int[] numbers = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length/2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task8() {
        System.out.println("Задача 8");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + "  " + arr[j]);
                    break;
                }
            }
        }
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task9() {
        System.out.println("Задача 9");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + "  " + arr[j]);
                }
            }
        }
    }

}

