import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /// задание 1
    public static void leapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }
    public static void applicationVersion (int clientDeviceYear, int clientOS) {
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }

    }
    public static int theNumberOfDays (int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
            return deliveryDays;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays+=1;
            System.out.println("Потребуется дней: " + deliveryDays);
            return deliveryDays;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays);
            return deliveryDays;
        } else {
            System.out.println("Доставка недоступна на расстояние более 100 км");
            return deliveryDays;
        }

    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        leapYear(2024);
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        applicationVersion(currentYear, 0);
        System.out.println("Задача 3");
        theNumberOfDays(95);




    }
}