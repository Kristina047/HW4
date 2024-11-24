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
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3");
        int year = 2021;
        if (year%4==0 || year%4 == 0 && year%100 !=0 || year%100==0 && year%400 ==0){
            System.out.println("Год является високосным");
        } else if (year < 1584){
            System.out.println( "Високосный год ввели только в 1584 году.");
        } else {
            System.out.println("Год не является високосным");
        }


        System.out.println("Задача 4");
        int deliveryDistance = 21;
        int deliveryTime = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else {
            System.out.println("Доставки нет");
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








