package org.example.Lections.Lec4;

import java.util.ArrayList;
import java.util.List;

public class Lec4 {
    public static class Node {
        int value;
        List<Node> children;
    }
    public static class Tree {
        Node root;

        // Обход в глубину
//        public boolean exist(int value){
//            if (root != null){
//                Node node = find(root, value);
//                if (node != null){
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        private Node find(Node node, int value){        // поиск интересующей ноды
//            if (node.value == value){
//                return node;
//            }else {
//                for (Node child : node.children){
//                    Node result = find(child, value);
//                    if (result != null){
//                        return result;
//                    }
//                }
//            }
//            return null;
//        }

        // Обход в ширину
//        private Node find(int value){
//            List<Node> line = new ArrayList<>();     // текущая линия
//            line.add(root);
//            while (line.size() > 0){
//                List<Node> nextLine = new ArrayList<>();
//                for (Node node: line){
//                    if (node.value == value){
//                        return node;
//                    }
//                    nextLine.addAll(node.children);
//                }
//                line = nextLine;
//            }
//            return null;
//        }


    }
}
