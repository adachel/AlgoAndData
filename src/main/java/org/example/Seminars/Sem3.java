package org.example.Seminars;

public class Sem3 {
    public Sem3() {
    }

    // Task 1. Реализуйте односвязный список
    public static class SinglyNode {                  // для хранения элементов
        int value;                              // значение
        SinglyNode next;                              // объект next как ссылка на следующий элемент
    }


    public static class SinglyList {                  // для хранения самого списка
        SinglyNode head;                 // ссылка только на начало, головной элемент списка

    // Task 2. Реализовать добавление и удаления данных из начала списка
        public void pushFront(int value){       // добавление в начало списка
            SinglyNode newNode = new SinglyNode();          // создаю новую ноду
            newNode.value = value;              // записываю значение в новой ноде
            if (head != null) {                 // если голова есть
                newNode.next = head;            // Записываю в новой ноде ссылку на следующую ноду, т.е. Текущую голову
            }
            head = newNode;                     // головой становится новая нода
        }

        public void popFront(){                 // удаление из начала списка
            if (head != null){                  // если голова есть
                if (head.next != null){         // если за головой есть следующий элемент
                    head = head.next;           // тогда следующий становится головой
                }else {
                    head = null;
                }
            }else {
                System.out.println("List is null");
            }
        }


    // Task 3. Проверка вхождения элемента в список
        public boolean contains(int value){
            if (head != null){
                SinglyNode cur = head;
                while (cur != null){
                    if (cur.value == value){
                        return true;
                    }else {
                        cur = cur.next;
                    }
                }
            }
            return false;
        }


    // Task 4. Добавление и удаление последнего элемента
        public void pushBack(int value){
            SinglyNode newNode = new SinglyNode();
            newNode.value = value;
            SinglyNode cur = head;
//            Node temp = null;             // моя реализация
//            while (cur != null){
//                temp = cur;
//                cur = cur.next;
//            }
//            if (temp != null) {
//                temp.next = newNode;
//            }

            if (head == null){
                head = newNode;
            }else {
                while (cur.next != null){
                    cur = cur.next;
                }
                cur.next = newNode;
            }
        }

        public void popBack(){
//            Node cur = head;
//            Node temp = null;       // моя реализация
//            while (cur.next != null){
//                temp = cur;
//                cur = cur.next;
//            }
//            if (temp != null) {
//                temp.next = null;
//            }

            if (head != null){
                if (head.next == null){
                    head = null;
                }else {
                    SinglyNode cur = head;
                    while (cur.next.next != null){
                        cur = cur.next;
                    }
                    cur.next = null;
                }
            }
        }

        @Override
        public String toString() {
            String string = "";
            SinglyNode cur = head;
            while (cur != null){
                string = string  + cur.value + " ";
                cur = cur.next;
            }
            return string;
        }
    }

    // Task 5. Преобразовать в двусвязный список
    public static class Node{
        int value;
        Node next;
        Node previous;
    }

    public static class List{
        Node head;
        Node tail;

        // Task 6. Модифицировать методы для двусвязного списка

        public void pushFront(int value){       // добавление в начало списка
            Node newNode = new Node();
            newNode.value = value;
            if (head != null) {
                newNode.next = head;
                head.previous = newNode;
//                head = newNode;
            }else {
//                head = newNode;
                tail = newNode;
            }
            head = newNode;
        }

        public void popFront(){                 // удаление из начала списка
//            if (head != null){
//                if (head.next != null){
//                    head = head.next;
//                    head.previous = null;
//                }else {
//                    head = null;
//                    tail = null;
//                }
//            }else {
//                System.out.println("List is null");
//            }

            if (head != null){
                if (head.next == null){
                    head = null;
                    tail = null;
                }else {
                    head = head.next;
                }
            }else {
                System.out.println("List is null");
            }
        }


        public void pushBack(int value){        // добавление в конец
            Node newNode = new Node();
            newNode.value = value;

            if (tail == null){
                head = newNode;
//                tail = newNode;
            }else {
                newNode.previous = tail;
                tail.next = newNode;
//                tail = newNode;
            }
            tail = newNode;
        }

        public void popBack(){                  // удаление последнего
//            if (tail != null){
//                if (tail.previous != null){
//                    tail = tail.previous;
//                    tail.next = null;
//                }else {
//                    tail = null;
//                    head = null;
//                }
//            }else {
//                System.out.println("List is null");
//            }

            if (tail != null){
                if (tail.previous == null){
                    tail = null;
                    head = null;
                }else {
                    tail = tail.previous;
                }
            }else {
                System.out.println("List is null");
            }
        }

        // Task 7. Сортировка связного списка
        public void sortList(List list){
//            Node cur = head;
//            Node count = head;
//            while (count != null){
//                while (cur.next != null){
//                    if (cur.value > cur.next.value){
//                        Node temp = new Node();
//                        temp.value = cur.value;
//                        cur.value = cur.next.value;
//                        cur.next.value = temp.value;
//                    }
//                    cur = cur.next;
//                }
//                cur = head;
//                count = count.next;
//            }

            boolean needSort = true;
            do {
                needSort = false;
                Node node = head;
                while (node != null && node.next != null){
                    if (node.value > node.next.value){
                        Node before = node.previous;
                        Node cur = node;
                        Node next = node.next;
                        Node after = node.next.next;

                        cur.previous = next;
                        cur.next = after;
                        next.previous = before;
                        next.next = cur;

                        if (before != null){
                            before.next = next;
                        }else {
                            head = next;
                        }

                        if (after != null){
                            after.previous = cur;
                        }else {
                            tail = cur;
                        }

                        needSort = true;
                    }
                    node = node.next;
                }
            }while (needSort);
        }

        @Override
        public String toString() {
            String string = "";
            Node cur = head;
            while (cur != null){
                string = string  + cur.value + " ";
                cur = cur.next;
            }
            return string;
        }
    }
}
