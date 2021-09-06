package pro.sky.java.course1.lesson3;

public class Homework3 {
    public static void main(String[] args) {

        task1();

        task2();

        task3();

        task4();

        task5();

        task6();

        task7();

    }


    private static void task7() {
        System.out.println("Задача 7");
        System.out.println(" "); // Отступ для облегчения читаемости в консоле
        int age = 25;
        double salary = 60_000;
        double wantedSum = 330_000;
        double theResultingSum = 0;
        double percent = 10;
        int countMonth = 12;
        double monthlyFee;
        double maxEveryMonthPay;
        if (age < 23) {
            percent += 1;
            if (salary > 80_000) {
                percent -= 0.7;
            }
        } else if (age < 30 && age >= 23) {
            percent += 0.5;
            if (salary > 80_000) {
                percent -= 0.7;
            }
        }
        System.out.println("Ваша ставка равна " + percent);
        theResultingSum = wantedSum + wantedSum / 100 * percent;    //Получившаяся сумма кредита
        System.out.println("Всего вы заплатите " + theResultingSum + " рублей"); //Всего потратит
        monthlyFee = theResultingSum / countMonth;      //Ежемесячный платеж
        System.out.println("В месяц вы будете платить " + monthlyFee + " рублей"); //Ежемесячный платеж
        maxEveryMonthPay = salary / 2;      //Максимальный платеж
        System.out.println("Максимальный ежемесячный платеж, считая вашу зарплату " + maxEveryMonthPay + " рублей");
        if (maxEveryMonthPay < monthlyFee) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxEveryMonthPay + " рублей." + " Платеж по кредиту " + monthlyFee + " рублей." + " Отказано.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxEveryMonthPay + " рублей." + " Платеж по кредиту " + monthlyFee + " рублей." + " Одобрено.");
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        System.out.println(" "); // Отступ для облегчения читаемости в консоле
        double limit = 0;
        int age = 19;
        double salary = 58_000;
        double percent = 1.2;
        double percent1 = 1.5;
        if (age > 23) {
            limit = salary * 3;
            if (salary > 80_000) {
                limit = limit * percent1;
            } else if (salary > 50_000) {
                limit = limit * percent;
            }
        } else {
            limit = salary * 2;
            if (salary > 80_000) {
                limit = limit * percent1;
            } else if (salary > 50_000) {
                limit = limit * percent;
            }
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
        }
    }
        private static void task5 () {
            System.out.println("Задача 5");
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
            int monthNumber = 12;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Now is winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Now is spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Now is summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("И СНОВА ТРЕТЬЕ СЕНТЯБРЯ");
                    break;
            }
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
        }

        private static void task4 () {
            System.out.println("Задача 4");
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
            int deliveryDistance = 95;
            int deliveryDays = 1; // minDeliveryDays

            if (deliveryDistance >= 20) {
                deliveryDays++;
            }
            if (deliveryDistance >= 60) {
                deliveryDays++;
            }
            System.out.println("Доставка будет через " + deliveryDays);
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
        }

        private static void task3 () {
            System.out.println("Задача 3");
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
            int year = 2896;
            boolean yearIsLimp = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
            if (yearIsLimp) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
        }

        private static void task2 () {
            System.out.println("Задача 2");
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
            int clientOS = 1; // Android = 1   ;   iOS = 0
            int clientDeviceYear = 2015; // Год выпуска устройства
            if (clientOS == 0) {
                if (clientDeviceYear < 2019) {
                    System.out.println("Установите Lite-версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            } else {
                if (clientDeviceYear < 2019) {
                    System.out.println("Установите Lite-версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
        }

        private static void task1 () {
            System.out.println("Задача 1");
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
            int clientOS = 1; // Android = 1   ;   iOS = 0
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            System.out.println(" "); // Отступ для облегчения читаемости в консоле
        }
    }
