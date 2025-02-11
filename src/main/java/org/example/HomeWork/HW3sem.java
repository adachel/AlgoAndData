package org.example.HomeWork;

public class HW3sem {
    public HW3sem() {
    }

    public static class SinglyNode{
        int value;
        SinglyNode next;

        @Override
        public String toString() {
            return "SinglyNode{" +
                    "value = " + value +
                    '}';
        }
    }
    public static class SinglyList{
        SinglyNode head;

        public SinglyList() {
            this.head = head;
        }

        public void addPush(int value){
            SinglyNode node = new SinglyNode();
            node.value = value;
            if (head == null){
                head = node;
            }else {
                node.next = head;
                head = node;
            }
        }

        // Task 1. Удаление дубликатов в односвязном списке
        public void removeDuplicates(){
            SinglyNode temp = head;
            while (temp != null){
                SinglyNode current = temp;
                int value = current.value;
                while (current.next != null){
                    if (value != current.next.value){
                        current = current.next;
                    }else {
                        current.next = current.next.next;
                    }
                }
                temp = temp.next;
            }
        }

        // Task 2. Поиск среднего элемента в односвязном списке
        public SinglyNode findMiddle(SinglyList list){
            SinglyNode slow = list.head;
            SinglyNode fast = list.head;
            SinglyNode result = list.head;
            while (fast != null){
                if (fast.next == null){
                    break;
                }else {
                    fast = fast.next.next;
                }
                slow = slow.next;
            }
            result = slow;
            return result;
        }


        // Task 4. Слияние двух отсортированных односвязных списков в один отсортированный.
        public SinglyList mergeTwoLists(SinglyList listOne, SinglyList listTwo){
            SinglyList result = new SinglyList();
            SinglyList temp = new SinglyList();
            SinglyNode curOne = listOne.head;
            SinglyNode curTwo = listTwo.head;

            while (curOne != null || curTwo != null){
                if (curTwo == null){
                    temp.addPush(curOne.value);
                    curOne = curOne.next;
                }else if (curOne == null){
                    temp.addPush(curTwo.value);
                    curTwo = curTwo.next;
                }else if (curOne.value < curTwo.value){
                    temp.addPush(curOne.value);
                    curOne = curOne.next;
                }else {
                    temp.addPush(curTwo.value);
                    curTwo = curTwo.next;
                }
            }

            SinglyNode nodeTemp = temp.head;
            while (nodeTemp != null){
                result.addPush(nodeTemp.value);
                nodeTemp = nodeTemp.next;
            }

            return result;
        }

        // Эталонное решение
        public static class ListNode {
            int val;
            ListNode next;

            public ListNode(int val) {
                this.val = val;
            }

        }
        public static class MergeSortedLists{
            public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
                ListNode dummy = new ListNode(-1); //Временный узел
                ListNode current = dummy;
                while(l1 != null && l2 != null){
                    if(l1.val < l2.val){
                        current.next = l1;
                        l1 = l1.next;
                    }else{
                        current.next = l2;
                        l2 = l2.next;
                    }
                    current=current.next;
                }
                //Добавляем оставшиеся элементы одного из списков
                current.next = (l1 != null) ? l1 : l2;
                return dummy.next;
            }

            public static void printList(ListNode head){
                while(head != null) {
                    System.out.print(head.val + "->");
                    head = head.next;
                }
                System.out.println("null");
            }
        }



        @Override
        public String toString() {
            String string = "";
            SinglyNode current = head;
            while (current != null){
                string = string + current.value + " ";
                current = current.next;
            }
            return string;
        }
    }


}
