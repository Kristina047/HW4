public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1 и 2");

        int clientOs = 0;
        int clientDeviceYear = 2017;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Ios по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3");
        int year = 2019;
        boolean isLeapYear = year % 400 == 0 || year % 4 == 0;
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 4");
        int deliveryDistance = 115;
        int numberDays = deliveryDistance / 20;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + numberDays + " для доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + numberDays + " для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + numberDays + " для доставки");
        } else {
            System.out.println("Доставка не осуществляется");
        }

        System.out.println("Задача 5");
        int monthNumber = 9;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого времени года  не существует");
        }
    }
}








