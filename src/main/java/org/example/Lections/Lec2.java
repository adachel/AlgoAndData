package org.example.Lections;

public class Lec2 {
    public Lec2() {
    }

    // пузырьковая сортировка
    public void bubbleSort(int[] array){    // O(n^2)
        boolean finish = true;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        }while (!finish);
    }

    // сортировка выбором
    public void directSort(int[] array){    // O(n^2)
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]){
                    minPosition = j;
                }
            }
            if (i != minPosition){
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }

    // сортировка вставками
    public void insertSort(int[] array){    // O(n^2)
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // поиск значения в массиве
    public int findNumber(int[] array, int value){  //O(n)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    // бинарный поиск
    public int binarySearch(int[] array, int value, int min, int max){  // O(log(n))
        int midPoint;
        if (max < min){
            return -1;
        }else {
            midPoint = (max - min) / 2 + min;
        }

        if (array[midPoint] < value){
            return binarySearch(array, value, midPoint + 1, max);
        }else {
            if (array[midPoint] > value){
                return binarySearch(array, value, min, midPoint - 1);
            }else {
                return midPoint;
            }
        }

    }

    // быстрая сортировка
    public void quickSort(int[] array, int startPosition, int endPosition){    // O(nlog(n))
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {
            while (array[leftPosition] < pivot){
                leftPosition++;
            }
            while (array[rightPosition] > pivot){
                rightPosition--;
            }
            if (leftPosition <= rightPosition){
                if (leftPosition < rightPosition){
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        }while (leftPosition <= rightPosition);
        if (leftPosition < endPosition){
            quickSort(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition){
            quickSort(array, startPosition, rightPosition);
        }
    }

    // пирамидальная сортировка
    public void heapSort(int[] array){  // O(nlog(n))
        // построение кучи(перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0 ; i--) {
            heapify(array, array.length, i);
        }
        // один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0 ; i--) {
            // перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // вызываем процедуру heapifi на уменьшенной куче
            heapify(array, i, 0);
        }
    }
    private void heapify(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex;    // инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1; // левый
        int rightChild = 2 * rootIndex + 2; // правый

        // если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest]){
            largest = leftChild;
        }

        // если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest]){
            largest = rightChild;
        }

        // если самый большой элемент не корень
        if (largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            // рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array, heapSize, largest);
        }
    }
}
