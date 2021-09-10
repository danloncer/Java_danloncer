package pro.sky.java.course1.lesson4;

public class Homework4 {
    public static void main(String[] args) {
        task1();

        task2();

        task3();

        task4();

        task5();

        //ЗАДАЧА 5
        //Сидел 30 минут и перепробывал много способов. Зашел даже в ворд и там сопоставлял переменные
        //0  1   1   2   3   5   8   13   21  34
        //n1 n2  n3  n1  n2  n3  n1  n2   n3  n1
        //И ведь я увидел в этом логику, но очень долго думал как написать это в виде кода
        //Решил попробовать данный способ после изучения алгоритма (как переменные друг друга заменяют)
        //И действительно помогло, можно сказать решение получил случайно в кодовом виде
        //Мне понравилась эта задача, особенно когда решение после долгих размышлений над задачей
        //Обрадовало меня правильным выводом

    }

    private static void task1() {
        System.out.println("Задача 1");
        System.out.print("\n");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.print("\n");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    private static void task2() {
        System.out.println("Задача 2");
        System.out.print("\n");
        int Friday = 6;
        for (int i = 1; i <= 31; i++) {
            if (i == Friday) {
                System.out.println("Сегодня пятница," + i + "-ое число. Необходимо подготовить отчет.");
                Friday = Friday +7;
            }
        }
        System.out.print("\n");
    }

    private static void task3() {
        System.out.println("Задача 3");
        System.out.print("\n");
        int year = 2021;
        int nextYear = year + 100;
        for ( int lastYear = year - 200; lastYear <= nextYear ; lastYear++) {
            if (lastYear % 79 == 0) {
                System.out.println(lastYear);
            }
        }
        System.out.print("\n");
    }

    private static void task4() {
        System.out.println("Задача 4");
        System.out.print("\n");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println(i + ":ping pong");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println(i +":ping");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println(i +":pong");
                continue;
            }
            System.out.println(i +":");
        }
        System.out.print("\n");
    }

    private static void task5() {
        System.out.println("Задача 5");
        System.out.print("\n");
        int num1 = 0;
        int num2 = 1;
        int num3;
        for (int i = 0; i<=3 ; i++) {
            num3 = num1 + num2;
            System.out.print(num1 + " " + num2 + " ");
            System.out.print(num3 + " ");
            num1 = num2 + num3;
            num2 = num1 + num3;
        }
        System.out.print("\n");
    }
}
