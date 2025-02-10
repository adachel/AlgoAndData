package org.example.Lections;

public class Lec3 {
    Node head;                                              // начало списка
    Node tail;                                              // конец списка для двусвязного списка

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static class Node {
        int value;                                          // значение ноды
        Node next;                                          // ссылка на следующую ноду
        Node previous;                                      //// предыдущая нода для двусвязного списка
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ОДНОСВЯЗНЫЙ СПИСОК

//    public void revert(){                                   // разворот односвязного списка
//        if (head != null && head.next != null){
//            Node temp = head;
//            revertService(head.next, head);
//            temp.next = null;
//        }
//    }
//    private void revertService(Node currentNode, Node previousNode){
//        if (currentNode.next == null){
//            head = currentNode;
//        }else {
//            revertService(currentNode.next, currentNode);
//        }
//        currentNode.next = previousNode;
//    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ДВУСВЯЗНЫЙ СПИСОК

//        public Node find(int value){                        // поиск значения в двусвязном списке. Сложность O(n)
//        Node currentNode = head;                            // текущая нода, начинается с головы
//        while (currentNode != null) {                       // до тех пор, пока текущая нода не null
//            if (currentNode.value == value){                // если значение текущей ноды равно искомому значению
//                return currentNode;                         // возвращаем текущую ноду
//            }
//            currentNode = currentNode.next;                 // если нет, текущая нода равна следующей
//        }
//        return null;                                        // если ноды с таким значением нет, то возвращаем null
//    }

//        public void add(int value, Node node){              // вставка элемента в двусвязный список.
//                                                            // value - вставляемое значение, node - нода,
//                                                            // после которой нужно вставить значение.
//        Node newNode = new Node();                          // создаем пустую ноду
//        Node next = node.next;                              // нода next = следующей ноде
//        newNode.value = value;                              // значение новой ноды = вставляемому значению
//        node.next = newNode;                                // следующая нода = новой ноде
//        newNode.previous = node;                            // для новой ноды, предыдущая нода = текущей
//        if (next == null){                                  // если нет хвоста
//            tail = newNode;                                 // хвост становится новой нодой
//        }else {                                             // иначе создаем ссылки
//            next.previous = newNode;
//            newNode.next = next;
//        }
//    }

//        public void addToTail(int value){                   // вставка элемента в двусвязный список, в хвост
//        Node node = new Node();                             // создаем пустую ноду
//        node.value = value;                                 // присваиваю искомое значение значению созданной ноды
//        if (head == null){                                  // если голова списка равна null
//            head = node;                                    // голова становится созданной нодой
//            tail = node;                                    // хвост становится созданной нодой
//        }else {                                             // если голова не пустая
//            tail.next = node;                               // хвост ссылается на созданную ноду
//            node.previous = tail;                           // ссылка на предыдущую, которая была хвостом
//            tail = node;                                    // хвост становится созданной нодой
//        }
//    }

//        public void delete(Node node){                      // удаление ноды в двусвязном списке
//        Node previous = node.previous;                      // создаем переменную previous и даем значение предыдущей ноды
//        Node next = node.next;                              // создаем переменную next и даем значение следующей ноды
//        if (previous == null){                              // если удаляемый элемент хвост
//            next.previous = null;
//            head = next;
//        }else {
//            if (next == null){                              // если удаляемый элемент голова
//                previous.next = null;
//                tail = previous;
//            }else {
//                previous.next = next;
//                next.previous = previous;
//            }
//        }
//    }

//    public void revert(){                                   // разворот двусвязного списка
//        Node currentNode = head;                            // текущая нода = голове
//        while (currentNode != null){
//            Node next = currentNode.next;
//            Node previous = currentNode.previous;
//            currentNode.next = previous;
//            currentNode.previous = next;
//            if (previous == null){
//                tail = currentNode;
//            }
//            if (next == null){
//                head = currentNode;
//            }
//            currentNode = next;
//        }
//    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// СТЭК (работает в односвязном списке)

//    public void push(int value){                            // добавление в стек
//        Node node = new Node();
//        node.value = value;
//        node.next = head;
//        head = node;
//    }

//    public Integer pop(){                                   // извлечение из стека
//        Integer result = null;
//        if (head != null){
//            result = head.value;
//            head = head.next;
//        }
//        return result;
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ОЧЕРЕДЬ (работает в двусвязном списке)

//    public void push(int value){                            // добавление в очередь
//        Node node = new Node();
//        node.value = value;
//        node.next = head;
//        head.previous = node;
//        head = node;
//    }

//    public Integer peek(){                                  // забираем из очереди
//        Integer result = null;
//        if (tail != null){
//            result = tail.value;
//            tail.previous.next = null;
//            tail = tail.previous;
//        }
//        return result;
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
