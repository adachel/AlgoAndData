package org.example.Seminars;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sem1 {

    public Sem1() {
    }

    // найти сумму всех чисел до числа N
    public int sum(int number){
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result = result + i;
        }
        return result;
    }

    // найти простые числа
    public List<Integer> simpleNumbers(int num){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 2; i <= num; i++) {
            Boolean flug = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flug = false;
                }
            }
            if (flug){
                result.add(i);
            }
        }
        return result;
    }

    // найти кол-во комбинаций у k - кубиков с n - граней
    public int combinations1(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n ; j++) {
                for (int k = 1; k <=n ; k++) {
                    for (int l = 1; l <=n ; l++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int combinations2(int k, int n){
        if (k > 0){
            return combinations2_rec(1, k, n);
        }
        return 0;
    }

    // где h - глубина рекурсии, какой номер кубика по-порядку рассматриваем
    // где к - кол-во кубиков
    // где n - кол-во граней
    private int combinations2_rec(int h, int k, int n){
        if (h == k + 1){
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            count += combinations2_rec(h + 1, k, n);
        }
        return count;
    }


    // найти число фибоначчи рекурсивно
    public int fibo_rec(int num){
        if (num == 1)
            return 1;
        if (num == 2)
            return 1;
        return fibo_rec(num - 1) + fibo_rec(num - 2);
    }

    public int fibo_line(int num){
        int[] numbers = new int[num];
        numbers[1] = 1;
        numbers[2] = 2;
        for (int i = 3; i < num ; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[numbers.length - 1];
    }

    public void getTimeRecursion(int number){
        Date start = new Date();
        fibo_rec(number);
        Date end = new Date();
        long time_rec = end.getTime() - start.getTime();

        start = new Date();
        fibo_line(number);
        end = new Date();
        long time_line = end.getTime() - start.getTime();

        System.out.println("Время рекурсивной ф-цци: " + time_rec / 1000 + " cek");
        System.out.println("Время линейной ф-цци: " + time_line / 1000 + " cek");
    }
}



