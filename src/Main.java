public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1 и 2");
        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
}






