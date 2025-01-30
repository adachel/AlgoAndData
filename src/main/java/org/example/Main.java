package org.example;

import org.example.Lections.Lec1;
import org.example.Lections.Lec2;
import org.example.Seminars.Sem1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    // определить допустимый делитель для числа


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Задайте число");
//        int num = Integer.parseInt(scanner.nextLine());
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Lec1 lec1 = new Lec1();
//        System.out.println("Допустимые делители");
//        System.out.println(lec1.findAvailableDivided(num));
//        System.out.println();
//
//        System.out.println("Простые числа:");
//        System.out.println(lec1.findSimpleNumber(num));
//        System.out.println();
//
//        System.out.println("Фибоначчи: ");
//        AtomicInteger counter = new AtomicInteger(0);
//        System.out.println(lec1.numberFib(num, counter));
//        System.out.println("Ряд Фибоначчи: ");
//        System.out.println(lec1.viewFib(num));
//        System.out.println("Итераций в рекурсии: ");
//        System.out.println(counter.get());
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Sem1 sem1 = new Sem1();
//        System.out.println("Сумма: " + sem1.sum(num));
//        System.out.println("Простые числа: " + "\n" + sem1.simpleNumbers(num));
//        System.out.println("Задайте число кубиков");
//        int k = Integer.parseInt(scanner.nextLine());
//        System.out.println("Задайте число граней");
//        int n = Integer.parseInt(scanner.nextLine());

//        System.out.println("Кол-во комбинаций вариант для 4: " + sem1.combinations1(n));
//        System.out.println("Кол-во комбинаций вариант для пользовательского количества: " + sem1.combinations2(k, n));
//        System.out.println("Задайте число");
//        int num = Integer.parseInt(scanner.nextLine());
//        System.out.println("Фибоначчи числа " + num + " = " + sem1.fibo_rec(num));
//        System.out.println("Фибоначчи числа " + num + " = " + sem1.fibo_line(num));
//        sem1.getTimeRecursion(num);
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Lec2 lec2 = new Lec2();
        int[] myArray = new int[]{5, 3, 7, 1, 9, 2, 4, 6, 0, 8};
//        lec2.bubbleSort(myArray);
//        lec2.directSort(myArray);
//        lec2.insertSort(myArray);
//        lec2.quickSort(myArray, 0, myArray.length - 1);
        lec2.heapSort(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println(lec2.binarySearch(myArray, 7, 0, myArray.length - 1));





    }
}