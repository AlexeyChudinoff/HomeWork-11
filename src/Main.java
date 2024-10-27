import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    System.out.println("task1");
    int yearV = 2024;
    visokosYear(yearV);

    System.out.println("task2");
    int yearPone = 2020;
    int oS = 0;
    SettingOs(yearPone, oS);

    System.out.println("task3");
    int kmDistanse = 95;
    deleveryDay(kmDistanse);

  }

  public static void deleveryDay(int kmDistanse) {
    int deliveryDistance = kmDistanse;
    int delyveryTimes = 1;
    if (deliveryDistance < 20) {
      System.out.println("Срок доставки : " + delyveryTimes + " день");
    } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
      System.out.println("Срок доставки : " + (delyveryTimes + 1) + " дня");
    } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
      System.out.println("Срок доставки : " + (delyveryTimes + 2) + " дня");
    } else {
      System.out.println("извините, доставка не осуществляется");
    }
  }



  public static void SettingOs(int yearPone, int oS) {
    int clientOs = oS;
    int currentYear = LocalDate.now().getYear();
    int clientDeviceYear = yearPone;
    switch (clientOs) {
      case 0:
        if (clientDeviceYear >= currentYear) {
          System.out.println("Установите версию приложения для IOS по ссылке:");
        } else {
          System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        }
        break;
      case 1:
        if (clientDeviceYear >= currentYear) {
          System.out.println("Установите версию приложения для Android по ссылке:");
        } else {
          System.out.println("Установите облегченную версию приложения для Android по ссылке:");
        }
        break;
      default:
        System.out.println("Такая OS  не поддерживается ");
    }
  }

  public static void visokosYear(int yearV) {
    int ferstVisokosYear = 1584;
    int year = yearV;
    if (year < ferstVisokosYear) {
      System.out.println("Система исчисления високосности ещё не применялась");
    } else if (year % 4 != 0) {
      System.out.println(" не високосный год не делится на 4");
    } else if (year % 400 == 0) {
      System.out.println(" високосный год (делится на 400)");
    } else if (year % 100 == 0) {
      System.out.println(
          " не високосный год (делится на 100, но не на 400)");
    } else {
      System.out.println(
          " високосный (не делится на 100, но делится на 4)");
    }
  }


}
