package org.example;

import java.sql.SQLOutput;
import java.sql.Savepoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1 do 10: ");
//        int nubmer;
//        int number = sc.nextInt();
//        System.out.println("number " + number);
//
        //1. Вывести квадрат числа

        int number;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number ");
        number = num.nextInt();

        int result = number * number;
        System.out.println(result);


        // 2.По двум заданным числам проверять является ли первое квадратом второго
        /*double num;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num ");
        num = sc.nextDouble();
        System.out.print("Enter num2 ");
        num2 = sc.nextDouble();
        double result = num2 * num2;
        if (num == result) {
            System.out.println("yes");
        }else System.out.println("no");
          }
       */
/*
        int m = 4;
        m +=5;
        System.out.println(m);
        int d = 6;
        d *=5;
        System.out.println(d);
        int w = 8;
        w -= 6;
        System.out.println(w);
        int q = 2;
        q /= 2;
        System.out.println(q);
*/
        //============================================ Оператор fi =====================================================
        /* Задача 1
        int number;
        System.out.println("enter number " );
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int result = number + number;
        System.out.println(result);
        */
        /* Вывод числа от 1 до 4
        System.out.println("Введите число от 1 2 3 и 4 ");
        Scanner number = new Scanner(System.in);
        int i = number.nextInt();
        if (i==1) {
            System.out.println("Number true");
        } else if (i==2) {
            System.out.println("Number true");
        } else if (i==3) {
            System.out.println("Number true");
        } else if (i==4) {
            System.out.println("Number true");
        }else {
            System.out.println("Number folse");
        }

         */
        //Задача2 Необходимо написать программу, где бы пользователю предлагалось ввести число
        // 1. Если пользователь ввёл число 1, программа должна вывести сообщение:
        // "Вы ввели число 1".
        // Если пользователь ввёл другое число, программа должна вывести такое сообщение:
        // "Вы ввели число не равное 1"
        /*
        System.out.println("Enter number 1");
        Scanner sc = new Scanner(System.in);
        int i = 1;
        i = sc.nextInt();
        if (i==1) {
            System.out.println("Yuo enter number 1");
        } else {
            System.out.println("You entered the wrong number");
        }
        */

        //Задача 3 Необходимо написать программу, где бы пользователю предлагалось ввести число  1.
        // Если пользователь ввёл число 1, программа должна вывести сообщение: "Вы ввели число 1".
        // Если пользователь ввёл другое число, программа вообще ничего не должна делать.
       /*
        System.out.println("enter number 1");
        Scanner num = new Scanner(System.in);
        int i = num.nextInt();
        if (i == 1) {
            System.out.println("Yuo enter number 1");
        }
        */
        //============================================ Оператор swich =====================================================

        // Task1 Попросить пользователя ввести числа 1 2 3 и 4
        /*
        System.out.println("Введите чесло 1 2 3 и 4");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        switch (number) {
            case 1:
                System.out.println("Enter number 1");break;
            case 2:
                System.out.println("Enter number 2");break;
            case 3:
                System.out.println("Enter number 3");break;
            case 4:
                System.out.println("Enter number 4");break;
            case 5:
                System.out.println("Enter number folse");break;
        }
        //break - рограмма прекращает выполнять код и выходит из условного оператора.
        */
        //=============================================== Циклы =======================================================
        // Цикл § while §
        //Task 1 Вывести числа в консоль от 100 90 80 70 60 50 40 30 20 10
        /*
        int i = 100;
        while (i>=10){
            System.out.println("Обратный отчет:" + i);
            i -=10;
    }
        */

    }
}

