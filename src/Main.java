import java.time.Year;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1() {
        System.out.println("Задача №1");
        System.out.println();
        int month = 0;
        int salary = 15000;
        int total = 0;
        while (total < 2_590_000) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(" ");
    }

    private static void task2() {
        System.out.println("Задача №2");
        System.out.println();
        int number = 1;
        while (number <= 10) {
            number = number;
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }

    private static void task3() {
        System.out.println("Задача №3");
        System.out.println(" ");
        int year = 0;
        int totalPeople = 12_000_000;
        int bornInYear = totalPeople / 1000 * 17;
        int diedInYear = totalPeople / 1000 * 8;
        int differentPeople = 0;
        int totalAll = 0;
        for (year = 1; year <= 10; year++) {
            differentPeople = bornInYear - diedInYear;
            totalAll = differentPeople + totalAll;
            System.out.println("За " + year + " год, численность населения увеличится на " + totalAll);
        }
        System.out.println(" ");
    }

    private static void task4() {
        System.out.println("Задача №4");
        System.out.println(" ");
        int sumMoney = 15000;
        int month = 1;
        int total = 0;
        for (; total < 12000000; month++) {
            total = total + total / 100 * 7;
            total = total + sumMoney;
            System.out.println("За " + month + " месяцев Василий накопит " + total);
        }
        System.out.println(" ");
    }
    private static void task5() {
        System.out.println("Задача №5");
        System.out.println(" ");
        int sumMoney = 15000;
        int month = 1;
        int total = 0;
        for (; total < 12000000; month++) {
            total = total + total / 100 * 7;
            total = total + sumMoney;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяцев Василий накопит " + total);
            }
        }
        System.out.println(" ");
    }
    private static void task6() {
        System.out.println("Задача №6");
        System.out.println(" ");
        int sumMoney = 15000;
        int month = 1;
        int total = 0;
        for (; month < 9*12; month++) {
            total = total + total / 100 * 7;
            total = total + sumMoney;
            if (month % 6 == 0) {
                System.out.println("За " + month + " месяцев Василий накопит " + total);
            }
        }
        System.out.println(" ");
    }
    private static void task7(){
        System.out.println("Задача №7");
        System.out.println(" ");
        for (int friday = 5; friday <= 31; friday = friday + 7){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println(" ");
    }
    private static void task8(){
        System.out.println("Задача №8");
        System.out.println(" ");
       for (int year = 2022-200; year<2022+79;year++) {
           if (year % 79 == 0) {
               System.out.println("Комета прилетит в " + year + " году.");
           }
       }
        System.out.println(" ");
    }
    private static void task9(){
        System.out.println("Задача №9");
        System.out.println(" ");
        int a = 2;
        for (int b = 1; b <= 10; b++){
            System.out.println(a + " * " + b + " = " + a*b);
        }

    }
}

