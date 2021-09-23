package pro.sky.java.course1.lesson2;

public class Homework2 {

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
        System.out.println("Целочисленные выражения:");
        byte a1 = 1;
        System.out.println("1. a = " + a1);
        short b1 = 5;
        System.out.println("2. b = " + b1);
        int c1 = 100000;
        System.out.println("3. c = " + c1);
        long d1 = 56895135L;
        System.out.println("4. d = " + d1);
        System.out.println(" ");

        //Дробные переменные (С плавающей запятой)

        System.out.println("С плавающей запятой");
        float e1 = 0.005f;
        System.out.println("1. e = " + e1);
        double f1 = 0.777777777;
        System.out.println("2. f = " + f1);
        System.out.println(" ");

        //Логические переменные

        System.out.println("Логические выражения");
        boolean comparison = true; //При запуске инсталлятора и выведении значения будет выдавать True
        System.out.println(comparison);
        System.out.println(" ");

        //Символы

        System.out.println("Символы");
        char symbol = 33;
        System.out.println("symbol = " + symbol);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task2() {
        System.out.println("Задача 2");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        float weightFirstMember = 78.2f;
        float weightSecondMember = 82.7f;
        float totalWeight = weightFirstMember + weightSecondMember;
        System.out.println("Общий вес спортсменов " + totalWeight + " кг");
        float differenceWeight = weightSecondMember - weightFirstMember;
        System.out.println("Разница в весе спортсменов " + differenceWeight + " кг");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task3() {
        System.out.println("Задача 3");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int bananasCount = 5;
        int bananaWeight = 80;
        int totalWeightBananas = bananasCount * bananaWeight;
        System.out.println("Вес бананов = " + totalWeightBananas + " гр"); //Вес бананов


        int milkValue = 200; //Миллилитры
        int milkWeight = 105; //Граммы
        int totalMilkWeight = (milkValue / 100) * milkWeight; //Перевод в граммы
        System.out.println("Вес молока = " + totalMilkWeight + " гр"); //Вес молока

        int iceCreamCount = 2;
        int iceCreamWeight = 100;
        int totalWeightIceCream = iceCreamCount * iceCreamWeight;
        System.out.println("Вес мороженого = " + totalWeightIceCream + " гр"); //Вес мороженого

        int eggsCount = 4;
        int eggWeight = 70;
        int totalEggsWeight = eggsCount * eggWeight;
        System.out.println("Вес яиц программиста = " + totalEggsWeight + " гр"); //Вес яиц в граммах

        System.out.println(" ");
        double totalBreakfastWeight = totalWeightBananas + totalMilkWeight + totalWeightIceCream + totalEggsWeight;
        System.out.println("Вес всего в граммах = " + totalBreakfastWeight); //Вес в граммах
        System.out.println(" ");
        double weightOnKg = totalBreakfastWeight / 1000;
        System.out.println("Вес всего в килограммах = " + weightOnKg); //Вес в килограммах
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task4() {
        System.out.println("Задача 4");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int wasteWeightOnKg = 7;
        int gramsInKg = 1000;
        double wasteWeightOnGr = wasteWeightOnKg * gramsInKg;
        double missingWeight1 = 250;
        double countDays1 = wasteWeightOnGr / missingWeight1;
        System.out.println("Если спортсмен будет сбрасывать каждый день по 250 грамм, то ему понадобится " + countDays1 + " дней");
        System.out.println(" ");

        double missingWeight2 = 500;
        double countDays2 = wasteWeightOnGr / missingWeight2;
        System.out.println("Если спортсмен будет сбрасывать каждый день по 500 грамм, то ему понадобится " + countDays2 + " дней");
        System.out.println(" ");

        double meanValue = (countDays1 + countDays2) / 2;
        System.out.println("Среднее кол-во дней для похудения равно " + meanValue);
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task5() {
        System.out.println("Задача 5");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        double mashaWage = 67760;
        double percent = 10;
        percent = (percent / 100) + 1;
        double mashaWageAfterUp = mashaWage * percent;
        double differenceWages1 = (mashaWageAfterUp - mashaWage) * 12;
        System.out.println("Маша теперь получает " + mashaWageAfterUp + " рублей." + "Годовой доход вырос на " + differenceWages1 + " рублей");
        System.out.println(" ");

        double denisWage = 83690;
        double denisWageAfterUp = denisWage * percent;
        double differenceWages2 = (denisWageAfterUp - denisWage) * 12;
        System.out.println("Денис теперь получает " + denisWageAfterUp + " рублей." + "Годовой доход вырос на " + differenceWages2 + " рублей");
        System.out.println(" ");

        double kristinaWage = 76230;
        double kristinaWageAfterUp = kristinaWage * percent;
        double differenceWages3 = (kristinaWageAfterUp - kristinaWage) * 12;
        System.out.println("Кристина теперь получает " + kristinaWageAfterUp + " рублей." + "Годовой доход вырос на " + differenceWages3 + " рублей");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task6() {
        System.out.println("Задача 6");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println("result = " + result + " это результат выражения");
        result = -result;
        System.out.println("result = " + result + " это противоположный результат");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task7() {
        System.out.println("Задача 7");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int g = 5;
        System.out.println("g = " + g + " это число до математический манипуляций");
        int h = 7;
        System.out.println("h = " + h + " это число до математический манипуляций");
        System.out.println(" ");
        g = g + h; //g=5+7=12
        h = g - h; //h=12-7=5
        g = g - h; //g=12-5=7
        System.out.println("g = " + g + " это число после математический манипуляций");
        System.out.println("h = " + h + " это число после математический манипуляций");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }

    private static void task8() {
        System.out.println("Задача 8");
        System.out.println(); // Отступ для облегчения читаемости в консоле
        int j = 278;
        System.out.println("j = " + j + " трехзначное число");
        j = j % 100 / 10;
        System.out.println("j = " + j + " средняя цифра");
        System.out.println(); // Отступ для облегчения читаемости в консоле
    }
}

