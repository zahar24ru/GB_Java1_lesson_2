package gbJava1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int qN;
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш никнейм");
        name = scan.nextLine();
        System.out.println(" Отлично " + name + " какое задание будем проверять 1-2-3-4-5 \n Если хотите выбрать все по порядку цифра 6");
        qN = scan.nextInt();

        switch (qN) {
            case 1:
                questionNumber1();
                break;
            case 2:
                questionNumber2();
                break;
            case 3:
                questionNumber3();
                break;
            case 4:
                questionNumber4();
                break;
            case 5:
                questionNumber5();
                break;
            case 6:
                questionNumber1();
                questionNumber2();
                questionNumber3();
                questionNumber4();
                questionNumber5();
                break;
            default:
                System.out.println("Что-то пошло не так O_o");
        }
        System.out.println("Вот и всё " + name);
    }

    static void questionNumber1() {

        System.out.println(" 1. Написать метод, принимающий на вход \n два целых числа и проверяющий, что их сумма \n лежит  в пределах от 10 до 20 (включительно),\n если да – вернуть true, в противном случае – false.");
        int a1, b1, sum1;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("################################################################");
        System.out.println("Введите первое число");
        a1 = scan1.nextInt();
        System.out.println("Введите второе число");
        b1 = scan1.nextInt();
        sum1 = a1 + b1;
        System.out.println(a1 + " + " + b1 + " получается " + sum1);
        if (sum1 >= 10 && sum1 <= 20) {
            System.out.println("Всё ок");
        } else {
            System.out.println("Не ок");
        }
    }

    static void questionNumber2() {

        System.out.println(" 2. Написать метод, которому в \n качестве  параметра передается целое \n число, метод должен напечатать в консоль,\n положительное ли число передали или отрицательное. \n Замечание: ноль считаем положительным числом.");
        System.out.println("################################################################");
        int a2;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите число");
        a2 = scan2.nextInt();
        boolean bool2 = (a2>=0);
        if (bool2) {
            System.out.println(a2 + " Неотрицательное число");
        }
        if (!bool2) {
            System.out.println(a2 + " Отрицательное число");
        }

    }

    static void questionNumber3() {

        System.out.println(" 3. Написать метод, которому в качестве параметра передается целое число. \n Метод должен вернуть true, если число отрицательное, \n и вернуть false если положительное.");
        System.out.println("################################################################");
        int a3;
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите число");
        a3 = scan3.nextInt();
        boolean bool3 = (a3 < 0);
        if (bool3) {
            System.out.println(a3 + " Отрицательное число тру");
        } else {
            System.out.println(a3 + " Положительное число не тру");
        }


    }


    static void questionNumber4() {

        System.out.println("4. Написать метод, которому в качестве аргументов передается \n строка и число, метод должен отпечатать в консоль указанную строку, \n указанное количество раз;");
        System.out.println("################################################################");
        String line4;
        int a4;
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Введите текст");
        line4 = scan4.nextLine();
        System.out.println("Сколько раз его напечатать");
        a4 = scan4.nextInt();
        for (int i = 0; i < a4; i++) {
            System.out.println(line4);
        }
        System.out.println("Текст: " + line4 + " напечатан " + a4 + " раз.");

    }

    static void questionNumber5() {
        System.out.println("5. Написать метод, который определяет, является ли год високосным, \n и возвращает boolean (високосный - true, не високосный - false). \n Каждый 4-й год является високосным, кроме каждого 100-го,\n при этом каждый 400-й – високосный.");
        System.out.println("#################### Взято из https://overcoder.net/ ########################");
        int year;
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Введите год");
        year = scan5.nextInt();

        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " Високосный  год.");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " Високосный  год.");
        } else {
            System.out.println(year + " Не високосный  год.");
        }
    }


}
