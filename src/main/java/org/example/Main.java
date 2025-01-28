package org.example;

import org.example.Lections.Lec1;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    // определить допустимый делитель для числа


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lec1 lec1 = new Lec1();

        System.out.println("Задайте число");
        String num = scanner.nextLine();
        System.out.println("Допустимые делители");
        System.out.println(Lec1.findAvailableDivided(Integer.parseInt(num)));
        System.out.println();

        System.out.println("Простые числа:");
        System.out.println(Lec1.findSimpleNumber(Integer.parseInt(num)));
        System.out.println();

        System.out.println("Фибоначчи: ");
        AtomicInteger counter = new AtomicInteger(0);
        System.out.println(Lec1.numberFib(Integer.parseInt(num), counter));
        System.out.println("Ряд Фибоначчи: ");
        System.out.println(Lec1.viewFib(Integer.parseInt(num)));
        System.out.println("Итераций в рекурсии: ");
        System.out.println(counter.get());

    }
}