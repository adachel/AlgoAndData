package org.example.Seminars;

import java.util.ArrayList;
import java.util.List;

public class Sem4 {

    // красно-черное дерево
//    enum Color{
//        BLACK,
//        RED
//    }
//
//    public static class Node {
//        int value;
//        Node left;
//        Node right;
//        Color color;        // добавляется для красно-черного дерева
//    }
//    public static class Tree {
//        Node root;
//
//        public void add(int value){     // вставка элемента в дерево
//            if (root != null){
//                insert(root, value);
//                root = balance(root);       // добавили с балансировкой
//            }else {
//                root = new Node();
//                root.value = value;
//            }
//            root.color = Color.BLACK;
//        }
//        private void insert(Node node, int value){
//            if (node.value != value){
//                if (node.value < value){
//                    if (node.right == null){
//                        node.right = new Node();
//                        node.right.value = value;
//                        node.right.color = Color.RED;
//                    }else {
//                        insert(node.right, value);
//                        node.right = balance(node.right);
//                    }
//                }else {
//                    if (node.left == null){
//                        node.left = new Node();
//                        node.left.value = value;
//                        node.right.color = Color.RED;
//                    }else {
//                        insert(node.left, value);
//                        node.left = balance(node.left);
//                    }
//                }
//            }
//        }
//
//
//        public Node find(int value){        // поиск элемента
//
//
//            return serviceFind(root, value);
//        }
//        private Node serviceFind(Node node, int value){
//            if (node == null){
//                return null;
//            }
//            if (node.value == value){
//                return node;
//            }
//            if (node.value < value){
//                return serviceFind(node.right, value);
//            }else {
//                return serviceFind(node.left, value);
//            }
//        }
//
//
//        // для красно-черного дерева
//        private void swapColors(Node node){     // обмен цвета
////            if (node.color == Color.RED){
////                node.color = Color.BLACK;
////            }
//            node.color = (node.color == Color.RED ? Color.BLACK : Color.RED);       // через тернарный оператор
//            node.left.color = Color.BLACK;
//            node.right.color = Color.BLACK;
//        }
//
//        private Node leftRotate(Node node){         // левый поворот
//            Node cur = node.right;
//            node.right = cur.left;
//            cur.left = node;
//
//            cur.color = node.color;
//            node.color = Color.RED;
//            return cur;
//        }
//
//        private Node rightRotate(Node node){         // правый поворот
//            Node cur = node.left;
//            node.left = cur.right;
//            cur.right = node;
//
//            cur.color = node.color;
//            node.color = Color.RED;
//            return cur;
//        }
//
//        private Node balance(Node node){        // балансировка
//            boolean flag = true;
//            Node cur = node;
//            do {
//                flag = false;
//                if (cur.right != null && cur.right.color == Color.RED && (cur.left == null || cur.left.color == Color.BLACK)){
//                    cur = leftRotate(cur);
//                    flag = true;
//                }
//                if (cur.left != null && cur.left.color == Color.RED && cur.left.left != null && cur.left.left.color == Color.RED){
//                    cur = rightRotate(cur);
//                    flag = true;
//                }
//                if (cur.left != null && cur.left.color == Color.RED && cur.right != null && cur.right.color == Color.RED){
//                    swapColors(node);
//                    flag = true;
//                }
//
//            }while (flag);
//            return cur;
//        }
//    }
    /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // HashMap
    public static class Entity{         // класс сущности
        int key;
        int value;

    }

    public static class Node{
        Entity entity;              // сущность
        Node next;                  // ссылка на следующий элемент
    }

    public static class Basket{         // класс список или корзина
        Node head;

        private boolean pushService(Entity entity){
            Node node = new Node();
            node.entity = entity;
            if (head == null){
                head = node;
            }else {
                Node cur = head;
                while (cur.next != null){
                    if (cur.entity.key == entity.key){
                        return false;
                    }
                    cur = cur.next;
                }
                cur.next = node;
            }
            return true;
        }

        private boolean remove(int key){
            if (head != null) {
                if (head.entity.key == key){
                    head = head.next;
                }else {
                    if (head.next == null){
                        Node cur = head;
                        while (cur != null) {
                            if (cur.entity.key == key) {
                                cur.next = cur.next.next;
                                return true;
                            }
                            cur = cur.next;
                        }
                    }
                }
            }
            return false;
        }

        private Integer find(int key){
            Node cur = head;
            while (cur != null) {
                if (cur.entity.key == key) {
                    return cur.entity.value;
                }
                cur = cur.next;
            }
            return null;
        }
    }

    public static class HashMap{
        static final int INIT_SIZE = 16;    // первоначальны размер
        Basket[] baskets;

        public HashMap() {
            this(INIT_SIZE);
        }
        public HashMap(int size) {
            baskets = new Basket[size];
        }

        private int getIndex(int key){      // индекс по ключу
            return key % baskets.length;    // нашли индекс в массиве, где лежит элемент
        }

        public boolean push(int key, int value){
            int index = getIndex(key);              // узнаем индекс
            Basket basket = baskets[index];         // достаем корзинку по индексу
            if (basket == null){                    // если корзинки нет
                basket = new Basket();              // создаем корзинку
                baskets[index] = basket;            // помещаем по индексу
            }
            Entity entity = new Entity();
            entity.key = key;
            entity.value = value;
            return basket.pushService(entity);
        }

        public boolean remove(int key){             // удаление
            int index = getIndex(key);              // узнаем индекс
            Basket basket = baskets[index];         // достаем корзинку по индексу
            if (basket != null){
                return basket.remove(key);
            }
            return false;
        }

        public Integer find(int key){
            int index = getIndex(key);              // узнаем индекс
            Basket basket = baskets[index];         // достаем корзинку по индексу
            if (basket != null){
                return basket.find(key);
            }
            return null;
        }
    }


}
