package org.example.HomeWork;

// Задание. Преобразование дерева поиска в красно-черное дерево Вам дано бинарное дерево поиска.
// Напишите метод, который преобразует его в левостороннее красно-черное дерево (РЧД).
// Красно-черное дерево должно удовлетворять следующим критериям:
//      1. Каждая нода имеет цвет (красный или черный).
//      2. Корень дерева всегда черный.
//      3. Новая нода всегда красная.
//      4. Красные ноды могут быть только левыми дочерними элементами.
//      5. У красной ноды все дочерние элементы черного цвета. Для этого, реализуйте методы добавления
//          новых элементов с балансировкой и выполняйте следующие операции для поддержания свойств РЧД:
//          ● Левый малый поворот
//          ● Правый малый поворот
//          ● Смена цвета
//      Критерии применения этих операций:
//      ● Если правый дочерний элемент красный, а левый черный, то применяем малый правый поворот.
//      ● Если левый дочерний элемент красный и его левый дочерний элемент тоже красный, то применяем малый левый поворот.
//      ● Если оба дочерних элемента красные, то делаем смену цвета.
//      ● Если корень стал красным, то перекрашиваем его в черный.

public class HW4Sem {
    public static class Node{
        int value;
        Node left;
        Node right;
        Color color;

        @Override
        public String toString() {
            return "Node{" +
                    "value= " + value +
                    ", color= " + color +
                    '}';
        }
    }

    enum Color {
        BLACK, RED
    }

    public static class Tree{
        Node root;

        private void swapColors(Node node){     // обмен цвета
            node.color = (node.color == Color.RED ? Color.BLACK : Color.RED);       // через тернарный оператор
            node.left.color = Color.BLACK;
            node.right.color = Color.BLACK;
        }

        private Node leftRotate(Node node){         // левый поворот
            Node cur = node.right;
            node.right = cur.left;
            cur.left = node;

            cur.color = node.color;
            node.color = Color.RED;
            return cur;
        }

        private Node rightRotate(Node node){         // правый поворот
            Node cur = node.left;
            node.left = cur.right;
            cur.right = node;

            cur.color = node.color;
            node.color = Color.RED;
            return cur;
        }

        private Node balance(Node node){        // балансировка
            boolean flag = true;
            Node cur = node;
            do {
                flag = false;
                if (cur.right != null &&
                        cur.right.color == Color.RED && (
                        cur.left == null ||
                                cur.left.color == Color.BLACK)){
                    cur = leftRotate(cur);
                    flag = true;
                }
                if (cur.left != null &&
                        cur.left.color == Color.RED &&
                        cur.left.left != null &&
                        cur.left.left.color == Color.RED){
                    cur = rightRotate(cur);
                    flag = true;
                }
                if (cur.left != null &&
                        cur.left.color == Color.RED &&
                        cur.right != null &&
                        cur.right.color == Color.RED){
                    swapColors(cur);
                    flag = true;
                }
            }while (flag);
            return cur;
        }

        public void add(int value){     // вставка элемента в дерево
            if (root != null){
                insert(root, value);
                root = balance(root);       // добавили с балансировкой
            }else {
                root = new Node();
                root.value = value;
            }
            root.color = Color.BLACK;
        }

        private void insert(Node node, int value){
            if (node.value != value){
                if (node.value < value){
                    if (node.right == null){
                        node.right = new Node();
                        node.right.value = value;
                        node.right.color = Color.RED;
                    }else {
                        insert(node.right, value);
                        node.right = balance(node.right);
                    }
                }else {
                    if (node.left == null){
                        node.left = new Node();
                        node.left.value = value;
                        node.left.color = Color.RED;
                    }else {
                        insert(node.left, value);
                        node.left = balance(node.left);
                    }
                }
            }
        }

        private Node serviceFind(Node node, int value){
            if (node == null){
                return null;
            }
            if (node.value == value){
                return node;
            }
            if (node.value < value){
                return serviceFind(node.right, value);
            }else {
                return serviceFind(node.left, value);
            }
        }

        public Node find(int value){        // поиск элемента
            return serviceFind(root, value);
        }
    }
}





















