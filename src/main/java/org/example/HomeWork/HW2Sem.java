package org.example.HomeWork;

import java.util.Arrays;

public class HW2Sem {
    public HW2Sem() {
    }
    // Задание1. Сортировка массива задач по приоритету(HeapSort)
    private void heapify(int[] arr, int n, int i){   // одна группа корень - левый - правый, сортируется, наибольший становится корнем
        int root = i; // наибольший элемент как корень
        int left = 2 * i + 1;   // левый
        int right = 2 * i + 2; // правый

        if (left < n){  // входит ли элемент с индексом left массив
            if (arr[left] > arr[root]){ // сравнивает сам элемент с корнем
                root = left;    // если левый элемент больше, то коренному элементу присваивается индекс левого элемента
            }
        }

        if (right < n){ // входит ли элемент с индексом right массив
            if (arr[right] > arr[root]){    // сравнивает сам элемент с корнем
                root = right;   // если правый элемент больше, то коренному элементу присваивается индекс правого элемента
            }
        }

        if (root != i){  // если индекс корня (уже наибольшего элемента в данный момент) не равен начальному
            int temp = arr[i];
            arr[i] = arr[root];
            arr[root] = temp;    // меняем элемент с начальным индексом на максимальный полученный элемент

            heapify(arr, n, i);  // повторяем рекурсивно
        }
    }
    public int[] sortTasksByPriority(int[] arr){

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }

        return arr;
    }


    //Задача2. Сортировка номеров телефонов по разрядам (RadixSort). Напишите функцию sortPhoneNumbers,
    // которая сортирует номера телефонов в порядке возрастания с использованием по разрядной сортировки (RadixSort).

    private void countingSort(long[] arr, int exp){
        int n = arr.length;
        long[] output = new long[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++){
            count[(int)((arr[i] / exp) % 10)]++;
        }

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--){
            output[count[(int)((arr[i] / exp) % 10)] - 1] = arr[i];
            count[(int)((arr[i] / exp) % 10)]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }
    public long[] sortFoneNumbers(long[] arr){
        long max = Arrays.stream(arr).max().getAsLong();    // находим max в заданном массиве
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);

        return arr;
    }
}
