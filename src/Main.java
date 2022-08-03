public class Main {
    public static void main(String[] args) {

        //Задание 1

        int ClientOS = 0;
        if (ClientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (ClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2

        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && ClientOS == 0) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && ClientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && ClientOS == 1) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && ClientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Задание  3

        int year = 2024;
        boolean yearVis = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if(yearVis){
            System.out.println("Год является високосным");
        }else {
            System.out.println("Год не является високосным");
        }

        //Задание 4

        int deliveryDistance = 5;
        int srok =1;
        if(deliveryDistance <=20) srok =1;{
            if(deliveryDistance>=20 && deliveryDistance<60) srok=srok+1;
            if(deliveryDistance>=60 && deliveryDistance <100) srok=srok+2;
        }

        if (deliveryDistance <=20 )  {
            System.out.println("Потребуется дней: "  + srok);
        } if(deliveryDistance >=20 && deliveryDistance <60 )  {
            System.out.println("Потребуется дней:  "+ srok);
        } if(deliveryDistance >=60 && deliveryDistance<100){
            System.out.println("Потребуется дней:  "+srok);
        }

        //Задание 5

        int monthNumber = 5;
                switch (monthNumber ){
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Весна");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Осень");
                        break;
                    default:
                        System.out.println("Такого месяца нет");

                }
    }
    }


