import java.time.LocalDate;

public class Main {

    //Задание 1
    private static boolean isLeapYear(int year) {
        return year > 1584 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    //Задание 2
    public static String checkOSVersion(char clientOS, int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case '0': // iOS
                if (yearOfIssue < currentYear) {
                    return "Установите облегченную версию приложения для iOS по ссылке";
                } else {
                    return "Установите версию приложения для iOS по ссылке";
                }
            case '1': // Android
                if (yearOfIssue < currentYear) {
                    return "Установите облегченную версию приложения для Android по ссылке";
                } else {
                    return "Установите версию приложения для Android по ссылке";
                }
            default:
                return "Неизвестная операционная система.";
        }
    }

    //Задание 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        int delivery = 1;
        if (deliveryDistance < 20) {
            return delivery;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return delivery + 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return delivery + 2;
        } else if (deliveryDistance >= 100) {
            return 0;
        }
        return 0;
    }


    public static void main(String[] args) {

        System.out.println("Задание 1");
        int year = 2021;
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задание 2");

        int currentYear = LocalDate.now().getYear();
        char clientOS = '1';
        int yearOfIssue = 2023;
        System.out.println(checkOSVersion(clientOS, yearOfIssue));

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
}
