package org.example.Seminars;

import java.util.Random;

public class Sem2 {
    public Sem2() {
    }

    public int[] createArray(int coun){
        Random random = new Random();
        int[] array = new int[coun];
        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(1000);
            array[i] = (int)(Math.random() * 1000); // вариант без класса Random
        }
        return array;
    }

    public int[] bubbleSortSimpleVar(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public int[] bubbleSortTeacherVar(int[] array){
        boolean needSort = true;
        do {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = true;
                }
            }
        }while (needSort);
        return array;
    }

    // быстрая сортировка
    public int[] quickSort(int[] array){
        return quickSortPrivate(array, 0, array.length - 1);
    }
    private int[] quickSortPrivate(int[] array, int left, int right){    // O(nlog(n))
        int i = left;
        int j = right;
        int pivot = array[(left + right) / 2];
        do {
            while (array[i] < pivot){
                i++;
            }
            while (array[j] > pivot){
                j--;
            }
            if (i <= j){
                if (i < j){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                i++;
                j--;
            }
        }while (i <= j);
        if (left < j){
            quickSortPrivate(array, left, j);
        }
        if (i < right){
            quickSortPrivate(array, i, right);
        }
        return array;
    }

    // бинарный поиск
    public Integer binarySearch(int[] array, int value){  // O(log(n))
        int count = 0; // для подсчета кол-ва итераций
        int left = 0;
        int right = array.length - 1;

        while (right - left > 1){
            int mid = (left + right) / 2;
            if (array[mid] < value){
                left = mid;
            }else
                right = mid;

            count++;
        }
        if (array[left] == value){
            System.out.println(count);
            return left;
        }
        if (array[right] == value){
            System.out.println(count);
            return right;
        }

        System.out.println(count);

        return null;
    }
}
