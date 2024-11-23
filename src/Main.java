public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1 и 2");

        int clientOs = 0;
        int clientDeviceYear = 2017;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if  (clientOs == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Ios по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        }
    }








