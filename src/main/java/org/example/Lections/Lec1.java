package org.example.Lections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Lec1 {

    public Lec1() {
    }

    public List<Integer> findAvailableDivided(int number){
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            counter++;
            if (number % i == 0){
                result.add(i);
            }
        }
        System.out.println("кол-во операций: " + counter);
        return result;
    }

    // поиск простых чисел в списке допустимых делителей (то, кот делится только на 1 и себя)
    public List<Integer> findSimpleNumber(int number){
        int counter = 0;
        List<Integer> availableDivided = findAvailableDivided(number);
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 0; i < availableDivided.size(); i++) {
            int count = 0;
            for (int j = 1; j <= availableDivided.get(i) + 1; j++) {
                counter++;
                int x = availableDivided.get(i);
                if (availableDivided.get(i) % j == 0){
                    count = count + 1;
                }
            }
            if (count == 2){
                result.add(availableDivided.get(i));
            }
        }
        System.out.println("кол-во операций: " + counter);
        return result;
    }

    // поиск чисел Фибоначчи через рекурсию
    public int numberFib(int num, AtomicInteger counter){
        counter.incrementAndGet();
        if (num == 1){
            return 0;
        }
        if (num == 2){
            return 1;
        }
        return (numberFib(num - 1, counter) + numberFib(num - 2, counter));
    }

    public List<Integer> viewFib(int num){
        List<Integer> result = new ArrayList<>();
        AtomicInteger counter = new AtomicInteger(0);
        for (int i = 1; i <= num; i++) {
            result.add(numberFib(i, counter));
        }
        return result;
    }
}
