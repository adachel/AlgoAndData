package org.example;

import org.example.HomeWork.HW3sem;

import java.util.*;

import static org.example.HomeWork.HW3sem.SinglyList.MergeSortedLists.mergeTwoLists;
import static org.example.HomeWork.HW3sem.SinglyList.MergeSortedLists.printList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Задайте число");
//        int num = Integer.parseInt(scanner.nextLine());

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // HOMEWORK Seminar 3
        HW3sem.SinglyList list1 = new HW3sem.SinglyList();
        HW3sem.SinglyList list2 = new HW3sem.SinglyList();
        HW3sem.SinglyList list = new HW3sem.SinglyList();

        for (int i = 11; i > 0; i = i - 2) {
                list1.addPush(i);
        }
        for (int i = 100; i > 12; i = i - 2) {
            list2.addPush(i);
        }
        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list.mergeTwoLists(list1, list2));

        HW3sem.SinglyList.ListNode listNode1 = null;
        HW3sem.SinglyList.ListNode listNode2 = null;
        for (int i = 0; i < 9; i++) {
            listNode1 = new HW3sem.SinglyList.ListNode(i);
        }

        for (int i = 0; i < 9; i++) {
            listNode2 = new HW3sem.SinglyList.ListNode(i);
        }

        HW3sem.SinglyList.ListNode mergedList = mergeTwoLists(listNode1, listNode2);

        System.out.println("MergedList:");
        printList(mergedList);


//        list1.removeDuplicates();
//        System.out.println(list1);

//        System.out.println(list1.findMiddle(list1));

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Sem3 sem3 = new Sem3();
//        Sem3.List list = new Sem3.List();
//
//        for (int i = 1; i < 6; i++) {
//            list.pushFront(i);
//        }
//        System.out.println(list);
//
//        list.sortList(list);
//        System.out.println(list);

//        list.popFront();
//        list.popFront();
//        list.popFront();
//        list.popFront();
//        System.out.println(list);

//        for (int i = 1; i < 3; i++) {
//            list.pushBack(i);
//        }
//        System.out.println(list);
//
//        list.popBack();
//        System.out.println(list);
//        list.popBack();
//        System.out.println(list);
//        list.popBack();
//        System.out.println(list);
//        list.popBack();
//        System.out.println(list);

//        Sem3.SinglyList list = new Sem3.SinglyList();
//        for (int i = 1; i < 2; i++) {
//            list.pushFront(i);
//        }
//        System.out.println(list);
//
//        boolean temp = true;
//        while (temp){
//            System.out.println("Удалить первый элемент? 'y' или любое нажатие");
//            String ch = (scanner.nextLine());
//            if (ch.equals("y")){
//                list.popFront();
//                System.out.println(list);
//            }else temp = false;
//        }
//        System.out.println(list);
//
//        temp = true;
//        while (temp){
//            System.out.println("Задайте элемент, который нужно найти. Для выхода '-1'");
//            num = Integer.parseInt(scanner.nextLine());
//            if (num == -1){
//                temp = false;
//            }
//            if (list.contains(num)){
//                System.out.println("Элемент есть в списке");
//            }else System.out.println("Такого элемента нет");
//        }
//
//        System.out.println("Задайте элемент, который нужно добавить в конец списка");
//        int num = Integer.parseInt(scanner.nextLine());
//        list.pushBack(num);
//        System.out.println(list);
//
//        list.popBack();
//        System.out.println(list);

   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        HW2Sem hw2Sem = new HW2Sem();
//        int[] tasks = {3, 1, 4, 2, 5};
//        long[] phoneNumbers = {9876543210L, 1234567890L, 5555555555L, 1000000000L};
//        String text =   "Hello World";
        // task 1
//        System.out.println(Arrays.toString(hw2Sem.sortTasksByPriority(tasks)));

        // task 2
//        System.out.println(Arrays.toString(hw2Sem.sortFoneNumbers(phoneNumbers)));

        // task 3
//        hw2Sem.countLetters(text);


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
//        Lec2 lec2 = new Lec2();
//        int[] myArray = new int[]{5, 3, 7, 1, 9, 2, 4, 6, 0, 8};
//        lec2.bubbleSort(myArray);
//        lec2.directSort(myArray);
//        lec2.insertSort(myArray);
//        lec2.quickSort(myArray, 0, myArray.length - 1);
//        lec2.heapSort(myArray);
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(lec2.binarySearch(myArray, 7, 0, myArray.length - 1));
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Sem2 sem2 = new Sem2();
//        int[] array1 = sem2.createArray(50000);
//        System.out.println(Arrays.toString(array));
//        System.out.println("-----------------------------------------------------------------------------------------");
//        Date start_var1 = new Date();
//        System.out.println(Arrays.toString(sem2.bubbleSortSimpleVar(array)));
//        sem2.bubbleSortSimpleVar(array1);
//        Date fin_var1 = new Date();
//        System.out.println((fin_var1.getTime() - start_var1.getTime()) / 1000);
//
//        System.out.println();
//
//        int[] array2 = sem2.createArray(50000);
//        Date start_var2 = new Date();
//        System.out.println(Arrays.toString(sem2.bubbleSortTeacherVar(array2)));
//        sem2.bubbleSortTeacherVar(array2);
//        Date fin_var2 = new Date();
//        System.out.println((fin_var2.getTime() - start_var2.getTime()) / 1000);
//
//        System.out.println();

//        int[] array3 = sem2.createArray(50000000);
//        Date start_var3 = new Date();
//        System.out.println(Arrays.toString(sem2.quickSort(array3)));
//        sem2.quickSort(array3);
//        Date fin_var3 = new Date();
//        System.out.println((fin_var3.getTime() - start_var3.getTime()) / 1000);
//
//        System.out.println(sem2.binarySearch(array3, 56));
    }
}